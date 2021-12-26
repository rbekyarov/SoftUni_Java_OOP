package OOP_03_Encapsulation.P4FirstAndReserveTeam;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }


    public boolean validFirstName (String firstName){
        if(firstName.length()<=3){
            return false;
        }
        return true;
    }
    public boolean validLastName (String lastName){
        if(lastName.length()<=3){
            return false;
        }
        return true;
    }
    public boolean validAge (int age){
        if (age<=0){
            return false;
        }
        return true;
    }
    public boolean validSalary(double salary){
        if (salary<=460){
            return false;
        }
        return true;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length()<=3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length()<=3){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");

        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<460){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }
    public void increaseSalary(double bonus) {
        if (this.age >= 30) {
            setSalary(this.salary + ((this.salary * bonus) / 100));
        } else {
            setSalary(this.salary + ((this.salary * bonus) / 200));
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.2f leva",getFirstName(),getLastName(),getSalary());
    }
}
