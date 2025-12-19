package latquiz_uas;

abstract class BangunDatar {

    abstract double hitungLuas();

    void info() {
        System.out.println("Perhitungan Bangun Datar");
    }
}

class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }
}

public class MainBangunDatar {
    public static void main(String[] args) {
        Persegi p = new Persegi(5);
        p.info();
        System.out.println("Luas Persegi: " + p.hitungLuas());
    }
}
