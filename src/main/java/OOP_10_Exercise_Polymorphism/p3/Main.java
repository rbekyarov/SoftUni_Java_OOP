package OOP_10_Exercise_Polymorphism.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        Animal animal = null;
        String input = scanner.nextLine();
        int countInputLine = 0;
        while (!input.equals("End")) {
            countInputLine++;
            String[] inputLine = input.split(" ");
            if (countInputLine % 2 == 1) {
                switch (inputLine[0]) {
                    case "Cat":
                        animal= new Cat(inputLine[0], inputLine[1], Double.parseDouble(inputLine[2]), inputLine[3], inputLine[4]);
                        break;
                    case "Tiger":
                        animal= new Tiger(inputLine[0], inputLine[1], Double.parseDouble(inputLine[2]), inputLine[3]);

                        break;
                    case "Zebra":
                        animal= new Zebra(inputLine[0], inputLine[1], Double.parseDouble(inputLine[2]), inputLine[3]);

                        break;
                    case "Mouse":
                        animal= new Mouse(inputLine[0], inputLine[1], Double.parseDouble(inputLine[2]), inputLine[3]);
                        break;
                }
                animals.add(animal);
            } else {
                switch (inputLine[0]) {
                    case "Vegetable":
                        animal.makeSound();
                        animal.eat(new Vegetable(Integer.parseInt(inputLine[1])));
                        System.out.println(animal);
                        break;
                    case "Meat":
                        animal.makeSound();
                        animal.eat(new Meat(Integer.parseInt(inputLine[1])));
                        System.out.println(animal);
                        break;
                }
            }
            input = scanner.nextLine();
        }
    }
}
