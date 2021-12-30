package OOP_04_Exercise_Encapsulation.P4PizzaCaloriesNOTFINISH;

import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;
    private int numberOfToppings;
    public Pizza(String name, int numberOfToppings){
        this.name=name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setToppings() {
        this.toppings = toppings;
    }


}
