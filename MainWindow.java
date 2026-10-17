
package view;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow(String[] namaKarakter, int[] levelKarakter) {
        setTitle("Daftar Karakter Game");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(
            BorderFactory.createEmptyBorder(20, 20, 20, 20)
        );

        JLabel judul = new JLabel("Daftar Karakter");
        judul.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(judul);
        panel.add(Box.createVerticalStrut(10));

        int totalLevel = 0;

        // Loop untuk menampilkan semua karakter
        for (int i = 0; i < namaKarakter.length; i++) {
            JLabel labelKarakter = new JLabel(
                namaKarakter[i] + " - Level " + levelKarakter[i]
            );

            panel.add(labelKarakter);
            totalLevel += levelKarakter[i];
        }

        // Menghitung rata-rata dengan aman
        double rataRata = namaKarakter.length > 0
            ? (double) totalLevel / namaKarakter.length
            : 0.0;

        panel.add(Box.createVerticalStrut(15));

        JLabel statistik = new JLabel(
            String.format(
                java.util.Locale.US,
                "Rata-rata Level: %.2f",
                rataRata
            )
        );

        statistik.setFont(new Font("Arial", Font.BOLD, 14));
        panel.add(statistik);

        add(panel);
        setVisible(true);
    }
}

