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
        Laptop L1 = new Laptop("ASUS", 8, "Intel i5");
        Laptop L2 = new Laptop("Acer", 16, "AMD Ryzen 7");

        System.out.println(L1.info());
        System.out.println(L2.info());
    }
}
