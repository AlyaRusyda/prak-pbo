package latquiz_uas;

class Hewan {
    String bersuara() {
        return "Hewan bersuara";
    }
}

class Kucing extends Hewan {
    @Override
    String bersuara() {
        return "Meong";
    }
}

class Anjing extends Hewan {
    @Override
    String bersuara() {
        return "Guk guk";
    }
}

public class DemoHewan {
    public static void main(String[] args) {

        Hewan hewan = new Hewan();
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();

        System.out.println(hewan.bersuara());
        System.out.println(kucing.bersuara());
        System.out.println(anjing.bersuara());
    }
}
