package lat_quiz;
public class Book extends Library {
    private String genre;
    private int pageCount;
    
    public Book(String genre, int pageCount) {
        super("Hujan", "Tere Liye", 12000);
        this.genre = genre;
        this.pageCount = pageCount;
    }
    
    @Override
    public void display() {
        System.out.println("===== Book =====");
        System.out.println("Judul\t\t: " + title);
        System.out.println("Author\t\t: " + author);
        System.out.println("Harga Sewa\t: " + weeklyRentPrice);
        System.out.println("Genre\t\t: " + genre);
        System.out.println("Page Count\t: " + pageCount + "\n");
    }
}
