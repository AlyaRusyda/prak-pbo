package modul2.pr;
public class Mahasiswa {
    String nama;
    String nim;
    String alamat;
    int semester;
    
    void tampilkanNama(String namaMhs){
        nama = namaMhs;
        System.out.println("Nama\t: " + nama);
    }
    
    void tampilkanNim(String nimMhs){
        nim = nimMhs;
        System.out.println("NIM\t: " + nim);
    }
    
    void tampilkanAlamat(String alamatMhs){
        alamat = alamatMhs;
        System.out.println("Alamat\t: " + alamat);
    }
    
    void tampilkanSemester(int semesterMhs){
        semester = semesterMhs;
        System.out.println("Semester: " + semester);
    }
}
