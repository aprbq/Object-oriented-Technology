package week06.lab.lab1;

public class MainClass {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("MBW", "5 Series Sedan", "2023");
        cars[1] = new Car("Mercedes-Benz", "E 200 Coupe AMG Dynamic");
        cars[1].setYear("2022");
        cars[2] = new Car();
        cars[2].setBrand("Mini");
        cars[2].setModel("Clubman");
        cars[2].setYear("2021");
        String brand = "BRAND";
        String model = "MODEL";
        String year = "YEAR";
        System.out.printf("%-17s%-25s%6s\n", brand, model, year);
        System.out.println("------------------------------------------------");
        for (int i = 0; i < cars.length; i++) {
            cars[i].displayInfo();
        }
    }
}