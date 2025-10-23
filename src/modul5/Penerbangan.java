package modul5;

public class Penerbangan {
    String bandaraAsal;
    String kodePenerbangan;
    String tujuan;
    String waktuBerangkat;

    public Penerbangan() {
        bandaraAsal = "Soekarno-Hatta International Airport";
    }

    public Penerbangan(String kodePenerbangan, String tujuan, String waktuBerangkat) {
        this();
        this.kodePenerbangan = kodePenerbangan;
        this.tujuan = tujuan;
        this.waktuBerangkat = waktuBerangkat;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Penerbangan : " + kodePenerbangan);
        System.out.println("Asal             : " + bandaraAsal);
        System.out.println("Tujuan           : " + tujuan);
        System.out.println("Waktu Berangkat  : " + waktuBerangkat);
        System.out.println("-------------------------------------------");
    }
}
