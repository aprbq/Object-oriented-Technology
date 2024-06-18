package week09.lab.lab1;

public class Lecturer extends Employee {
    private String school;

    public Lecturer (String name, String gender, int age, String position, double salary, 
    String school) {
        super(name, gender, age, position, salary);
        this.school = school;
    }
    
    public String getSchool() {
        return school;
    }
    
    public void setSchool (String school) {
        this.school = school;
    }
    
    @Override
    public final void getDetails() {
        super.getDetails();
        System.out.println(getName() + " is a/an " +  getPosition() + " at the School of " + 
            getSchool() + ".");
    }
}