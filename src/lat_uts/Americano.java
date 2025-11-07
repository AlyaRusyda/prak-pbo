package lat_uts;
public class Americano extends Kopi {
    String nama;
    public Americano(double volume, String rasa) {
        super(volume, rasa);
        nama = "Americano";
    }
    
    public void tampilInfo() {
        System.out.println("Nama\t: " + nama);
        System.out.println("Volume\t: " + volume);
        System.out.println("Rasa\t: " + rasa);
    }
}
