package modul6;
public class Mobil extends Kendaraan {
    private String bahanBakar; // variabel unik
    protected String nama;     // variabel sama dengan superclass

    public Mobil() {
        super("Kendaraan Umum", 4, 120.0);
        this.nama = "Mobil Sedan";
        this.bahanBakar = "Bensin";
    }

    @Override
    public void tampilInfo() {
        System.out.println("Nama\t\t: " + this.nama);
        System.out.println("Kapasitas\t: " + kapasitas + " orang");
        System.out.println("Kecepatan Maks\t: " + kecepatanMaks + " km/jam");
        System.out.println("Bahan Bakar\t: " + bahanBakar);
    }
}
