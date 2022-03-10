package OOP_10_Exercise_Polymorphism.p3;

import java.text.DecimalFormat;

public class Tiger extends Felime{

     String livingRegion;

    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.livingRegion = livingRegion;
    }


    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");

    }

    @Override
    public void eat(Food food) {
        if(!food.getClass().getSimpleName().equals("Meat")){
            System.out.println("Tigers are not eating that type of food!");
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
