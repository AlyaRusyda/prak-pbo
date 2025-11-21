package modul8;

class CustomerData {
    String nama;
    String alamat;
    String tanggalLahir;
    String pekerjaan;
    double gaji;

    public CustomerData() {
    }

    public CustomerData(String nama) {
        this.nama = nama;
    }

    public CustomerData(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public CustomerData(String nama, String alamat, String tanggalLahir, String pekerjaan, double gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
    }

    public void tampil() {
        System.out.println("Nama           : " + nama);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Tanggal Lahir  : " + tanggalLahir);
        System.out.println("Pekerjaan      : " + pekerjaan);
        System.out.println("Gaji           : " + gaji);
        System.out.println("-----------------------------------");
    }
}

public class DemoCust {

    public static void main(String[] args) {

        CustomerData c1 = new CustomerData("Zalfa", "Malang", "12-03-2005", "Mahasiswa", 2000000);
        CustomerData c2 = new CustomerData("Fikri", "Jakarta", "02-07-2004", "Programmer", 7000000);
        CustomerData c3 = new CustomerData("Rani");
        CustomerData c4 = new CustomerData("Jihan", "Surabaya");
        CustomerData c5 = new CustomerData("Yasmin", "Bandung", "10-01-2003", "Designer", 5000000);
        CustomerData c6 = new CustomerData("Grisel", "Solo", "05-05-2000", "Guru", 4500000);
        CustomerData c7 = new CustomerData("Celline", "Semarang", "21-09-2002", "Perawat", 6000000);
        CustomerData c8 = new CustomerData("Jihan", "Depok", "14-11-2001", "Editor", 5500000);
        CustomerData c9 = new CustomerData("Oryza", "Bogor", "09-06-2000", "Barista", 4000000);
        CustomerData c10 = new CustomerData("Celline", "Yogyakarta", "30-08-2003", "Freelancer", 3500000);

        c1.tampil();
        c2.tampil();
        c3.tampil();
        c4.tampil();
        c5.tampil();
        c6.tampil();
        c7.tampil();
        c8.tampil();
        c9.tampil();
        c10.tampil();
    }
}
