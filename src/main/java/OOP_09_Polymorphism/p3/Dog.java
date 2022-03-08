package OOP_09_Polymorphism.p3;

public class Dog extends Animal{


    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {

        return String.format("%s%nDJAAF",super.explainSelf());
    }
}
