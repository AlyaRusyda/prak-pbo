package lat_quiz;
public class Ebook extends Library {
    private int fileSizeMB;
    private String format;
    
    public Ebook(int fileSizeMB, String format) {
        super("Bumi", "Surya Rembulan", 19);
        this.fileSizeMB = fileSizeMB;
        this.format = format;
    }
    
    @Override
    public void display() {
        System.out.println("===== E-Book =====");
        System.out.println("Judul\t\t: " + title);
        System.out.println("Penulis\t\t: " + author);
        System.out.println("Harga Sewa\t: " + weeklyRentPrice);
        System.out.println("File Size\t: " + fileSizeMB);
        System.out.println("Format File\t: " + format + "\n");
    }
}
