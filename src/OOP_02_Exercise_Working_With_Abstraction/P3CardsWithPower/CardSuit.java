package OOP_02_Exercise_Working_With_Abstraction.P3CardsWithPower;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;
    CardSuit(int value){
        this.power =value;
    }

    public int getPower() {
        return power;
    }
}
