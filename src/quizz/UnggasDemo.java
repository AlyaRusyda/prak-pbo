package quizz;

public class UnggasDemo {
    public static void main(String[] args) {
        // Objek 1 menggunakan constructor lengkap
        UnggasPeliharaan unggas1 = new UnggasPeliharaan("Ayam Kate", 2, "Coklat", "Owner1");

        // Objek 2 menggunakan constructor overloading (tanpa umur)
        UnggasPeliharaan unggas2 = new UnggasPeliharaan("Burung Merpati", "Putih", "Owner2");

        // Menampilkan data keduanya
        unggas1.tampilkanInfo();
        unggas2.tampilkanInfo(true); // menampilkan hanya nama dan pemilik
    }
}
