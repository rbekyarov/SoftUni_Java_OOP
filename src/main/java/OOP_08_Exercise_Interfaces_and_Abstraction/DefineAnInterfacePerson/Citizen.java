package OOP_08_Exercise_Interfaces_and_Abstraction.DefineAnInterfacePerson;

public class Citizen implements Person {
    private final String name;
    private final int age;

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
