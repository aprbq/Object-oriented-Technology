package week10.lab.lab1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0]= new Person("Mark Elliot Zuckerberg", new Email("mark.z@meta.com", "facebook"));
        persons[1]= new Person("Steven Paul Jobs", new Email("jobs@apple.com", "iPhone14Pro"));
        persons[2]= new Person("William Henry Gates", new Email("bill.gates@microsoft.co.th", "Windows11"));

        Scanner sc = new Scanner(System.in); 
        for (Person p: persons) {
            p.verifyUser(sc); 
            System.out.println();
        }
    }
}