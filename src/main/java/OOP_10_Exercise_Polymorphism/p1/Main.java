package OOP_10_Exercise_Polymorphism.p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vehicle car = null;
        Vehicle truck = null;
        Scanner scanner = new Scanner(System.in);
        int count = 2;
        while (count-- > 0) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0].equals("Car")) {
                car = new Car(Double.parseDouble(input[1]), Double.parseDouble(input[2]));
            } else {
                truck = new Truck(Double.parseDouble(input[1]), Double.parseDouble(input[2]));
            }
        }
        int countCommand = Integer.parseInt(scanner.nextLine());
        while (countCommand-- > 0) {
            String[] splitedCommand = scanner.nextLine().split(" ");
            switch (splitedCommand[0]) {
                case "Drive":
                    if (splitedCommand[1].equals("Car")) {

                        System.out.println(car.drive(Double.parseDouble(splitedCommand[2])));

                    } else {

                        System.out.println(truck.drive(Double.parseDouble(splitedCommand[2])));
                    }
                    break;
                case "Refuel":
                    if (splitedCommand[1].equals("Car")) {
                        car.Refuel(Double.parseDouble(splitedCommand[2]));

                    } else {
                        truck.Refuel(Double.parseDouble(splitedCommand[2]));
                    }
                    break;
            }
        }
        System.out.printf("Car: %.2f%n",car.getFuelQuantity());
        System.out.printf("Truck: %.2f",truck.getFuelQuantity());
    }
}
