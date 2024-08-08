package lab.quiz;

import java.util.*;
public class Mainclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User u = new User("Book", "NK", 100);
        boolean flag = true;
        String username;
        do {
            System.out.print("Please enter username: ");
            username = sc.next();

            flag = u.checkFormat(username);

        } while(!flag);
        u.setUsername(username);
        u.getDetails();
        sc.close();
    }
}