package modul6.tugas;

public class SegiTigaSamaSisi extends SegiTiga {
    protected double sisi;

    public SegiTigaSamaSisi(double sisi) {
        super(sisi, (Math.sqrt(3) / 2) * sisi); // tinggi segitiga sama sisi
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
        keliling = 3 * sisi;
        return keliling;
    }

    @Override
    public void tampilInfo() {
        System.out.println("===== Segitiga Sama Sisi =====");
        System.out.println("Sisi\t: " + sisi);
        System.out.println("Tinggi\t: " + tinggi);
        System.out.println("Luas\t: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}
