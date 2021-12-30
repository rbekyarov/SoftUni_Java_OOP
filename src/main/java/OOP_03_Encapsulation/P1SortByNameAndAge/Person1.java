package OOP_03_Encapsulation.P1SortByNameAndAge;

public class Person1 {
    private String firstName;
    private String lastName;
    private int age;


    public Person1(String firstName, String lastName, int age, double v) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old.", firstName, lastName, age);
    }
}
