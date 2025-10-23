package modul6.tugas;

public class DemoBangunDatar {
    public static void main(String[] args) {
        Persegi persegi = new Persegi(5);
        PersegiPanjang pp = new PersegiPanjang(4, 6);
        SegiTiga segitiga = new SegiTiga(6, 4);
        SegiTigaSamaKaki stk = new SegiTigaSamaKaki(6, 4, 5);
        SegiTigaSamaSisi sts = new SegiTigaSamaSisi(6);

        persegi.tampilInfo();
        System.out.println();

        pp.tampilInfo();
        System.out.println();

        segitiga.tampilInfo();
        System.out.println();

        stk.tampilInfo();
        System.out.println();

        sts.tampilInfo();
    }
}
