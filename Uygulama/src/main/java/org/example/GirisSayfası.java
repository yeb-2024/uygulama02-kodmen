package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GirisSayfası implements ActionListener {

    JFrame frame;
    JTextField kullaniciAdi;
    JTextField sifre;
    JButton button;

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

        button = new JButton("Giriş Yap");
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.addActionListener(this);


        frame = new JFrame("Giriş Sayfası");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new GridLayout(3,1));

        frame.add(panelUst);
        frame.add(panelAlt);
        frame.add(button);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            String kullaniciAdi = this.kullaniciAdi.getText().trim();
            String sifre = this.sifre.getText().trim();

            if (kullaniciAdi.isEmpty() || sifre.isEmpty() ){
                JOptionPane.showMessageDialog(
                        null,
                        "Lütfen tüm alanları doldurun!",
                        "Hata",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }



}
