package org.example;

import javax.swing.*;
import java.awt.*;

public class GirisSayfası {

    JFrame frame;
    JTextField kullaniciAdi;

    public GirisSayfası() {

        JPanel panelUst = new JPanel();
        panelUst.setLayout(new FlowLayout());
        JLabel labelUst = new JLabel("Kullanıcı Adı:");
        labelUst.setFont(new Font("Arial", Font.PLAIN, 20));

        kullaniciAdi = new JTextField();
        kullaniciAdi.setPreferredSize(new Dimension(200, 40));

        panelUst.add(labelUst);
        panelUst.add(kullaniciAdi);

        frame = new JFrame("Giriş Sayfası");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(3,1));

        frame.add(panelUst);
        frame.setVisible(true);
    }

}
