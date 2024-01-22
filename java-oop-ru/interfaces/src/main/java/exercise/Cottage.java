package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    public void setArea(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    public Double getArea(){
        return area + floorCount;
    }

    public String toString() {
        return floor + " этажный коотедж площадью " +  area + "метров"; 
    }

    public int compareTo(Home othercottage) {
        double firstArea = this.getArea();
        double secondArea = othercottage.getArea();
        if (thisArea > anotherArea) {
            return 1;
        } else if (thisArea < anotherArea) {
            return -1;
        } else {
            return 0;
        }
    }
}
// END
