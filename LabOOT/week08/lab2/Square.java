package lab.week08;

class Square extends Geometry {
    public Square(double length) {
        super(length);
    }

    public void calculatePerimeter() {
        setPerimeter(4 * getLength());
    }

    public void calculateArea() {
        setArea(Math.pow(getLength(), 2));
    }
}