package OOP_01_Working_With_Abstraction;

import java.util.Scanner;

public class p1RhombusOfStarsMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTop(n);
        printMiddle(n);
        printBottom(n);
    }

    private static void printMiddle(int n) {
        printStar(n);
        printLine();
    }

    private static void printBottom(int n) {
        for (int row = 1; row <= n; row++) {
            forLoop(row, " ");
            forLoop(n - row, "* ");
            printLine();
        }
    }

    private static void printTop(int n) {
        for (int row = 0; row < n; row++) {
            printSpace(n, row);
            printMiddle(row);
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