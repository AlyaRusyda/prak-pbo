package modul6.tugas;
public class PersegiPanjang extends BangunDatar {
    protected int panjang;
    protected double lebar;

    public PersegiPanjang(int panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        luas = panjang * lebar;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2 * (panjang + lebar);
        return keliling;
    }

    @Override
    public void tampilInfo() {
        System.out.println("===== Persegi Panjang =====");
        System.out.println("Panjang\t: " + panjang);
        System.out.println("Lebar\t: " + lebar);
        System.out.println("Luas\t: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}
