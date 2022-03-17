package OOP_14_Exercise_Reflection_and_Annotation.p1;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Class clazz    = RichSoilLand.class;

		String command = scanner.nextLine();
		while (!command.equals("HARVEST")){
			Field[] fields = clazz.getDeclaredFields();
			switch (command){
				case "private":
					for (Field field : fields) {
						if(field.toGenericString().startsWith("private")){
							System.out.printf("%s %s %s%n",getModifiers(field),field.getType().getSimpleName(),field.getName());
						}
					}
					break;
				case "protected":
					for (Field field : fields) {
						if(field.toGenericString().startsWith("protected")){
							System.out.printf("%s %s %s%n",getModifiers(field),field.getType().getSimpleName(),field.getName());
						}
					}
					break;
				case "public":
					for (Field field : fields) {
						if(field.toGenericString().startsWith("public")){
							System.out.printf("%s %s %s%n",getModifiers(field),field.getType().getSimpleName(),field.getName());
						}
					}
					break;
				case "all":
					for (Field field : fields) {
							System.out.printf("%s %s %s%n",getModifiers(field),field.getType().getSimpleName(),field.getName());
						}
					break;
			}
			command = scanner.nextLine();
		}
	}
	private static String getModifiers( Field field) {
		int value = field.getModifiers();
		if(value == 1){
			return "public";
		}else if(value == 2){
			return "private";
		}else if (value ==4){
			return "protected";
		}
        return null;
	}
}
