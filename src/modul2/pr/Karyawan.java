package modul2.pr;
public class Karyawan {
    String nama;
    String alamat;
    String jabatan;
    double gaji;
    
    void tampilkanNama(String namaKar){
        nama = namaKar;
        System.out.println("Nama\t: " + nama);
    }
    
    void tampilkanJabatan(String jabatanKar){
        jabatan = jabatanKar;
        System.out.println("Jabatan\t: " + jabatan);
    }
    
    void tampilkanAlamat(String alamatKar){
        alamat = alamatKar;
        System.out.println("Alamat\t: " + alamat);
    }
    
    void tampilkanGaji(double gajiKar){
        gaji = gajiKar;
        System.out.println("Gaji\t: " + gaji);
    }
}
