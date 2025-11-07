package quizz;

public class Book {
    // Atribut dengan access modifier sesuai ketentuan
    public String title;        // dapat diakses langsung dari luar kelas
    protected String author;    // hanya bisa diakses dalam subclass atau package yang sama
    private double price;       // hanya bisa diakses lewat getter/setter

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter dan Setter untuk price (karena private)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method untuk menampilkan informasi buku
    public void displayInfo() {
        System.out.println("===== Book Information =====");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : Rp " + price);
        System.out.println("============================");
    }
}
