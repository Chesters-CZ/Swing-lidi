package cz.chesters.swinglidi;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Lidi {
    JFrame frame = new JFrame("What's up guys, it's Quandale Dingle here");

    JTable tabule = new JTable(randomBullshit(5, 69), new String[]{"Človjekoidi", "Starost"});

    public void doShit() {
        funguj();
    }

    public void funguj() {
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);

        tabule.setVisible(true);
        tabule.setBounds(3, 3, 580, 358);
        tabule.setBorder(new LineBorder(new Color(0,0,0), 2));
        frame.add(tabule);

    }

    public String[][] randomBullshit(int wordSize, int arraySize) {
        String[][] out = new String[arraySize][2];
        out[0] = new String[]{"Človjekoidi", "Starost"};

        for (int i = 1; i < out.length; i++) {
            StringBuilder borek = new StringBuilder();
            borek.append((char) (Math.random() * (90 - 65) + 65));
            for (int j = 0; j < wordSize; j++){
                borek.append((char) (Math.random() * (122 - 97) + 97));
            }
            out[i][1] = String.valueOf((int) (Math.random() * 120));
            out[i][0] = borek.toString();
        }
        return out;
    }
}
