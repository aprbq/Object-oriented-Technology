package lab.week03;
import java.util.Scanner;
public class HoteBooking {
    public static void main(String[] args) {
        final int ROOM_QUOTA = 1000;
        final int COMMON= 5000;
        final int EXTRA = 10000;
        final int BREAK_FAST = 500;
        final double SERVICE = 0.018;
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to book a room?");
        String roomCheck = sc.nextLine();

        double total = 0;

        if (roomCheck.equals("yes")) {
            System.out.println("Please choose a room type:");
            String roomType = sc.nextLine();

            System.out.println("How many rooms?");
            int roomNum = sc.nextInt();

            sc.nextLine();
            System.out.println("Include breakfast?");
            String breakFast = sc.nextLine();

            total += (roomType.equals("common")) ? COMMON*roomNum : EXTRA*roomNum;
            total += (breakFast.equals("yes")) ? BREAK_FAST : 0;

        } else if (roomCheck.equals("no")){
            System.out.println("Do you want to reserve your quota for booking room next time?");
            String roomWant = sc.nextLine();

            if (roomWant.equals("yes")) {
                 System.out.println("Please pay for reserve the quota about "+ ROOM_QUOTA + " baht.");
                 total += ROOM_QUOTA ;
            }
        }
        sc.close();
        
        total += total*SERVICE;
        System.out.print("You need to pay " + total + " baht (included service charge).");
    }
}
