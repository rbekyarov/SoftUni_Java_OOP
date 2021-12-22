package OOP_01_Working_With_Abstraction;

import java.util.Scanner;

public class p1RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= n; row++) {

            for (int s = 0; s < n - row; s++) {
                System.out.print(" ");
            }
            for (int s = 0; s < row; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n - 1; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < n - row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}