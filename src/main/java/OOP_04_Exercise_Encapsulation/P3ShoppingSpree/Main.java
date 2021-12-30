package OOP_04_Exercise_Encapsulation.P3ShoppingSpree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> personMap = new LinkedHashMap<>();
        Map<String, Product> productMap = new HashMap<>();

        try {
            String[] usersData = scanner.nextLine().split(";");
            for (int i = 0; i < usersData.length; i++) {
                String[] userData = usersData[i].split("=");
                Person person = new Person(userData[0], Double.parseDouble(userData[1]));
                personMap.put(person.getName(), person);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        try {
            String[] producstData = scanner.nextLine().split(";");
            for (int i = 0; i < producstData.length; i++) {
                String[] productData = producstData[i].split("=");
                Product product = new Product(productData[0], Double.parseDouble(productData[1]));
                productMap.put(product.getName(), product);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        String command = scanner.nextLine();

        while (!command.equals("END")) {

            String[] currentCommand = command.split(" ");
            String namePerson = currentCommand[0];
            String nameProduct = currentCommand[1];
            try {
                Person person = personMap.get(namePerson);
                Product product = productMap.get(nameProduct);
                person.buyProduct(product);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            command = scanner.nextLine();
        }
        for (Person person : personMap.values()) {
            System.out.print(person.getName() + " - ");
            if (person.getProducts().isEmpty()) {
                System.out.println("Nothing bought");
            } else {
                System.out.println(person.getProducts().stream().map(Product::getName).collect(Collectors.joining(", ")));
            }
        }
    }
}
