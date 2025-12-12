package modul9.tugas;

public abstract class Abstract {
    public abstract int volume();
    public abstract int luasPermukaan();

    public int getVolume() {
        return volume();
    }
    
    public int getLuasPermukaan() {
        return luasPermukaan();
    }
}