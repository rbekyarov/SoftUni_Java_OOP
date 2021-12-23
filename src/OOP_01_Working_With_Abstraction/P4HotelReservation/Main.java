package OOP_01_Working_With_Abstraction.P4HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");


        double pricePerDay = Double.parseDouble(input[0]);
        int numberOfDays = Integer.parseInt(input[1]);
        Season season = Season.valueOf(input[2]);
        Discount discountType = Discount.valueOf(input[3]);

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay, numberOfDays, season, discountType);

        double price = priceCalculator.getPricePerDay() * (priceCalculator.getSeason().ordinal() + 1);
        price = price * priceCalculator.getNumberOfDays();
        price -= price * priceCalculator.getDiscountType().getPerc();

        System.out.printf("%.2f", price);
    }
}
