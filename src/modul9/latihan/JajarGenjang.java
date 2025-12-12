package modul9.latihan;

public class JajarGenjang extends methodAbstract {
    int alas = 10;
    int tinggi = 5;
    int sisiMiring = 7;

    @Override
    public int luas() {
        return alas * tinggi;
    }

    @Override
    public int keliling() {
        return 2 * (alas + sisiMiring);
    }
}
