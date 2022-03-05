package OOP_07_Interfaces_and_Abstraction.CarShopExtend;

public interface Rentable extends  Car{
    public Integer getMinRentDay();
    public Double getPricePerDay();
}
