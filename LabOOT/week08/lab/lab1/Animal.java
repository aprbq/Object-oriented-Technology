package week08.lab.lab1;

public class Animal {

    protected String name; 
    private String gender; 
    private int age;
    private String colour;
    private String food;

    public Animal() {
        System.out.println("A new "+ getClass().getSimpleName() + " object is created.");
    }
    
    public Animal(String name, String gender, int age, String colour) {
        this.name = name;
        this.gender = gender; 
        this.age = age;
        this.colour = colour;
        System.out.println("A " + age + "-year-old " + colour + " " + gender
            + " " + getClass().getSimpleName()+ " object named \"" + name + "\" is created.");
    }
        
    public void makeNoise() {
        System.out.println(name + " is making noise.");
    }
    
    public void eat(String food) {
        setFood(food);
        System.out.println(name + " is eating " + food + ".");
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }

    public void setFood(String food) {
        this.food = food;
    }
    public String getFood() {
        return food;
    }
}