package lat_uts;
public class Laptop {
    String merk;
    int ram;
    String prosesor;
    
    public Laptop(String m, int r, String p){
        merk = m;
        ram = r;
        prosesor = p;
    }
    
    public String info() {
        return "Laptop: " + merk + ", RAM: " + ram + "GB, Prosesor: " + prosesor;
    }
}