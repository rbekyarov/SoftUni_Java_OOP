package OOP_09_Polymorphism.p3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal dog = new Dog("Rocky","Meet");
        Animal cat = new Cat("Oskar", "Wiskas");

        System.out.println(dog.explainSelf());
        System.out.println(cat.explainSelf());
    }
}
