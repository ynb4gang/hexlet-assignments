package exercise;

class Flat implements Home {
    private double area;
    private int floor;
    private double balconyArea;

    Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    public double getArea() {
        return this.area + balconyArea;
    }

    public String toString() {
        return String.format("Квартира площадью %s метров на %d этаже", getArea(), floor);
    }

    public int compareTo(Home another) {
        if (this.getArea() == another.getArea()) {
            return 0;
        }

        if (this.getArea() > another.getArea()) {
            return 1;
        }

        return -1;
    }
}