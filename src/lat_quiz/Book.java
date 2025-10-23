package lat_quiz;
public class Book extends Library {
    private String genre;
    private int pageCount;
    
    public void Book(String genre, int pageCount) {
        String title = super.title;
        String author = super.author;
        int weeklyRentPrice = super.weeklyRentPrice;
        this.genre = genre;
        this.pageCount = pageCount;
    }
    
    @Override
    public void display() {
        System.out.println("Judul\t: " + title);
        System.out.println("Author\t: " + author);
        System.out.println("Harga Sewa\t: " + weeklyRentPrice);
        System.out.println("");
    }
}
