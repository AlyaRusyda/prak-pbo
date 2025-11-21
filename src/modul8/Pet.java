package modul8;

public class Pet {
    protected String nama;

    public void beriNama(String beriNama) {
        this.nama = beriNama;
    }

    public String panggilNama() {
        return this.nama;
    }

    public String perilaku() {
        return "Hewan Penurut";
    }
}

class Kucing extends Pet {
    String makanan;

    @Override
    public String perilaku() {
        return "Hewan agak nakal";
    }

    public void suara() {
        System.out.println("Meeooww... Meeooww");
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public void data() {
        System.out.println(nama);
        System.out.println("Menyukai " + makanan);
    }
}

class Anjing extends Pet {
    String makanan;

    @Override
    public String perilaku() {
        return "Hewan Nurutan";
    }

    public void gonggong() {
        System.out.println("Guk Guk!");
    }
    
    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }
    
    public void data() {
        System.out.println(nama);
        System.out.println("Menyukai " + makanan);
    }
}

class TestPolymorphism {
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
