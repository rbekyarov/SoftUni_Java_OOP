package OOP_09_Polymorphism.p1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperation math = new MathOperation();
        math.add(2,3);
        math.add(2,3,4);
        math.add(2,3,4,5);

    }
}
