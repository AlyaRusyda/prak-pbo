package modul9.latihan;

public class Lingkaran extends methodAbstract {
    int jarijari = 5;
    int diameter = 10;
    double phi = 3.14;

    @Override
    public int luas() {
        return (int) (phi * jarijari * jarijari);
    }

    @Override
    public int keliling() {
        return (int) (phi * diameter);
    }
}