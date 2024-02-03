package exercise;

// BEGIN
class Cottage extends Home {
    private double area;
    private int floor;

    public auth(double area, int floor) {
        this.area = area;
        this.floor = floor;
    }

    public double getArea() {
        return area;
    }

    public String toString() {
        return floor + " этажный коттедж площадью " + area + " метров";
    }
    
    public int compareTo(Home another) {
        if (this.getArea() > another.getArea()) {
            return 1;
        } else if ( this.getArea() == another.getArea()) {
            return 0;
        } else {
            return -1;
        }
    }
}
// END
