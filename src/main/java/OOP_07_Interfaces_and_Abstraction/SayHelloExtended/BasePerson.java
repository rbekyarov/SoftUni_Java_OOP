package OOP_07_Interfaces_and_Abstraction.SayHelloExtended;

public abstract class BasePerson implements Person {
   private String name;

    protected BasePerson(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
