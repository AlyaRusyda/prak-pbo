package modul3;
public class LocalVariable {
    int usia = 0;

    public void hitungUsia() {
//        int usia = 0;
        int tahunSekarang = 2025;
        int tahunLahir = 2006;
        
        usia = tahunSekarang - tahunLahir;
        System.out.println("Usia: " + usia);
    }
    
    void beratBadan() {
        int beratLahir  = 50;
        int beratBadan = beratLahir + (usia/2);
        System.out.println("Berat badan: " + beratBadan);
    }
    
    public static void main(String[] args) {
        LocalVariable p1 = new LocalVariable();
        p1.hitungUsia();
        p1.beratBadan();
    }
}