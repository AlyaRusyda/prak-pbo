package modul9.latihan;

public class Segitiga extends methodAbstract {
    int alas = 8;
    int tinggi = 5;
    int sisi = 8;

    @Override
    public int luas() {
        return alas * tinggi / 2;
    }

    @Override
    public int keliling() {
        return 3 * sisi;
    }
}