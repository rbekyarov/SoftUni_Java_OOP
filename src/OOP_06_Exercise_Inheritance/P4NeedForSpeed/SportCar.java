package OOP_06_Exercise_Inheritance.P4NeedForSpeed;

public class SportCar extends Car{
    private final static double DEFAULT_FUEL_CONSUMPTION = 10;

    public SportCar(double fuel, int horsePower){
        super(fuel,horsePower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
