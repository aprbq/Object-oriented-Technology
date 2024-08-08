package week08.lab.lab2;

class Triangle extends Geometry {
    public Triangle(double length) {
        super(length);
    }

    public void calculatePerimeter() {
        setPerimeter(3 * getLength());
    }

    public void calculateArea() {
        setArea((Math.sqrt(3) / 4) * Math.pow(getLength(), 2));
    }
}