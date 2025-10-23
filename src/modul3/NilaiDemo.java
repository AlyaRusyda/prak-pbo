package modul3;

public class NilaiDemo {
    public static void main(String[] args) {
        Nilai nilai = new Nilai();

        nilai.setNilai(80.5, 75, 90);
        System.out.println("UTS\t: " + nilai.getNilaiUTS());
        System.out.println("UAS\t: " + nilai.getNilaiUAS());
        System.out.println("Tugas\t: " + nilai.getNilaiTugas());
        System.out.println("Total\t: " + nilai.getNilaiTotal());
    }
}
