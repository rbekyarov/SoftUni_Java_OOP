package OOP_10_Exercise_Polymorphism.p3;

public abstract class Mammal extends Animal {

    String livingRegion;


    public Mammal(String animalType, String animalName, Double animalWeight,String livingRegion) {
        super(animalType, animalName, animalWeight);
        this.livingRegion=livingRegion;
    }
}
