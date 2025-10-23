package modul2.modul2;
public class Roti {
    String warna;
    String rasa;
    int berat;
    double harga;
    
    void beriWarna(String warnaRoti) {
        warna = warnaRoti;
    }
    
    void beriRasa(String rasaRoti) {
        rasa = rasaRoti;
    }
    
    void timbangBerat(int beratRoti) {
        berat = beratRoti;
    }
    
    void hargaJual(double hargaRoti) {
        harga = hargaRoti;
    }
    
    void infoRoti() {
        System.out.println(
            "Warna Roti \t: " + warna + "\nRasa Roti \t: " + rasa + "\nBerat Roti \t: " + berat +
            "\nHarga Roti \t: " + harga + "\n"
        );
    }
    
}
