package modul5;
public class Mahasiswa {
    public String nama, nim, alamat;
    
    public Mahasiswa() {
        nama = "Alya";
        nim = "L200240290";
        alamat = "Sukoharjo";

        System.out.println(
            "Nama\t: " + nama +
            "\nNIM\t: " + nim +
            "\nAlamat\t: " + alamat
        );
    }
}
