package OOP_08_Exercise_Interfaces_and_Abstraction.Telephony;

import java.util.List;

public class Smartphone implements Callable,Browsable{

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String call() {
        return String.format("Calling... %s",this.numbers);
    }

    @Override
    public String browse() {
        return String.format("Browsing: %s!",this.urls);
    }
}
