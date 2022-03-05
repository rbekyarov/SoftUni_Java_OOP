package OOP_06_Exercise_Inheritance.Restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert {
    private static double CAKE_GRAMS = 250;
    private static double CAKE_CALORIES = 1000;
    private static BigDecimal CAKE_PRICE = new BigDecimal(5);

    public Cake(String name, BigDecimal price, double grams, double calories) {
        super(name, CAKE_PRICE, CAKE_GRAMS, CAKE_CALORIES);
    }

    public Cake(String name) {
        super(name, CAKE_PRICE, CAKE_GRAMS, CAKE_CALORIES);
    }
}
