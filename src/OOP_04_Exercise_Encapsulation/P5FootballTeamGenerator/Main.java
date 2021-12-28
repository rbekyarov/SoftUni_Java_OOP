package OOP_04_Exercise_Encapsulation.P5FootballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Team> teamMap = new LinkedHashMap<>();
        while (!input.equals("END")) {
            String[] inputData = input.split(";");
            String command = inputData[0];
            switch (command) {
                case "Team":
                    try {
                        teamMap.put(inputData[1], new Team(inputData[1]));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    break;
                case "Add":
                    int endurance = Integer.parseInt(inputData[3]);
                    int sprint = Integer.parseInt(inputData[4]);
                    int dribble = Integer.parseInt(inputData[5]);
                    int passing = Integer.parseInt(inputData[6]);
                    int shooting = Integer.parseInt(inputData[7]);

                    if (teamMap.containsKey(inputData[1])) {
                        try {
                            teamMap.get(inputData[1]).addPlayer(new Player(inputData[2], endurance,
                                    sprint, dribble, passing, shooting));
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.printf("Team %s does not exist.%n", inputData[1]);
                    }
                    break;
                case "Remove":
                    try {
                        teamMap.get(inputData[1]).removePlayer(inputData[2]);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "Rating":
                    if (teamMap.containsKey(inputData[1])) {
                        double rating = Math.round(teamMap.get(inputData[1]).getRating());
                        System.out.printf("%s - %.0f%n", inputData[1], rating);
                    } else {
                        System.out.printf("Team %s does not exist.%n", inputData[1]);
                    }
                    break;

            }

            input = scanner.nextLine();
        }
    }
}
