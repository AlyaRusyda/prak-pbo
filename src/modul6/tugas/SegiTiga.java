package modul6.tugas;
public class SegiTiga extends BangunDatar {
    protected double alas;
    protected double tinggi;

    public SegiTiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        luas = 0.5 * alas * tinggi;
        return luas;
    }

    @Override
    public void tampilInfo() {
        System.out.println("===== Segitiga =====");
        System.out.println("Alas\t: " + alas);
        System.out.println("Tinggi\t: " + tinggi);
        System.out.println("Luas\t: " + hitungLuas());
    }
}
