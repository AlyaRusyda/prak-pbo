package lat_quiz;
public class Library {
    protected String title;
    protected String author;
    protected int weeklyRentPrice;
    
    public void Library(String title, String author, int weeklyRentPrice) {
        this.title = title;
        this.author = author;
        this.weeklyRentPrice = weeklyRentPrice;
    }
    
    public void display() {
        System.out.println("Judul\t: " + title);
        System.out.println("Author\t: " + author);
        System.out.println("Harga Sewa\t: " + weeklyRentPrice + "\n");
    }
    
    public int calculateRent(int weeks) {
        return weeklyRentPrice * weeks;
    }
}
