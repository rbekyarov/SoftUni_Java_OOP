package OOP_09_Polymorphism.p2;

public abstract class Shape {
    private  Double perimeter;
    private Double area;


    public abstract double calculatePerimeter();
    public abstract double calculateArea();



    public Double getPerimeter() {
        return perimeter;
    }

    protected void setPerimeter(Double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getArea() {
        return area;
    }

    protected void setArea(Double area) {
        this.area = area;
    }
}
