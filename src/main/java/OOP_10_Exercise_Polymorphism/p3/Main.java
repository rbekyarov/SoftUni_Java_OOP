package OOP_10_Exercise_Polymorphism.p3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        Food food = null;
        String input = scanner.nextLine();
        int countInputLine = 0;
        while (!input.equals("End")) {
            countInputLine++;
            String[] inputLine = input.split(" ");
            if (countInputLine % 2 == 1) {
                switch (inputLine[0]) {
                    case "Cat":
                        animals.add(new Cat(inputLine[0], inputLine[1], Double.parseDouble(inputLine[2]), inputLine[3], inputLine[4]));
                        break;
                    case "Tiger":
                        animals.add(new Tiger(inputLine[0], inputLine[1], Double.parseDouble(inputLine[2]), inputLine[3]));

                        break;
                    case "Zebra":
                        animals.add(new Zebra(inputLine[0], inputLine[1], Double.parseDouble(inputLine[2]), inputLine[3]));

                        break;
                    case "Mouse":
                        animals.add(new Mouse(inputLine[0], inputLine[1], Double.parseDouble(inputLine[2]), inputLine[3]));
                        break;
                }
            } else {
                switch (inputLine[0]) {
                    case "Vegetable":
                        food = new Vegetable(Integer.parseInt(inputLine[1]));
                        break;
                    case "Meat":
                        food = new Meat(Integer.parseInt(inputLine[1]));
                        break;
                }
            }
            input = scanner.nextLine();
        }
        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat(food);
            System.out.println(animal);
        }

    }
}
