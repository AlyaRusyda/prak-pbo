package quizz;
public class Buku {
    String judul;
    String pengarang;
    int harga;
    
    public void display() {
        System.out.println("========== Data Buku ==========");
        System.out.println("Judul\t\t: " + judul);
        System.out.println("Pengarang\t: " + pengarang);
        System.out.println("Harga\t\t: " + harga + "\n");
    }
    
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.judul = "Judul 1";
        buku1.pengarang = "Author 1";
        buku1.harga = 100000;
        buku1.display();
        
        Buku buku2 = new Buku();
        buku2.judul = "Judul 2";
        buku2.pengarang = "Author 2";
        buku2.harga = 200000;
        buku2.display();
    }
}
