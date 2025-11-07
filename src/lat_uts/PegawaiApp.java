package lat_uts;

class Pegawai {
    String nama;
    String divisi;
    int gaji;

    public Pegawai() {
        nama = "Alya";
        divisi = "Programmer";
        gaji = 10000000;
    }

    public Pegawai(String nama, String divisi, int gaji) {
        this.nama = nama;
        this.divisi = divisi;
        this.gaji = gaji;
    }

    public void tampilkanData() {
        System.out.println("Nama\t: " + nama);
        System.out.println("Divisi\t: " + divisi);
        System.out.println("Gaji\t: " + gaji + "\n");
    }
}

public class PegawaiApp {

    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        Pegawai p2 = new Pegawai("Budi", "Marketing", 5000000);

        p1.tampilkanData();
        p2.tampilkanData();
    }
}
