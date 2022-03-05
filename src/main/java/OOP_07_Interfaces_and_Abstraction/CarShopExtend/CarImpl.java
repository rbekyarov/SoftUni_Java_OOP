package OOP_07_Interfaces_and_Abstraction.CarShopExtend;

public abstract class CarImpl implements Car {
    private final String model;
    private final String color;
    private final Integer horsePower;
    private final String countryProduced;

    public CarImpl(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }



    public String getModel() {
        return this.model;
    }


    public String getColor() {
        return this.color;
    }


    public Integer getHorsePower() {
        return this.horsePower;
    }


    public String countryProduced() {
        return this.countryProduced;
    }
}
