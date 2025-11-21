package modul8;
public class Sepeda {
    void run() {
        System.out.println("Bisa berjalan");
    }
}

class SepedaAir extends Sepeda {
    @Override
    void run() {
        System.out.println("Hanya bisa berjalan di atas" + " air");
    }
    
    public static void main(String[] args) {
        Sepeda s = new SepedaAir(); //upcasting
        s.run();
    }
}
