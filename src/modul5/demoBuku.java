package modul5;

public class demoBuku {
    public static void main(String[] args) {
        Buku book1 = new Buku();
        book1.tampilInfo();

        Buku book2 = new Buku("Dewi Lestari", "Perahu Kertas", 2009, 1, 90000);
        book2.tampilInfo();

        Buku book3 = new Buku("Ahmad Fuadi", "Negeri 5 Menara", 2009, 1, 80000);
        book3.tampilInfo();

        Buku book4 = new Buku("Pulang", 2015, 2, 95000);
        book4.tampilInfo();

        Buku book5 = new Buku("Tentang Kamu", 2016, 1, 97000);
        book5.tampilInfo();

        Buku book6 = new Buku("Habiburrahman El Shirazy", "Ayat-Ayat Cinta", 2004, 1, 88000);
        book6.tampilInfo();

        Buku book7 = new Buku("Hafalan Shalat Delisa", 2005, 1, 82000);
        book7.tampilInfo();

        Buku book8 = new Buku("Andrea Hirata", "Sang Pemimpi", 2006, 1, 87000);
        book8.tampilInfo();

        Buku book9 = new Buku("Rembulan Tenggelam di Wajahmu", 2009, 2, 93000);
        book9.tampilInfo();

        Buku book10 = new Buku("Bidadari-Bidadari Surga", 2008, 1, 91000);
        book10.tampilInfo();
    }
}
