package week09.lab.lab1;

public abstract class Employee extends Person{

    private String position;
    private double salary;


    public Employee (String name, String gender, int age, String position, double salary) {
        super(name, gender, age);
        this.position = position;
        this.salary = salary;
    }
    public String getPosition() {
        return position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void getDetails() {
        System.out.println(getName() + "is currently working as a/an " + getClass().getSimpleName() + ".");
    }
    
}
