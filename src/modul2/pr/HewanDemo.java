package modul2.pr;
public class HewanDemo {
    public static void main(String[] args) {
        Hewan harimau = new Hewan();
        harimau.identitas("Harimau", 4, "Daging", "Karnivora");
        harimau.infoHewan();
        
        Hewan kerbau = new Hewan();
        kerbau.identitas("Kerbau", 4, "Rumput", "Herbivora");
        kerbau.infoHewan();
        
        Hewan monyet = new Hewan();
        monyet.identitas("Monyet", 2, "Semuanya", "Omnivora");
        monyet.infoHewan();
    }
}
