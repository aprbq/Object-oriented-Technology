package week08.lab.lab1;

public class Cat extends Animal {

    public Cat() {
        
    }
    
    public Cat(String name, String gender, int age, String colour) {
        super(name, gender, age, colour);
    }
    
    public void makeNoise() {
        System.out.println(super.getName() + " is meowing.");
    }
    
}