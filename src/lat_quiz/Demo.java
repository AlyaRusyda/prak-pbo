package lat_quiz;
public class Demo {
    public static void main(String[] args) {
        Library lib = new Library("Book1", "Akuw", 190);
        lib.calculateRent(4);
        lib.display();
        
        Book buk = new Book("Komedi", 190);
        buk.display();
        
        Ebook ebuk = new Ebook(180, "PDF");
        ebuk.display();
    }
}
