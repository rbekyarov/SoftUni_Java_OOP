package OOP_01_Working_With_Abstraction;

import java.util.Scanner;

public class p1RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {

            for (int i = 0; i < n - row; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < row; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n - 1; row++) {
            for (int i = 0; i < row; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < n - row; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}