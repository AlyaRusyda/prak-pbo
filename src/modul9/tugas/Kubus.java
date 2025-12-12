package modul9.tugas;

public class Kubus extends Abstract {
    int sisi = 4;

    @Override
    public int volume() {
        return sisi * sisi * sisi;
    }

    @Override
    public int luasPermukaan() {
        return 6 * sisi * sisi;
    }
}