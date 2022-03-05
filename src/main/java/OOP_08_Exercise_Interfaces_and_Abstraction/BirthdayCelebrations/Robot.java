package OOP_08_Exercise_Interfaces_and_Abstraction.BirthdayCelebrations;

import OOP_08_Exercise_Interfaces_and_Abstraction.MultipleImplementation.Identifiable;

public class Robot implements Identifiable {

    String id;
    String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
