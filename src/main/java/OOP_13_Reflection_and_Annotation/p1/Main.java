package OOP_13_Reflection_and_Annotation.p1;

import java.lang.reflect.InvocationTargetException;


public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz  = Reflection.class;
        System.out.printf("class %s%n",clazz.getSimpleName());
        Class  declaredMethods = clazz.getSuperclass();
        System.out.println(declaredMethods);
        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }
        Object classes = clazz.getDeclaredConstructor().newInstance();
        System.out.println(classes);

    }
}
