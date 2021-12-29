package OOP_06_Exercise_Inheritance.P3PlayersAndMonsters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int level = Integer.parseInt(scanner.nextLine());
        MuseElf museElf = new MuseElf(name,level);
        System.out.println(museElf.toString());

    }
}
