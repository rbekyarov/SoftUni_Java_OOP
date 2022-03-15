package OOP_13_Reflection_and_Annotation.p2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Reflection.class;


        Arrays.stream(clazz.getDeclaredMethods()).filter(method -> method.getName().startsWith("get") &&
                        method.getParameterCount() == 0)
                .sorted(Comparator.comparing(Method::getName, (s1, s2) -> {
                    return s1.compareTo(s2);
                }))
                .forEach(e -> System.out.printf("%s and will set field of class %s%n", e.getName(), e.getReturnType()));

        Arrays.stream(clazz.getDeclaredMethods()).filter(method -> method.getName().startsWith("set"))
                .sorted(Comparator.comparing(Method::getName, (s1, s2) -> {
                    return s1.compareTo(s2);
                }))
                .forEach(e -> System.out.printf("%s will return class %s%n", e.getName(), e.getParameterTypes()[0].getName()));
    }

}
