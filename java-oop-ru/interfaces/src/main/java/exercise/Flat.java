package exercise;

// BEGIN
class Flat extends Home {
    private double area;
    private double balconyArea;
    private int floor;

    public flatArea(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return area + balconyArea;
    }

    public String toString() {
        return "Квартира площадью "+ area + balconyArea + " на " + floor + " этаже";
    }

    public int compareTo(Home another) {
        if (another.getArea() < this.getArea()) {
            return 1;
        } else if (another.getArea() == this.getArea()) {
            return 0;
        } else {
            return -1;
        }
    }
}
// END
