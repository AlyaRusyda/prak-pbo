package lat_uts;

class Kopi {
    double volume;
    String rasa;
    String nama;

    Kopi(double v, String r) {
        volume = v;
        rasa = r;
    }

    void info() {
        System.out.println("Jenis\t: " + nama);
        System.out.println("Volume\t: " + volume + "ml");
        System.out.println("Rasa\t: " + rasa + "\n");
    }
}

class Espresso extends Kopi {
    Espresso(double v, String r) {
        super(v, r);
        nama = "Espresso";
    }
}

class Latte extends Kopi {
    Latte(double v, String r) {
        super(v, r);
        nama = "Latte";
    }
}

class Americano extends Kopi {
    Americano(double v, String r) {
        super(v, r);
        nama = "Americano";
    }
}

public class KopiDemo {
    public static void main(String[] args) {
        new Espresso(60, "Strong").info();
        new Latte(120, "Creamy").info();
        new Americano(100, "Mild").info();
    }
}
