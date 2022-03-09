package OOP_10_Exercise_Polymorphism.p1;

import java.text.DecimalFormat;

public class Truck extends Vehicle{
    public static final double  fuelConsumptionClimatic =1.6;
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    public String drive(double distance) {
        DecimalFormat decimal = new DecimalFormat("##.##");
        if ((this.getFuelConsumption()+fuelConsumptionClimatic) * distance < this.getFuelQuantity()) {
            this.setFuelQuantity(this.getFuelQuantity() - (this.getFuelConsumption()+fuelConsumptionClimatic) * distance);
            return String.format("Truck travelled %s km", decimal.format(distance));
        } else {
            return "Truck needs refueling";
        }
    }

    @Override
    void Refuel(double liters) {
        this.setFuelQuantity(this.getFuelQuantity()+liters*0.95);
    }
}
