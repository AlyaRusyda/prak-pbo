package modul9.tugas;

public class Bola extends Abstract {
    int jarijari = 7;
    double phi = 3.14;

    @Override
    public int volume() {
        return (int) (phi * jarijari * jarijari * jarijari * 4 / 3);
    }

    @Override
    public int luasPermukaan() {
        return (int) (phi * jarijari * jarijari * 4);
    }
}