package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    public void setArea(double newArea, int newFloorCount) {
        this.area = newArea;
        this.floorCount = newFloorCount;
    }

    public Double getArea() {
        return area + floorCount;
    }

    public String toString() {
        return floorCount + " этажный коттедж площадью " + area + " метров";
    }

    public int compareTo(Home otherCottage) {
        double thisArea = this.getArea();
        double otherArea = otherCottage.getArea();
        if (thisArea > otherArea) {
            return 1;
        } else if (thisArea < otherArea) {
            return -1;
        } else {
            return 0;
        }
    }
}
// END
