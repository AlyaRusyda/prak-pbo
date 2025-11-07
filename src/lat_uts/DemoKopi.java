package lat_uts;

class Kopi {
    double volume;
    String rasa;

    Kopi(double v, String r) {
        volume = v;
        rasa = r;
    }

    void info() {
        System.out.println(volume + "ml - " + rasa);
    }
}

class Espresso extends Kopi {
    Espresso(double v, String r) { super(v, r); }
}

class Latte extends Kopi {
    Latte(double v, String r) { super(v, r); }
}

class Americano extends Kopi {
    Americano(double v, String r) { super(v, r); }
}

public class DemoKopi {
    public static void main(String[] args) {
        new Espresso(60, "Strong").info();
        new Latte(120, "Creamy").info();
        new Americano(100, "Mild").info();
    }
}