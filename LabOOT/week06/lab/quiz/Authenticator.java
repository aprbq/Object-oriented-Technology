package week06.lab.quiz;
import java.util.*;

public class Authenticator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean checkID, checkUsername;
        String ID, username, password;
        int choice;

        do {
            System.out.println("===== Enter Authenticator =====");
            System.out.print("1 : ID Number\n2 : Username Password\n0 : Exit\n");

            System.out.print("Please enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) {
                System.out.print("Exiting...");
            } 
            else if (choice == 1) {
                System.out.print("Enter your ID nation: ");
                ID = sc.nextLine();
                checkID = login(ID);

                if (checkID) {
                    System.out.println("Correct, loging in...");
                    break;
                } else {
                    System.out.println("Incorrect, Please try again...\n");
                }
            } 
            else if (choice == 2) {
                System.out.print("Enter your username: ");
                username = sc.nextLine();
                System.out.print("Enter your password: ");
                password = sc.nextLine();
                checkUsername = login(username, password);

                if (checkUsername) {
                    System.out.println("Correct, loging in...");
                    break;
                } else {
                    System.out.println("Incorrect, Please try again...\n");
                }
            } 
            else {
                    System.out.println("Invalid choice, Please try again...\n");
            }
        } while (choice != 0);
        sc.close();
    }

    public static boolean login(String uid) {
        String ID = "0123456789102";

        if (uid.equals(ID)) {
            return true;
        } 
        else {
            return false;
        }
    }

    public static boolean login(String us, String pw) {
        String username = "Komsan";
        String password = "Srivisut";

        if (us.equals(username) && pw.equals(password)) {
            return true;
        } 
        else {
            return false;
        }
    }
}