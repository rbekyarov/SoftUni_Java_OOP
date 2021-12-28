package OOP_04_Exercise_Encapsulation.P4PizzaCaloriesNOTFINISH;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.toppingType = toppingType;
        this.weight = weight;
    }

    private void setToppingType(String toppingType) {
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }
    public double calculateCalories (){
        return 0;
    }
}
