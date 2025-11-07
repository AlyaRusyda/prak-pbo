package lat_uts;

class Laptop {
    String merk;
    int ram;
    String prosesor;

    public Laptop(String m, int r, String p) {
        merk = m;
        ram = r;
        prosesor = p;
    }

    public String info() {
        return "Laptop: " + merk + ", RAM: " + ram + "GB, Prosesor: " + prosesor;
    }
}

public class LaptopDemo {
    public static void main(String[] args) {
        System.out.println(new Laptop("ASUS", 8, "Intel i5").info());
        System.out.println(new Laptop("Acer", 16, "AMD Ryzen 7").info());
    }
}
