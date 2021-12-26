package OOP_03_Encapsulation.P4FirstAndReserveTeam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Team team = new Team("Black Eagles");
        while (n-- >0){
            String[]input = scanner.nextLine().split(" ");
            Person person = new Person(input[0],input[1],Integer.parseInt(input[2]),Double.parseDouble(input[3]));
            team.addPlayer(person);

        }
        System.out.println(team);
    }
}
