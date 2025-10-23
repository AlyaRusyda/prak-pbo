package modul3;
public class Pegawai {
    String nama;
    int nip;
    double gaji;
    
    void tampilInfo(String name, int id, double salary) {
        nama = name;
        nip = id;
        gaji = salary;
        System.out.println("Nama\t:" + nama + "\nNIP\t:" + nip + "\ngaji\t:" + gaji + "\n");
    }
    
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        p1.tampilInfo("Naila", 21, 5000000);
        
        Pegawai p2 = new Pegawai();
        p2.tampilInfo("Raisya", 32, 6000000);
        
        Pegawai p3 = new Pegawai();
        p3.tampilInfo("Yulia", 42, 7000000);
        
        Pegawai p4 = new Pegawai();
        p4.tampilInfo("Rara", 29, 8000000);
            
        Pegawai p5 = new Pegawai();
        p5.tampilInfo("Friza", 12, 9000000);
    }
}
