package OOP_02_Exercise_Working_With_Abstraction.P3CardsWithPower;

public class Card {
    private CardRank rank;
    private CardSuit suit;

    public Card(CardRank rank, CardSuit suit) {
        this.rank = rank;
        this.suit = suit;

    }

    public int getPower() {
        return rank.getPower() + suit.getPower();

    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", rank.name(), suit.name(), getPower());
    }
}
