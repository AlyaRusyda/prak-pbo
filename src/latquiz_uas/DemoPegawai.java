package latquiz_uas;

import javax.swing.*;
import java.awt.event.*;

interface Bonus {
    double hitungBonus();
}

abstract class Pegawai {
    private String nama;

    Pegawai(String nama) {
        this.nama = nama;
    }

    abstract double hitungGaji();

    String getNama() {
        return nama;
    }
}

class PegawaiTetap extends Pegawai implements Bonus {
    private double gajiPokok;

    PegawaiTetap(String nama, double gajiPokok) {
        super(nama);
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    @Override
    double hitungGaji() {
        return gajiPokok;
    }

    @Override
    public double hitungBonus() {
        return gajiPokok * 0.1;
    }
}

class PegawaiKontrak extends Pegawai {
    private int jamKerja;
    private double gajiJam;

    PegawaiKontrak(String nama, int jamKerja, double gajiJam) {
        super(nama);
        this.jamKerja = jamKerja;
        this.gajiJam = gajiJam;
    }

    @Override
    double hitungGaji() {
        return jamKerja * gajiJam;
    }
}

public class DemoPegawai {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Data Pegawai");
        frame.setSize(400, 420);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ===== INPUT PEGAWAI TETAP =====
        JLabel lblNamaTetap = new JLabel("Nama Pegawai Tetap");
        lblNamaTetap.setBounds(20, 20, 200, 20);
        JTextField tfNamaTetap = new JTextField();
        tfNamaTetap.setBounds(20, 45, 200, 25);

        JLabel lblGajiPokok = new JLabel("Gaji Pokok");
        lblGajiPokok.setBounds(20, 75, 200, 20);
        JTextField tfGajiPokok = new JTextField();
        tfGajiPokok.setBounds(20, 100, 200, 25);

        // ===== INPUT PEGAWAI KONTRAK =====
        JLabel lblNamaKontrak = new JLabel("Nama Pegawai Kontrak");
        lblNamaKontrak.setBounds(20, 135, 200, 20);
        JTextField tfNamaKontrak = new JTextField();
        tfNamaKontrak.setBounds(20, 160, 200, 25);

        JLabel lblJam = new JLabel("Jam Kerja");
        lblJam.setBounds(20, 190, 200, 20);
        JTextField tfJam = new JTextField();
        tfJam.setBounds(20, 215, 200, 25);

        JLabel lblGajiJam = new JLabel("Gaji per Jam");
        lblGajiJam.setBounds(20, 245, 200, 20);
        JTextField tfGajiJam = new JTextField();
        tfGajiJam.setBounds(20, 270, 200, 25);

        // ===== OUTPUT =====
        JTextArea area = new JTextArea();
        area.setBounds(20, 305, 340, 70);
        area.setEditable(false);

        // ===== ACTION (ENTER DI FIELD TERAKHIR) =====
        tfGajiJam.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String namaTetap = tfNamaTetap.getText();
                double gajiPokok = Double.parseDouble(tfGajiPokok.getText());

                String namaKontrak = tfNamaKontrak.getText();
                int jam = Integer.parseInt(tfJam.getText());
                double gajiJam = Double.parseDouble(tfGajiJam.getText());

                PegawaiTetap p1 = new PegawaiTetap(namaTetap, gajiPokok);
                PegawaiKontrak p2 = new PegawaiKontrak(namaKontrak, jam, gajiJam);

                area.setText(
                        "=== Pegawai Tetap ===\n" +
                        "Nama  : " + p1.getNama() + "\n" +
                        "Gaji  : " + p1.hitungGaji() + "\n" +
                        "Bonus : " + p1.hitungBonus() + "\n\n" +

                        "=== Pegawai Kontrak ===\n" +
                        "Nama  : " + p2.getNama() + "\n" +
                        "Gaji  : " + p2.hitungGaji()
                );
            }
        });

        // ===== ADD =====
        frame.add(lblNamaTetap);
        frame.add(tfNamaTetap);
        frame.add(lblGajiPokok);
        frame.add(tfGajiPokok);

        frame.add(lblNamaKontrak);
        frame.add(tfNamaKontrak);
        frame.add(lblJam);
        frame.add(tfJam);
        frame.add(lblGajiJam);
        frame.add(tfGajiJam);

        frame.add(area);
        frame.setVisible(true);
    }
}
