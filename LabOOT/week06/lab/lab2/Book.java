package lab.week06.lab2;

class Book {
    private String bookName;
    private String bookID;
    private int bookPrice;

    public Book() {

    }

    public Book(String bookID, String bookName, int bookPrice) {
        setBookName(bookName);
        setBookID(bookID);
        setBookPrice(bookPrice);
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookID() {
        return bookID;
    }

    public int getBookPrice() {
        return bookPrice;
    }
}