package OOP_04_Exercise_Encapsulation.P3ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.length() < 1) {
            throw new IllegalArgumentException("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        } else {
            this.money = money;
        }
    }

    public String getName() {
        return name;
    }

    public void buyProduct(Product product) {
        if (money < product.getCost()) {
            throw new IllegalArgumentException(String.format("%s can't afford %s", this.getName(), product.getName()));
        } else {
            System.out.printf("%s bought %s%n", this.getName(), product.getName());
            this.money = this.money - product.getCost();
            this.products.add(product);
            setMoney(money);
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
