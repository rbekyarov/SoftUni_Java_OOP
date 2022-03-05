package OOP_07_Interfaces_and_Abstraction.SayHello;

public class European implements Person {
    private String name;

    public European(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
