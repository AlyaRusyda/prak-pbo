package modul6;
public class DemoKendaraan {
    public static void main(String[] args) {
        Kendaraan ken = new Kendaraan("Vario", 2, 120);
        Mobil mobil = new Mobil();
        Pesawat pesawat = new Pesawat();

        System.out.println("========== Data Kendaraan ==========");
        ken.tampilInfo();
        
        System.out.println("========== Data Mobil ==========");
        mobil.tampilInfo();

        System.out.println("\n========== Data Pesawat ==========");
        pesawat.tampilInfo();
    }
}
