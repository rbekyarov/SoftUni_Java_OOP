package OOP_10_Exercise_Polymorphism.p1;


import java.text.DecimalFormat;

public class Car extends Vehicle {
    public static final double  fuelConsumptionClimatic =0.9;
    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public String drive(double distance) {
        DecimalFormat decimal = new DecimalFormat("##.##");
        if ((this.getFuelConsumption()+fuelConsumptionClimatic) * distance <= this.getFuelQuantity()) {
            setFuelQuantity(this.getFuelQuantity() - (this.getFuelConsumption()+fuelConsumptionClimatic) * distance);
           return String.format("Car travelled %s km", decimal.format(distance));
        } else {
            return "Car needs refueling";
        }
    }

    @Override
    void Refuel(double liters) {
        setFuelQuantity(getFuelQuantity()+liters);
    }
}
