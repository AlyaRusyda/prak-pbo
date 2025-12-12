package modul9.tugas;

public class Kerucut extends Abstract {
    int jarijari = 3;
    int tinggi = 8;
    int sisi = 12;
    double phi = 3.14;

    public int volume() {
        return (int) (phi * jarijari * jarijari * tinggi / 3);
    }

    public int luasPermukaan() {
        return (int) (phi * jarijari * (jarijari + sisi));
    }
}