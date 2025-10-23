package modul2.modul2;
public class RotiDemo {
    public static void main(String[] args) {
        Roti roti = new Roti();
        roti.beriWarna("Hijau");
        roti.beriRasa("Pandan");
        roti.timbangBerat(30);
        roti.hargaJual(6000);
        roti.infoRoti();
        
        Roti roti1 = new Roti();
        roti1.beriWarna("Ungu");
        roti1.beriRasa("Blueberry");
        roti1.timbangBerat(40);
        roti1.hargaJual(7000);
        roti1.infoRoti();
        
        Roti roti2 = new Roti();
        roti2.beriWarna("Coklat");
        roti2.beriRasa("Coklat");
        roti2.timbangBerat(50);
        roti2.hargaJual(8000);
        roti2.infoRoti();
        
        Roti roti3 = new Roti();
        roti3.beriWarna("Cream");
        roti3.beriRasa("Butter");
        roti3.timbangBerat(90);
        roti3.hargaJual(5000);
        roti3.infoRoti();
    }
}

