package quizz;

public class UnggasPeliharaan extends Unggas {
    private String pemilik;

    // Constructor 1 (dengan semua atribut)
    public UnggasPeliharaan(String nama, int umur, String warnaBulu, String pemilik) {
        super(nama, umur, warnaBulu);
        this.pemilik = pemilik;
    }

    // Constructor 2 (tanpa umur, default umur = 1)
    public UnggasPeliharaan(String nama, String warnaBulu, String pemilik) {
        super(nama, 1, warnaBulu);
        this.pemilik = pemilik;
    }

    // Method overloading 1 - tampilkan semua informasi
    public void tampilkanInfo() {
        System.out.println("=== Data Unggas Peliharaan ===");
        System.out.println("Nama       : " + nama);
        System.out.println("Umur       : " + umur + " tahun");
        System.out.println("Warna Bulu : " + warnaBulu);
        System.out.println("Pemilik    : " + pemilik);
        System.out.println("==============================");
    }

    // Method overloading 2 - tampilkan sebagian informasi
    public void tampilkanInfo(boolean hanyaNama) {
        if (hanyaNama) {
            System.out.println("Unggas milik " + pemilik + " bernama " + nama);
        } else {
            tampilkanInfo();
        }
    }
}
