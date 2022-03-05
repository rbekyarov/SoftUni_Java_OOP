package OOP_08_Exercise_Interfaces_and_Abstraction.BirthdayCelebrations;

import OOP_08_Exercise_Interfaces_and_Abstraction.MultipleImplementation.Identifiable;

public class Citizen implements Identifiable {
    private String name;
    private int age;
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getId() {
        return null;
    }
}
