package week09.lab.lab2;

public abstract class Employee extends Person implements IncomeTax {

    private String position;
    private double salary;
    private double tax;
    private double interest = 0.0; 

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
 
    public void calculateTaxableIncome() {
        salary *= 12 ;
    }
    
    public void calculateTax() {
        interest =  salary > 5000000 ? 0.35 :
                    salary > 2000000 ? 0.3 :
                    salary > 1000000 ? 0.25 :
                    salary > 750000 ? 0.2 :
                    salary > 500000 ? 0.15 :
                    salary > 300000 ? 0.1 :
                    salary > 150000 ? 0.05 : 0.0;
        tax = salary * interest;
    }

    public double getTax() {
        return tax;
    }
}