package modul3;

public class Nilai {
    double nilaiUTS;
    double nilaiUAS;
    double nilaiTugas;
    double nilaiTotal;

    void setNilai(double uts, double uas, double tugas) {
        nilaiUTS = uts;
        nilaiUAS = uas;
        nilaiTugas = tugas;
        nilaiTotal = (nilaiUTS + nilaiUAS + nilaiTugas) / 3;
    }

    double getNilaiUTS() {
        return nilaiUTS;
    }

    double getNilaiUAS() {
        return nilaiUAS;
    }

    double getNilaiTugas() {
        return nilaiTugas;
    }

    double getNilaiTotal() {
        return nilaiTotal;
    }
}