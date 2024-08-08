package week08.lab.lab2;

class Geometry {

    private double length;
    private double perimeter;
    private double area;

    public Geometry(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public void calculatePerimeter() {

    }

    public void calculateArea() {

    }

    public String getGeoType() {
        return getClass().getSimpleName();
    }
}