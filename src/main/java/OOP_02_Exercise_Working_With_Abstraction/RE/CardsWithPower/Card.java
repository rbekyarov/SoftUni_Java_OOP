package OOP_02_Exercise_Working_With_Abstraction.RE.CardsWithPower;

public class Card {
    private CardRank cardRank;
    private CardSuit cardSuit;

    public Card(CardRank cardRank, CardSuit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public int getPower() {
        return cardRank.getPower() + cardSuit.getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", cardRank.name(), cardSuit.name(), getPower());
    }
}
