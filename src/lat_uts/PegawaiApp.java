package lat_uts;
public class PegawaiApp {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        Pegawai p2 = new Pegawai("Budi", "Marketing", 5000000);
        
        p1.tampilkanData();
        p2.tampilkanData();
    }
}
