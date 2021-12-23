package OOP_01_Working_With_Abstraction.P3StudentSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String command = scanner.nextLine();
        Student student = null;
        while (!command.equals("Exit")) {

            String[] data = command.split(" ");
            String currentCommand = data[0];

            switch (currentCommand) {
                case "Create":
                    String name = data[1];
                    int years = Integer.parseInt(data[2]);
                    double grade = Double.parseDouble(data[3]);
                    student = new Student(name, years, grade);
                    students.add(student);
                    break;

                case "Show":
                    String nameStudent = data[1];

                    for (Student s : students) {
                        if (s.getStudentName().equals(nameStudent)) {

                            System.out.println(s);
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println();
    }
}
