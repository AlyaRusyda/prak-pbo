package modul9.tugas;

public class PrismaSegitiga extends Abstract {
    int luasAlas = 20;
    int tinggi = 12;
    int luasSelimut = 24;

    @Override
    public int volume() {
        return luasAlas * tinggi;
    }

    @Override
    public int luasPermukaan() {
        return (tinggi * luasSelimut) + (2 * luasAlas);
    }
}