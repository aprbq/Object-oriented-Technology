package lab.test;

public class MyMainClass {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Paul");
        Student s3 = new Student("Preston", 25);
        s1.setName("Peter");
        s1.setAge(23);
        s2.setAge(24);
        System.out.print(s1.getName());
    }
}