package OOP_02_Exercise_Working_With_Abstraction.P1CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(input+":");

        for (Card card : Card.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", card.ordinal(), card.name());
        }
    }
}
