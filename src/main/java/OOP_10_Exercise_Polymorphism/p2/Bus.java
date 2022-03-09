package OOP_10_Exercise_Polymorphism.p2;

import java.text.DecimalFormat;

public class Bus extends Vehicle {
    public static final double fuelConsumptionClimatic = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    public String driveEmpty(double distance) {
        DecimalFormat decimal = new DecimalFormat("##.##");
        if (this.getFuelConsumption() * distance <= this.getFuelQuantity()) {
            setFuelQuantity(this.getFuelQuantity() - this.getFuelConsumption() * distance);
            return String.format("Bus travelled %s km", decimal.format(distance));
        } else {
            return "Bus needs refueling";
        }
    }

    @Override
    public String drive(double distance) {
        DecimalFormat decimal = new DecimalFormat("##.##");
        if ((this.getFuelConsumption() + fuelConsumptionClimatic) * distance <= this.getFuelQuantity()) {
            setFuelQuantity(this.getFuelQuantity() - (this.getFuelConsumption() + fuelConsumptionClimatic) * distance);
            return String.format("Bus travelled %s km", decimal.format(distance));
        } else {
            return "Bus needs refueling";
        }
    }

    @Override
    void refuel(double liters) {
        if(liters>0){
            if (getFuelQuantity() + liters < getTankCapacity()) {
                setFuelQuantity(getFuelQuantity() + liters);
            } else {
                System.out.println("Cannot fit fuel in tank");
            }
        }else {
            System.out.println("Fuel must be a positive number");
        }


    }
}
