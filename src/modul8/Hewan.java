package modul8;
public class Hewan {
    public void jalan() {
        System.out.println("Hewan bisa berjalan");
    }
}

class Kucing extends Hewan {
    @Override
    public void jalan() {
        System.out.println("Kucing bisa berjalan" + " dan berlari");
    }
}

class Elang extends Hewan {
    @Override
    public void jalan() {
        System.out.println("Elang berjalan dengan kaki tetapi lebih suka terbang");
    }
}

class Demo {
    public static void main(String[] args) {
        new Hewan().jalan();
        new Kucing().jalan();
        new Elang().jalan();
    }
}
