package OOP_10_Exercise_Polymorphism.p2;


import java.text.DecimalFormat;

public class Car extends Vehicle {
    public static final double fuelConsumptionClimatic = 0.9;
    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption,tankCapacity);
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
    void refuel(double liters) {
        if (liters>0){
            if(getFuelQuantity()+liters<getTankCapacity()){
                setFuelQuantity(getFuelQuantity()+liters);
            }else {
                System.out.println("Cannot fit fuel in tank");
            }
        }else {
            System.out.println("Fuel must be a positive number");
        }


    }

    @Override
    String driveEmpty(double liters) {
        return null;
    }
}
