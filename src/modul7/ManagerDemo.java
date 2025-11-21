package modul7;

class Manager extends Karyawan {
    private float jamKerja = 7.5f;

    public float getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja() {
        jamKerja = 8.5f;
    }

    public void tampilkanData() {
        System.out.println("Nama       : " + getNama());
        System.out.println("Gaji       : " + getGaji());
        System.out.println("Usia       : " + getUsia());
        System.out.println("Jam Kerja  : " + getJamKerja());
        System.out.println("--------------------------------");
    }
}

public class ManagerDemo {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        Manager m2 = new Manager();
        Manager m3 = new Manager();
        Manager m4 = new Manager();
        Manager m5 = new Manager();

        m1.setNama("Zoro");
        m1.setGaji(5000000);
        m1.setUsia(28);
        m1.setJamKerja();

        m2.setNama("Nami");
        m2.setGaji(6000000);
        m2.setUsia(26);
        m2.setJamKerja();

        m3.setNama("Sanji");
        m3.setGaji(5500000);
        m3.setUsia(27);
        m3.setJamKerja();

        m4.setNama("Usopp");
        m4.setGaji(4500000);
        m4.setUsia(25);
        m4.setJamKerja();

        m5.setNama("Robin");
        m5.setGaji(7000000);
        m5.setUsia(30);
        m5.setJamKerja();

        m1.tampilkanData();
        m2.tampilkanData();
        m3.tampilkanData();
        m4.tampilkanData();
        m5.tampilkanData();
    }
}