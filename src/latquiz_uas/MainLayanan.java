package latquiz_uas;

// Abstract class
abstract class Layanan {
    abstract double hitungBiaya();
}

// Layanan Listrik
class Listrik extends Layanan {
    private int kwh;
    private final double tarif = 1500;
    private final int batas = 100;

    Listrik(int kwh) {
        this.kwh = kwh;
    }

    @Override
    double hitungBiaya() {
        double total = kwh * tarif;
        if (kwh > batas) {
            total += 50000; // biaya tambahan
        }
        return total;
    }
}

// Layanan Internet
class Internet extends Layanan {
    private int gb;
    private final double tarifPerGB = 10000;
    private final double biayaBulanan = 50000;

    Internet(int gb) {
        this.gb = gb;
    }

    @Override
    double hitungBiaya() {
        return (gb * tarifPerGB) + biayaBulanan;
    }
}

// Main class
public class MainLayanan {
    public static void main(String[] args) {

        Layanan listrik = new Listrik(120);
        Layanan internet = new Internet(10);

        System.out.println("Biaya Listrik : Rp" + listrik.hitungBiaya());
        System.out.println("Biaya Internet : Rp" + internet.hitungBiaya());
    }
}
