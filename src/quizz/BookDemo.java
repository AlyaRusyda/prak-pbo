package quizz;

public class BookDemo {
    public static void main(String[] args) {
        // Membuat objek Book
        Book book1 = new Book("Pemrograman Java", "Alya Rusyda", 75000);

        // Akses langsung atribut public
        System.out.println("Judul Buku: " + book1.title);

        // Akses protected author (bisa karena masih dalam package yang sama)
        System.out.println("Penulis   : " + book1.author);

        // Tidak bisa akses langsung price karena private ❌
        // System.out.println(book1.price); // akan error jika diaktifkan

        // Akses lewat getter
        System.out.println("Harga     : Rp " + book1.getPrice());

        // Ubah harga menggunakan setter
        book1.setPrice(90000);

        // Tampilkan info lengkap
        System.out.println();
        book1.displayInfo();
    }
}
