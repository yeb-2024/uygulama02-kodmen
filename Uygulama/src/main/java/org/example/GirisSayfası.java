package org.example;

import javax.swing.*;
import java.awt.*;

public class GirisSayfası {

    JFrame frame;
    public GirisSayfası() {
        frame = new JFrame("Giriş Sayfası");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(3,1));
        frame.setVisible(true);
    }

}
