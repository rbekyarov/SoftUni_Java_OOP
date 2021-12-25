package OOP_03_Encapsulation.P2SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percent) {
        if (this.getAge() < 30) {
            setSalary(getSalary() + (getSalary() * percent / 200));
        } else {
            setSalary(getSalary() + (getSalary() * percent / 100));
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva",firstName,lastName,getSalary());
    }
}
