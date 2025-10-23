package modul6.tugas;
public class Persegi extends BangunDatar {
    protected double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        luas = sisi * sisi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 4 * sisi;
        return keliling;
    }

    @Override
    public void tampilInfo() {
        System.out.println("===== Persegi =====");
        System.out.println("Sisi\t: " + sisi);
        System.out.println("Luas\t: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}
