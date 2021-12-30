package OOP_06_Exercise_Inheritance.P4NeedForSpeed;

public class RaceMotorcycle extends Motorcycle {
    private final static double DEFAULT_FUEL_CONSUMPTION = 8;

    public RaceMotorcycle(double fuel, int horsePower){
        super(fuel,horsePower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
