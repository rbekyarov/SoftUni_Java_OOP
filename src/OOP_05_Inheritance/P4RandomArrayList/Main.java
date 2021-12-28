package OOP_05_Inheritance.P4RandomArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RandomArrayList randomArrayList = new RandomArrayList();
        randomArrayList.add("1");
        randomArrayList.add("2");
        randomArrayList.add("3");
        randomArrayList.add("4");
        System.out.println(randomArrayList.getRandomElement(randomArrayList));
    }
}
