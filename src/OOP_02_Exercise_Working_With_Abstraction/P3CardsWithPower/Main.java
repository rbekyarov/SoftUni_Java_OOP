package OOP_02_Exercise_Working_With_Abstraction.P3CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardRank rank = CardRank.valueOf(scanner.nextLine());
        CardSuit suits = CardSuit.valueOf(scanner.nextLine());

        Card card = new Card(rank, suits);

        System.out.println(card);

    }
}
