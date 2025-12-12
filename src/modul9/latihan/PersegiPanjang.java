package modul9.latihan;

public class PersegiPanjang extends methodAbstract {
    int panjang = 6;
    int lebar = 4;

    @Override
    public int luas() {
        return panjang * lebar;
    }

    @Override
    public int keliling() {
        return 2 * (panjang + lebar);
    }
}