package modul4;
public class ReadPrivate {
    public static void main(String[] args) {
        PrivateModifier pm = new PrivateModifier();
        pm.printInfo();
        System.out.println(pm.nama);
        System.out.println(pm.umur);
    }
}
// Private modifier hanya bisa diakses dalam class yang sama