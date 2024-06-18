package week09.lab.lab1;

public class Student extends Person {
    private String id;
    private String study;

    public Student(String name, String gender, int age, String id, 
        String study) {
            super(name, gender, age);
            this.id = id;
            this.study = study;
    }
    
    public String getStudy() {
        return study;
    }
    
    public void setStudy(String study) { 
        this.study = study;
    }

    public String getID() {
        return id;
    }
    
    public void setID(String id) { 
        this.id = id;
    }

    @Override
    public final void getDetails() {
        super.getBio();
        System.out.println(getName() + "'s student ID is " + getID() + " and s/he studies "
            + getStudy() + ".");
    }
}
