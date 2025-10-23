package modul2.pr;
public class Hewan {
    String nama;
    int kaki;
    String makan;
    String type;
    
    void identitas(String namaHewan, int kakiHewan, String makanHewan, String typeHewan){
        nama = namaHewan;
        kaki = kakiHewan;
        makan = makanHewan;
        type = typeHewan;
    }
    
//    void jmlKaki(int kakiHewan) {
//        kaki = kakiHewan;
//    }
//    
//    void beriMakan(String makanHewan) {
//        makan = makanHewan;
//    }
//    
//    void jenisHewan(String typeHewan) {
//        type = typeHewan;
//    }
    
    void infoHewan() {
        System.out.println(
            "Nama Hewan\t: " + nama + "\nJumlah Kaki\t: " + kaki + "\nMakanan\t\t: " + makan +
            "\nType Hewan\t: " + type + "\n"
        );
    }
}
