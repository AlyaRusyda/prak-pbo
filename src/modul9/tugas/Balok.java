package modul9.tugas;

public class Balok extends Abstract {
    int tinggi = 3;
    int panjang = 8;
    int lebar = 5;

    @Override
    public int volume() {
        return tinggi * panjang * lebar;
    }

    @Override
    public int luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}