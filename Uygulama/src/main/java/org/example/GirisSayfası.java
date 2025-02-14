package org.example;

import javax.swing.*;
import java.awt.*;

public class GirisSayfası {

    JFrame frame;
    JTextField kullaniciAdi;
    JTextField sifre;

    public GirisSayfası() {

        JPanel panelUst = new JPanel();
        panelUst.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JLabel labelUst = new JLabel("Kullanıcı Adı:");
        labelUst.setFont(new Font("Arial", Font.PLAIN, 20));

        kullaniciAdi = new JTextField();
        kullaniciAdi.setPreferredSize(new Dimension(300, 60));

        panelUst.add(labelUst);
        panelUst.add(kullaniciAdi);

        JPanel panelAlt = new JPanel();
        panelAlt.setLayout(new FlowLayout(FlowLayout.RIGHT));

        JLabel labelAlt = new JLabel("Şifre: ");
        labelAlt.setFont(new Font("Arial", Font.PLAIN, 20));

        sifre = new JTextField();
        sifre.setPreferredSize(new Dimension(300, 60));

        panelAlt.add(labelAlt);
        panelAlt.add(sifre);


        frame = new JFrame("Giriş Sayfası");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new GridLayout(3,1));

        frame.add(panelUst);
        frame.add(panelAlt);

        frame.setVisible(true);
    }

}
