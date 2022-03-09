package OOP_10_Exercise_Polymorphism.p2;

import java.text.DecimalFormat;

public class Truck extends Vehicle {
    public static final double fuelConsumptionClimatic = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public String drive(double distance) {
        DecimalFormat decimal = new DecimalFormat("##.##");
        if ((this.getFuelConsumption() + fuelConsumptionClimatic) * distance <= this.getFuelQuantity()) {
            this.setFuelQuantity(this.getFuelQuantity() - (this.getFuelConsumption() + fuelConsumptionClimatic) * distance);
            return String.format("Truck travelled %s km", decimal.format(distance));
        } else {
            return "Truck needs refueling";
        }
    }

    @Override
    void refuel(double liters) {
        if(liters>0){
            if ((getFuelQuantity() + liters * 0.95) < getTankCapacity()) {
                setFuelQuantity(getFuelQuantity() + liters * 0.95);
            } else {
                System.out.println("Cannot fit fuel in tank");
            }
        }else {
            System.out.println("Fuel must be a positive number");
        }


    }
}
