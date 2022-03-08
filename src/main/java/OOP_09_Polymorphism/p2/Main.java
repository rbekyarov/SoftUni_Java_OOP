package OOP_09_Polymorphism.p2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Shape rectangle = new Rectangle(5d,3d);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

        Shape circle = new Circle(5d);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
    }
}
