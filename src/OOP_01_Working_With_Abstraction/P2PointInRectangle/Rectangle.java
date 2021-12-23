package OOP_01_Working_With_Abstraction.P2PointInRectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point2D) {
        return point2D.getX() >= bottomLeft.getX() && point2D.getX() <= topRight.getX() &&
                point2D.getY() >= bottomLeft.getY() && point2D.getY() <= topRight.getY();
    }

}