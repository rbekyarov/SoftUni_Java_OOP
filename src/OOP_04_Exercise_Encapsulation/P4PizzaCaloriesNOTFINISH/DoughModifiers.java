package OOP_04_Exercise_Encapsulation.P4PizzaCaloriesNOTFINISH;

public enum DoughModifiers {

    White(1.5),
    Wholegrain(1.0),
    Crispy(0.9),
    Chewy(1.5),
    Homemade(1.5);

    private double value;

    DoughModifiers(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
