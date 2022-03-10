package OOP_10_Exercise_Polymorphism.p3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal = null;
        Food food = null;
        String input = scanner.nextLine();
        int countInputLine = 0;
        while (!input.equals("End")){
            countInputLine++;
            String[]inputLine = input.split(" ");
            if (countInputLine%2==1){
             switch (inputLine[0]){
                 case "Cat":
                     animal = new Cat(inputLine[0],inputLine[1],Double.parseDouble(inputLine[2]),inputLine[3],inputLine[4]);
                     break;
                 case "Tiger":
                     animal = new Tiger(inputLine[0],inputLine[1],Double.parseDouble(inputLine[2]),inputLine[3]);

                     break;
                 case "Zebra":
                     animal = new Zebra(inputLine[0],inputLine[1],Double.parseDouble(inputLine[2]),inputLine[3]);

                     break;
                 case "Mouse":
                     animal = new Mouse(inputLine[0],inputLine[1],Double.parseDouble(inputLine[2]),inputLine[3]);
                     break;
             }
            }else {
                switch (inputLine[0]){
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
        animal.makeSound();
        animal.eat(food);
        System.out.println(animal);
    }
}
