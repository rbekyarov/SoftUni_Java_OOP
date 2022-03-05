package OOP_06_Exercise_Inheritance.Restaurant;

import java.math.BigDecimal;

public class Food extends Product{
    private double grams;

    public Food(String name, BigDecimal price, double grams) {
        super(name, price);
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }
}
