package OOP_04_Exercise_Encapsulation.P2AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        } else this.age = age;
    }

    private void setName(String name) {
        if (name.length() < 1) {
            throw new IllegalArgumentException("Name cannot be empty.");
        } else {
            this.name = name;
        }

    }

    private int getAge() {
        return age;
    }

    private String getName() {
        return name;
    }

    private double productPerDay() {
        if (getAge() < 6) {
            return 2;
        } else if (getAge() >= 6 && getAge() <= 11) {
            return 1;
        } else {
            return 0.75;
        }
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.", getName(), getAge(), productPerDay());
    }
}
