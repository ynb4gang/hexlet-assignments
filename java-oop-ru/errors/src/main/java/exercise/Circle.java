package exercise;
import java.awt.Point;
// BEGIN
class Circle {

    private Point circleCenter;
    private int circleRadius;

    Circle(Point center, int radius) {
        this.circleCenter = center;
        this.circleRadius = radius;
    }

    public int getRadius() {
        return this.circleRadius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (this.getRadius() < 0) {
            throw new NegativeRadiusException("Radius can not be negative");
        }

        return Math.PI * Math.pow(circleRadius, 2);
    }
}
// END
