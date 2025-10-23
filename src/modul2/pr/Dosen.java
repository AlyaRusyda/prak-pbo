package modul2.pr;
public class Dosen {
    String nama;
    int nik;
    String pendidikan;
    String tgl;
    
    void tampilkanNama(String namaDosen){
        nama = namaDosen;
        System.out.println("Nama\t: " + nama);
    }
    
    void tampilkanTglLahir(String tglLahir) {
        tgl = tglLahir;
        System.out.println("Tanggal Lahir\t: " + tgl);

    }
    
    void tampilkanNik(int nikDosen){
        nik = nikDosen;
        System.out.println("NIK\t: " + nik);
    }
    
}
