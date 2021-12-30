package OOP_05_Inheritance.P4RandomArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArrayList extends ArrayList {


    public Object getRandomElement(List<Object> list) {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }


}
