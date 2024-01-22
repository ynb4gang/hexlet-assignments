package exercise;

// BEGIN
public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    // Конструктор для установки значений при создании объекта
    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public Double getArea() {
        return area + balconyArea;
    }

    @Override
    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
    }

    @Override
    public int compareTo(Home another) {
        double thisArea = this.getArea();
        double anotherArea = another.getArea();

        if (thisArea > anotherArea) {
            return 1;
        } else if (thisArea < anotherArea) {
            return -1;
        } else {
            return 0;
        }
    }
}
