package lab.quiz;
public class User extends Person implements Checkable {
    private String username;

    public User() {

    }
    public User(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkFormat(String username) {
        int len = username.length();
        int letter = 0, digit = 0;

        for(int i = 0; i < len; i++) {
            if (Character.isLetter(username.charAt(i))) {
                letter++;
            }
            if (Character.isDigit(username.charAt(i))) {
                digit++;
            }
        }
        if(len > 8 && digit > 1 && letter > 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public void getDetails() {
        super.getDetails();
        System.out.println("Username: " + username);
    }
} 