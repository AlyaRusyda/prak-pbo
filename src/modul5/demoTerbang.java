package modul5;
public class demoTerbang {
    public static void main(String[] args) {
        Penerbangan p1 = new Penerbangan("GA123", "Bali", "07:30");
        Penerbangan p2 = new Penerbangan("JT450", "Makassar", "09:15");
        Penerbangan p3 = new Penerbangan("SQ957", "Singapore", "12:00");

        p1.tampilkanInfo();
        p2.tampilkanInfo();
        p3.tampilkanInfo();
    }
}