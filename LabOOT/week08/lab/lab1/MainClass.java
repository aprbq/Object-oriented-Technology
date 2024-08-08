package week08.lab.lab1;

public class MainClass {
    public static void main(String[] args) {

        //Animal anim1 = new Animal(); 
        System.out.println();

        Animal anim2 = new Animal("Fredy", "male", 5, "brown");
        anim2.makeNoise(); 
        anim2.eat("foods");
        System.out.println();

        Dog dog1 = new Dog("Dave", "male", 2, "black"); 
        dog1.makeNoise();
        dog1.eat("cooked unseasoned beef");
        System.out.println();
        
        Cat cat1 = new Cat("Kathy", "female", 2, "white");
        cat1.makeNoise();
        cat1.eat("mice");
        System.out.println();
    }
}