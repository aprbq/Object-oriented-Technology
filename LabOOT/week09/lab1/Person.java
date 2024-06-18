package week09.lab.lab1;

public abstract class Person { 
    private String name;
    private final String gender; 
    private int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { 
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge (int age) {
        this.age = age;
    }
    
    public final String getBio() {
        return name + " is a " + age + "-year-old " + gender + ".";
    }
    public abstract void getDetails();
}
