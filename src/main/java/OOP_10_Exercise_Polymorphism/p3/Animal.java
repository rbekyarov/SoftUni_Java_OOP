package OOP_10_Exercise_Polymorphism.p3;

public abstract class Animal {
    private String animalName;
    private String animalType;
    private Double animalWeight;
    private Integer foodEaten;

    public Animal( String animalType , String animalName, Double animalWeight) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public Double getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(Double animalWeight) {
        this.animalWeight = animalWeight;
    }

    public Integer getFoodEaten() {
        return foodEaten;
    }

    public void setFoodEaten(Integer foodEaten) {
        this.foodEaten = foodEaten;
    }

    public abstract void makeSound();
    public abstract void eat(Food food);

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", animalType='" + animalType + '\'' +
                ", animalWeight=" + animalWeight +
                ", foodEaten=" + foodEaten +
                '}';
    }
}
