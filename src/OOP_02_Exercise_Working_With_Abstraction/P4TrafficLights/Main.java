package OOP_02_Exercise_Working_With_Abstraction.P4TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<TrafficLight> trafficLights = new ArrayList<>();

        String[] lightInput = scanner.nextLine().split("\\s+");

        for (String e : lightInput) {
            trafficLights.add(new TrafficLight(Color.valueOf(e)));
        }

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {

            for (TrafficLight trafficLight : trafficLights) {
                System.out.printf("%s ", trafficLight.next());
            }

            System.out.println();
        }
    }
}
