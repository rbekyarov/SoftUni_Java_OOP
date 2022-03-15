package OOP_13_Reflection_and_Annotation.p3;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Class aClass = Reflection.class;
        Field[] fields = aClass.getDeclaredFields();
        fields[0].setAccessible(true);
        Field field = fields[0];
        System.out.println(field.toString());

        System.out.println();


    }
}
