package week10.lab.lab1;

import java.util.Scanner;

public class Person implements UserToolBox {

        private String fullName;
        private String firstName;
        private String middleName;
        private String lastName;
        private Email email;

    public Person(String fullName, Email email) {
        this.fullName = fullName;
        this.email = email;
        setNamesOfUser(fullName);
    }

    public String getFullName() {
        return fullName;
    }

    public void setNamesOfUser(String fullname) {
        String[] nameParts = fullname.split(" ");
        this.firstName = nameParts[0];
        this.middleName = nameParts[1];
        this.lastName = nameParts[2];
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public Email getEmail() {
        return email;
    }

    public void getInfo() {
            System.out.println("Full name: " + fullName);
            System.out.println("First name: " + firstName);
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastName);
            email.getInfo();
    }
    
    public void verifyUser(Scanner sc) {
        System.out.print("Enter the password of \"" + email.getEmailAddress() + "\": ");
        String inputPassword = sc.nextLine();

        if (inputPassword.equals(email.getPassword())) {
            getInfo();
        } else {
            System.out.println("You don't have permission to access the account data!");
        }
    }
}