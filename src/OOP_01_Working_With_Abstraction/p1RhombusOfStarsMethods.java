package OOP_01_Working_With_Abstraction;

import java.util.Scanner;

public class p1RhombusOfStarsMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //print top
        for (int row = 0; row < n; row++) {
            printSpace(n, row);
            printStar(row);
            printLine();
        }

        //print middle
        printStar(n);
        printLine();

        //print bottom
        for (int row = 1; row <= n; row++) {
            forLoop(row, " ");
            forLoop(n - row, "* ");
            printLine();
        }
    }

    private static void forLoop(int row, String s) {
        for (int i = 0; i < row; i++) {
            System.out.print(s);
        }
    }

    private static void printLine() {
        System.out.println();
    }

    private static void printStar(int row) {
        forLoop(row, "* ");
    }

    private static void printSpace(int n, int row) {
        forLoop(n - row, " ");
    }
}