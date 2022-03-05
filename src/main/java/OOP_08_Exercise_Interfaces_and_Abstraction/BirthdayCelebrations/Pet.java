package OOP_08_Exercise_Interfaces_and_Abstraction.BirthdayCelebrations;

public class Pet implements Birthable {

    String name;
    String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }
}
