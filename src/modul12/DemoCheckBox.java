package modul12;

import java.awt.*;
import javax.swing.*;

public class DemoCheckBox {

    public static void main(String[] args) {

        Utama u = new Utama();
        u.setSize(300, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel judul = new JLabel("Ubah Warna:");
        u.add(judul, BorderLayout.NORTH);

        JPanel blokMerah = new JPanel();
        blokMerah.setPreferredSize(new Dimension(40, 40));
        blokMerah.setBackground(Color.WHITE);

        JPanel blokKuning = new JPanel();
        blokKuning.setPreferredSize(new Dimension(40, 40));
        blokKuning.setBackground(Color.WHITE);

        JPanel blokHijau = new JPanel();
        blokHijau.setPreferredSize(new Dimension(40, 40));
        blokHijau.setBackground(Color.WHITE);

        JCheckBox cMerah = new JCheckBox("Merah");
        JCheckBox cKuning = new JCheckBox("Kuning");
        JCheckBox cHijau = new JCheckBox("Hijau");

        cMerah.addActionListener(e -> {
            if (cMerah.isSelected())
                blokMerah.setBackground(Color.RED);
            else
                blokMerah.setBackground(Color.WHITE);
        });

        cKuning.addActionListener(e -> {
            if (cKuning.isSelected())
                blokKuning.setBackground(Color.YELLOW);
            else
                blokKuning.setBackground(Color.WHITE);
        });

        cHijau.addActionListener(e -> {
            if (cHijau.isSelected())
                blokHijau.setBackground(Color.GREEN);
            else
                blokHijau.setBackground(Color.WHITE);
        });

        panel.add(cMerah);
        panel.add(blokMerah);

        panel.add(cKuning);
        panel.add(blokKuning);

        panel.add(cHijau);
        panel.add(blokHijau);

        u.add(panel);
        u.setVisible(true);
    }
}