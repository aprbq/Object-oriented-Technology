package lab.week08;

class Circle extends Geometry {
    public Circle(double length) {
        super(length);
    }

    public void calculatePerimeter() {
        setPerimeter(2 * Math.PI * getLength());
    }

    public void calculateArea() {
        setArea(Math.PI * Math.pow(getLength(), 2));
    }
}