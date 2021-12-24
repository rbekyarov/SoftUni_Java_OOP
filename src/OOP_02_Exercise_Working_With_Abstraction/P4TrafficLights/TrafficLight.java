package OOP_02_Exercise_Working_With_Abstraction.P4TrafficLights;

import java.util.Iterator;

public class TrafficLight implements Iterator<Color> {
    private Color color;

    public TrafficLight(Color color) {
        this.color = color;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Color next() {
        switch (this.color.name()) {
            case "RED":
                this.color = Color.valueOf("GREEN");
                break;
            case "GREEN":
                this.color = Color.valueOf("YELLOW");
                break;
            default:
                this.color = Color.valueOf("RED");
                break;
        }
        return this.color;
    }
}