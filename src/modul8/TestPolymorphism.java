package modul8;
public class TestPolymorphism {
    public static void main(String[] args) {

        Kucing k = new Kucing();
        Anjing a = new Anjing();

        k.beriNama("TOM");
        k.setMakanan("Ikan");

        a.beriNama("BULL");
        a.setMakanan("Daging dan Tulang");

        k.data();
        k.suara();
        
        a.data();
        a.gonggong();
    }
}