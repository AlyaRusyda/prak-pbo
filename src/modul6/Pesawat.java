package modul6;
public class Pesawat extends Kendaraan {
    private String maskapai; // variabel unik
    protected String nama;   // variabel sama dengan superclass

    public Pesawat() {
        super("Kendaraan Umum", 180, 900.0);
        this.nama = "Pesawat Komersial";
        this.maskapai = "Garuda Indonesia";
    }

    @Override
    public void tampilInfo() {
        System.out.println("Nama\t\t: " + this.nama);
        System.out.println("Kapasitas\t: " + kapasitas + " orang");
        System.out.println("Kecepatan Maks\t: " + kecepatanMaks + " km/jam");
        System.out.println("Maskapai\t: " + maskapai);
    }
}
