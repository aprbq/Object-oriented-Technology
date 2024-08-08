package week10.lab.lab2;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Mark Elliot Zuckerberg", "meta", "facebook");
        persons[1] = new Person("Steven Paul Jobs", "apple", "iPhone14Pro");
        persons[2] = new Person("William Henry Gates", "microsoft", "Windows11");

        Scanner sc = new Scanner(System.in); 
        for (Person p: persons) {
            p.verifyUser(sc); 
            System.out.println();
        }
    }
}