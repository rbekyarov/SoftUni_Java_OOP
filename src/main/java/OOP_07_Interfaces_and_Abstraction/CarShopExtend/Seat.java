package OOP_07_Interfaces_and_Abstraction.CarShopExtend;

import java.io.Serializable;

public class Seat extends CarImpl implements Car, Sellable {
    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;

    }


    @Override
    public String toString() {
        return String.format("%s sells for %f", getModel(), this.getPrice());
    }

    @Override
    public Double getPrice() {
        return this.price;

    }
}
