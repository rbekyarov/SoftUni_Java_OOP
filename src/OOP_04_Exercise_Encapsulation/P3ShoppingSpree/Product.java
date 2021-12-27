package OOP_04_Exercise_Encapsulation.P3ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    private void setName(String name) {
        if (name.length() < 1) {
            throw new IllegalArgumentException("Name cannot be empty");
        } else {
            this.name = name;
        }

    }

    private void setCost(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        } else {
            this.cost = cost;
        }
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}
