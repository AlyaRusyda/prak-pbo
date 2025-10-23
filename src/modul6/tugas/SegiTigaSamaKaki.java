package modul6.tugas;
public class SegiTigaSamaKaki extends SegiTiga {
    protected double sisiMiring;

    public SegiTigaSamaKaki(double alas, double tinggi, double sisiMiring) {
        super(alas, tinggi);
        this.sisiMiring = sisiMiring;
    }

    @Override
    public double hitungKeliling() {
        keliling = alas + (2 * sisiMiring);
        return keliling;
    }

    @Override
    public void tampilInfo() {
        System.out.println("===== Segitiga Sama Kaki =====");
        System.out.println("Alas\t: " + alas);
        System.out.println("Tinggi\t: " + tinggi);
        System.out.println("Sisi Miring: " + sisiMiring);
        System.out.println("Luas\t: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}
