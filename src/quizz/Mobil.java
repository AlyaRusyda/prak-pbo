package quizz;
public class Mobil {
    String merk;
    int tahun;
    
    public Mobil(String merk, int tahun) {
        this.merk = merk;
        this.tahun = tahun;
    }
    
    public void display() {
        System.out.println("===== Data Mobil =====");
        System.out.println("Merk\t: " + merk + "\nTahun\t: " + tahun + "\n");
    }
    
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", 2024);
        mobil1.display();
        
        Mobil mobil2 = new Mobil("Honda", 2023);
        mobil2.display();
    }
}
