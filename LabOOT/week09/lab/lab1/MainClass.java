package week09.lab.lab1;

public class MainClass {
    public static void main(String[] args) {
        Person[] persons = new Person[5];

        persons[0] = new Lecturer("Benedict Cumberbatch", "male", 35, "Associate Professor", 90000, 
        "Computer Engineering");
        persons[1] = new Researcher("Emma Watson", "female", 30, "full-time", 35000, "Technopolis");
        persons[2] = new Lecturer("Kate Winslet", "female", 40, "Assistant Professor", 65000, 
        "Food Technology");
        persons[3] = new Researcher("Eddie Redmayne", "male", 25, "part-time", 27000, "SEDA");
        persons[4] = new Student("Tom Holland", "male", 20, "B6400001","Civil Engineering");
        for (Person person : persons) {
            System.out.println(person.getBio());
            person.getDetails();
            System.out.println();
        }
    }
}