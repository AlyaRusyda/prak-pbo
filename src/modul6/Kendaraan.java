package modul6;
public class Kendaraan {
    protected String nama = "Vario";
    protected int kapasitas = 2;
    protected double kecepatanMaks = 120;

    public Kendaraan(String nama, int kapasitas, double kecepatanMaks) {
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void tampilInfo() {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Kapasitas\t: " + kapasitas + " orang");
        System.out.println("Kecepatan Maks\t: " + kecepatanMaks + " km/jam\n");
    }
}
