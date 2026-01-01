package latquiz_uas;

import javax.swing.*;
import java.awt.*;

interface Bonus {
    double hitungBonus();
}

abstract class Pegawai {
    private String nama;

    Pegawai(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    abstract double hitungGaji();
}

class PegawaiTetap extends Pegawai implements Bonus {
    private double gaji;

    PegawaiTetap(String nama, double gaji) {
        super(nama);
        this.gaji = gaji;
    }

    @Override
    double hitungGaji() {
        return gaji;
    }

    @Override
    public double hitungBonus() {
        return gaji * 0.1;
    }
}

public class DemoPegawai extends JFrame {

    public DemoPegawai() {
        setTitle("Data Pegawai");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField txtNama = new JTextField(15);
        JTextField txtGaji = new JTextField(15);
        JButton btnHitung = new JButton("Hitung");
        JLabel lblHasil = new JLabel("");

        add(new JLabel("Nama:"));
        add(txtNama);
        add(new JLabel("Gaji:"));
        add(txtGaji);
        add(btnHitung);
        add(lblHasil);

        btnHitung.addActionListener(e -> {
            String nama = txtNama.getText();
            double gaji = Double.parseDouble(txtGaji.getText());

            PegawaiTetap p = new PegawaiTetap(nama, gaji);
            lblHasil.setText(
                "Gaji: " + p.hitungGaji() +
                " | Bonus: " + p.hitungBonus()
            );
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new DemoPegawai();
    }
}
