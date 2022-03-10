package OOP_10_Exercise_Polymorphism.p3;

import java.text.DecimalFormat;

public class Cat extends Felime{
    private String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion,String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed=breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food) {

            setFoodEaten(getFoodEaten()+ food.getQuantity());

    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        DecimalFormat decimal = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %s, %d]",getAnimalType(),getAnimalName(),getBreed(),decimal.format(getAnimalWeight()),livingRegion,getFoodEaten());
    }
}
