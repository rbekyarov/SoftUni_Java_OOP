package OOP_07_Interfaces_and_Abstraction.SayHello;

public class Chinese implements Person {
    private String name;
    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}