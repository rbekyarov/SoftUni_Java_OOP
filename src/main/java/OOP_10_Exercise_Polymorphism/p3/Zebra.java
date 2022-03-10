package OOP_10_Exercise_Polymorphism.p3;

import java.text.DecimalFormat;

public class Zebra extends Mammal{


    public Zebra(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if(!food.getClass().getSimpleName().equals("Vegetable")){
            System.out.println("Zebras are not eating that type of food!");
        }else {
            setFoodEaten(getFoodEaten()+ food.getQuantity());
        }

    }
    @Override
    public String toString() {
        DecimalFormat decimal = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %d]",getAnimalType(),getAnimalName(),decimal.format(getAnimalWeight()),livingRegion,getFoodEaten());
    }
}
