package lat_uts;
public class Espresso extends Kopi {
    String nama;
    public Espresso(double volume, String rasa) {
        super(volume, rasa);
        nama = "Espresso";
    }
    
    public void tampilInfo() {
        System.out.println("Nama\t: " + nama);
        System.out.println("Volume\t: " + volume);
        System.out.println("Rasa\t: " + rasa);
    }
}
