package week06.lab.lab2;
import java.text.DecimalFormat;

class Order {
    DecimalFormat fmt = new DecimalFormat("0.0");
    private Customer customer = new Customer();
    private double discount = 0;
    private double price = 0;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void cart(Book book) {
        System.out.println(customer.getCustomerName() + " ordered " 
                            + book.getBookName() + ": " 
                            + fmt.format(book.getBookPrice()) + " Bath.");
        this.price += book.getBookPrice();   
    }

    public double getDiscount() {
        String customerType = customer.getCustomerType();

        if (customerType.equals("Diamond")) {
            discount = price * 0.2;
        }
        else if (customerType.equals("Gold")) {
            discount = price * 0.1;
        }
        else if (customerType.equals("Student")) {
            if (price*0.3 <= 300 && price*0.3 > 0) { 
                discount = price * 0.3;
            }
            else {
                discount = 300; 
            }
        }
        return discount;
    }

    public double calculateFinalPrice() {
        return (price - getDiscount());
    }

}