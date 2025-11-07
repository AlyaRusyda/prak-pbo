package lat_uts;

public class KopiDemo {
    public static void main(String[] args) {
        Espresso e = new Espresso(200, "Pahit");
        Latte l = new Latte(500, "Manis");
        Americano a = new Americano(100, "Puahit");

        e.tampilInfo();
        System.out.println("");
        l.tampilInfo();
        System.out.println("");
        a.tampilInfo();
    }
}
