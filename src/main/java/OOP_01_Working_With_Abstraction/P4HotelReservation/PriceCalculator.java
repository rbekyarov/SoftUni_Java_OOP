package OOP_01_Working_With_Abstraction.P4HotelReservation;

public class PriceCalculator {

    private double pricePerDay;
    private int numberOfDays;
    private Season season;
    private Discount discountType;

    public PriceCalculator(double pricePerDay, int numberOfDays, Season season, Discount discountType) {
        this.pricePerDay = pricePerDay;
        this.numberOfDays = numberOfDays;
        this.season = season;
        this.discountType = discountType;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public Season getSeason() {
        return season;
    }

    public Discount getDiscountType() {
        return discountType;
    }
}
