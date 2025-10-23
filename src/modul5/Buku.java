package modul5;

public class Buku {
    public String namaPengarang, judulBuku;
    public int tahunTerbit, cetakanKe;
    public double hargaJual;
    
    public Buku(){
        this.namaPengarang = "Andrea Hirata";
        this.judulBuku = "Laskar Pelangi";
        this.tahunTerbit = 2005;
        this.cetakanKe = 1;
        this.hargaJual = 85000;
    }
    
    public Buku(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanKe, double hargaJual){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
    }
    
    public Buku(String judulBuku, int tahunTerbit, int cetakanKe, double hargaJual){
        this.namaPengarang = "Tere Liye";
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = 1;
        this.hargaJual = hargaJual;
    }
    
    public void tampilInfo() {
        System.out.println(
            "Nama Pengarang\t: " + namaPengarang +
            "\nJudul Buku\t: " + judulBuku +
            "\nTahun Terbit\t: " + tahunTerbit +
            "\nCetakan Ke\t: " + cetakanKe +
            "\nHarga Jual\t: " + hargaJual
        );
        System.out.println("-------------------------------------------");
    }
}
