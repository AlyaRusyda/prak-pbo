package modul2.pr;
public class KaryawanDemo {
    public static void main(String[] args) {
        Karyawan kar = new Karyawan();
        System.out.println("Data Karyawan");
        kar.tampilkanNama("Adnan");
        kar.tampilkanJabatan("Supervisor");
        kar.tampilkanAlamat("Bulu");
        kar.tampilkanGaji(8000000);
    }
}
