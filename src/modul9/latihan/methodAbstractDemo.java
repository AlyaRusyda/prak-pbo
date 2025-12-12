package modul9.latihan;

public class methodAbstractDemo {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        JajarGenjang jg = new JajarGenjang();
        Lingkaran lkn = new Lingkaran();
        Segitiga sgt = new Segitiga();

        System.out.println("Persegi Panjang" + "\n" +
                "Luas     = " + pp.getLuas() + "\n" +
                "Keliling = " + pp.getKell());

        System.out.println("\nJajar Genjang" + "\n" +
                "Luas     = " + jg.getLuas() + "\n" +
                "Keliling = " + jg.getKell());

        System.out.println("\nLingkaran" + "\n" +
                "Luas     = " + lkn.getLuas() + "\n" +
                "Keliling = " + lkn.getKell());

        System.out.println("\nSegitiga" + "\n" +
                "Luas     = " + sgt.getLuas() + "\n" +
                "Keliling = " + sgt.getKell());
    }
}