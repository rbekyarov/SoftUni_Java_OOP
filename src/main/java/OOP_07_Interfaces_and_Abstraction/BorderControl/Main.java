package OOP_07_Interfaces_and_Abstraction.BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Identifiable> citizensRobotsList = new ArrayList<>();
        String input  =scanner.nextLine();
        while (!input.equals("End")){
            String [] splitInput = input.split(" ");
            if (splitInput.length == 3){
                citizensRobotsList.add(new Citizen(splitInput[0],Integer.parseInt(splitInput[1]),splitInput[2]));
            }else {
                citizensRobotsList.add(new Robot(splitInput[0],splitInput[1]));

            }
            input= scanner.nextLine();
        }
        String fakeIds = scanner.nextLine();
        citizensRobotsList.stream().map(Identifiable::getId)
                .filter(id -> id.endsWith(fakeIds)).forEach(System.out::println);

    }
}
