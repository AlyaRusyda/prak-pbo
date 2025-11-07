package lat_uts;
public class Pegawai {
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
