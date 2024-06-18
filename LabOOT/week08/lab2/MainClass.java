package lab.week08;

import java.text.DecimalFormat;

public class MainClass {
    public static void main(String[] args) {
        Geometry[] geometries = new Geometry[3];
        geometries[0] = new Triangle(4);
        geometries[1] = new Square(5);
        geometries[2] = new Circle(6);

        printDetails(geometries);
    }

    public static void printDetails(Geometry[] geometries) {
        DecimalFormat df = new DecimalFormat("#.##");

        for (Geometry geometry : geometries) {
            geometry.calculatePerimeter();
            geometry.calculateArea();

            System.out.println("This is a " + geometry.getGeoType());
            System.out.println("Length: " + df.format(geometry.getLength()));
            System.out.println("Perimeter: " + df.format(geometry.getPerimeter()));
            System.out.println("Area: " + df.format(geometry.getArea()));
            System.out.println();
        }
    }
}