package quizz;
public class Mahasiswa {
    private double nilaiUTS, nilaiUAS, nilaiTugas;
    
    public Mahasiswa(double nilaiUTS, double nilaiUAS, double nilaiTugas) {
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        this.nilaiTugas = nilaiTugas;
    }
    
    public double avg() {
        return (nilaiUTS + nilaiUAS + nilaiTugas)/3;
    }
    
    public char grade() {
        double avg = avg();
        char grade = 0;
        if (avg <= 100 && avg >= 80) {
            grade = 'A';
        } else if (avg <= 79 && avg >= 70) {
            grade = 'B';
        } else if (avg <= 69 && avg >= 60) {
            grade = 'C';
        } else if (avg < 60) {
            grade = 'D';
        } else {
            System.out.println("Input nilai tidak benar");
        }
        return grade;
    }
    
    public void display() {
        System.out.println("======= Data Nilai =======");
        System.out.println("Nilai UTS\t: " + nilaiUTS);
        System.out.println("Nilai UAS\t: " + nilaiUAS);
        System.out.println("Rata-rata\t: " + avg());
        System.out.println("Grade\t\t: " + grade());
    }
}
