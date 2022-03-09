package OOP_10_Exercise_Polymorphism.p2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle car = null;
        Vehicle truck = null;
        Vehicle bus = null;
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        while (count-- > 0) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0].equals("Car")) {
                car = new Car(Double.parseDouble(input[1]), Double.parseDouble(input[2]), Double.parseDouble(input[3]));
            } else if (input[0].equals("Truck")) {
                truck = new Truck(Double.parseDouble(input[1]), Double.parseDouble(input[2]), Double.parseDouble(input[3]));
            }else {
                bus = new Bus(Double.parseDouble(input[1]), Double.parseDouble(input[2]), Double.parseDouble(input[3]));

            }
        }
        int countCommand = Integer.parseInt(scanner.nextLine());
        while (countCommand-- > 0) {
            String[] splitedCommand = scanner.nextLine().split(" ");
            switch (splitedCommand[0]) {
                case "Drive":
                    if (splitedCommand[1].equals("Car")) {

                        System.out.println(car.drive(Double.parseDouble(splitedCommand[2])));

                    } else if (splitedCommand[1].equals("Truck")){

                        System.out.println(truck.drive(Double.parseDouble(splitedCommand[2])));
                    }else {
                        System.out.println(bus.drive(Double.parseDouble(splitedCommand[2])));
                    }
                    break;
                case "Refuel":
                    if (splitedCommand[1].equals("Car")) {
                        car.refuel(Double.parseDouble(splitedCommand[2]));

                    } else if (splitedCommand[1].equals("Truck")){
                        truck.refuel(Double.parseDouble(splitedCommand[2]));
                    } else {
                        bus.refuel(Double.parseDouble(splitedCommand[2]));
                    }
                    break;

                case "DriveEmpty":

                    System.out.println(bus.driveEmpty(Double.parseDouble(splitedCommand[2])));
                    break;
            }
        }
        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f%n", truck.getFuelQuantity());
        System.out.printf("Bus: %.2f", bus.getFuelQuantity());
    }
}
