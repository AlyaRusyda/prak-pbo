package modul7;
class Karyawan {
    private String nama;
    private float gaji;
    private int usia;
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public float getGaji() {
        return gaji;
    }
    
    public void setGaji(float gaji) {
        this.gaji = gaji;
    }
    
    public int getUsia() {
        return usia;
    }
    
    public void setUsia(int usia) {
        this.usia = usia;
    }
}

public class KaryawanDemo {
    public static void main(String[] args) {
        Karyawan k1 = new Karyawan();
        k1.setNama("Luffy");
        k1.setGaji(2500000);
        k1.setUsia(21);
        
        System.out.println(k1.getNama());
        System.out.println(k1.getGaji());
        System.out.println(k1.getUsia());
    }
}
