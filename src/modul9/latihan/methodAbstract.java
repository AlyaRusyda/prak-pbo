package modul9.latihan;

public abstract class methodAbstract {
    public abstract int luas();
    public abstract int keliling();

    public int getLuas() {
        return luas();
    }
    
    public int getKell() {
        return keliling();
    }
}