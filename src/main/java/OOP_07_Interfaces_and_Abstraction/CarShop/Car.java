package OOP_07_Interfaces_and_Abstraction.CarShop;

public interface Car {
    public static final Integer TIRES = 4;

    public String getModel();

    public String getColor();

    public Integer getHorsePower();

    public String countryProduced();
}
