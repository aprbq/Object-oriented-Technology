package lab.week06.lab2;
import java.text.DecimalFormat;

public class BookStore {
    private static DecimalFormat fmt = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Customer c1 = new Customer("D0001", "Paul", "Diamond"); 
        Customer c2 = new Customer("G0002", "David", "Gold"); 
        Customer c3 = new Customer("S0003", "Linda", "Student"); 
        Customer c4 = new Customer("S0004", "John", "Student"); 
        Customer c5 = new Customer("N0005", "Harry", "General");

        Book b1 = new Book("C000001", "The Baddies", 310);
        Book b2 = new Book("C000002", "Roald Dahl's Heroes and Villains", 399); 
        Book b3 = new Book("F000001", "Wreck the Halls UK: A Novel", 354);
        Book b4 = new Book("F000002", "The Magic of Christmas", 320);
        Book b5 = new Book("E000001", "A-Level Maths Edexcel Complete Revision & Practice", 975);
        Book b6 = new Book("E000002", "AQA Biology: A Level Student Book", 2170); 
        Book b7 = new Book("T000001", "Lonely Planet Epic Road Trips of Europe", 1020); 
        Book b8 = new Book("T000002", "Collins World Atlas: Complete Edition", 1222);

        Order o1 = new Order(c1); 
        Order o2 = new Order(c2); 
        Order o3 = new Order(c3); 
        Order o4 = new Order(c4);
        Order o5 = new Order(c5);

        o1.cart(b1);
        o1.cart(b2);
        o1.cart(b6);
        bill(o1);

        o2.cart(b2);
        o2.cart(b3);
        bill(o2);

        o3.cart(b7);
        o3.cart(b2);
        o3.cart(b3);
        o3.cart(b6);
        bill(o3);

        o4.cart(b8);
        bill(o4);

        o5.cart(b2);
        o5.cart(b4);
        o5.cart(b5);
        bill(o5);
    }

    public static void bill(Order o) {
        String customerType = o.getCustomer().getCustomerType();
        String customerName = o.getCustomer().getCustomerName();
        
        if (customerType.equals("General")) {
            System.out.print(customerName + " ["+ customerType + "]" + " must pay " + fmt.format(o.calculateFinalPrice()) + " Bath.");
        } 
        else {
            System.out.println(customerName + " ["+ customerType +  "]"  + " has got a discount of "+ fmt.format(o.getDiscount()) 
                                + " Bath and must pay " + fmt.format(o.calculateFinalPrice()) + " Bath.\n");
        }
    }
}       