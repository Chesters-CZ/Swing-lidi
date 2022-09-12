package cz.chesters.swinglidi;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Lidi {
    JFrame frame = new JFrame("What's up guys, it's Quandale Dingle here");


    JTable tabule = new JTable(new DefaultTableModel(randomBullshit(8, 8), new String[]{"Človjekoidi", "Starost"}));
    JTextField imput = new JTextField();
    JButton deleteRow = new JButton("Delete selected rows");
    JButton addRow = new JButton("Add a row");

    public void doShit() {
        funguj();
    }

    public void funguj() {
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);

        prepare(tabule);
        tabule.setBounds(1, 45, 582, 412);
        tabule.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        tabule.setDefaultRenderer(Object.class, new TohleVsechnoJenomAbyBylPrvniRadekTabulkyTucnej());


        imput.setBounds(50, 12, 500, 20);


        deleteRow.setBounds(100, 12, 175, 25);
        deleteRow.addActionListener(this::whatIfSomebodyActuallyClickedOneOfTheButtonsLikeWouldntThatBePrettyCool);
        prepare(deleteRow);

        addRow.setBounds(300, 12, 175, 25);
        addRow.addActionListener(this::whatIfSomebodyActuallyClickedOneOfTheButtonsLikeWouldntThatBePrettyCool);
        prepare(addRow);


        frame.setVisible(true);
    }

    public void whatIfSomebodyActuallyClickedOneOfTheButtonsLikeWouldntThatBePrettyCool(ActionEvent e) {
        DefaultTableModel lordAndSaviorDefaultTableModel = (DefaultTableModel) tabule.getModel();
        Object source = e.getSource();
        if (deleteRow.equals(source)) {
            while (tabule.getSelectedRow() != -1)
                lordAndSaviorDefaultTableModel.removeRow(tabule.getSelectedRow());
        } else if (addRow.equals(source)) {
            lordAndSaviorDefaultTableModel.addRow(randomBullshit(8));
        }

        frame.update(frame.getGraphics());
    }

    public void prepare(JComponent o) {
        o.setVisible(true);
        frame.add(o);
    }

    public String[][] randomBullshit(int wordSize, int arraySize) {
        String[][] out = new String[arraySize][2];
        out[0] = new String[]{"Človjekoidi", "Starost"};

        for (int i = 1; i < out.length; i++) {
            StringBuilder borek = new StringBuilder();
            borek.append((char) (Math.random() * (90 - 65) + 65));
            for (int j = 0; j < wordSize; j++) {
                borek.append((char) (Math.random() * (122 - 97) + 97));
            }
            out[i][1] = String.valueOf((int) (Math.random() * 120));
            out[i][0] = borek.toString();
        }
        return out;
    }

    // Jenom na jeden entry
    public Object[] randomBullshit(int wordSize) {
        String[] out = new String[2];
        StringBuilder borek = new StringBuilder();
        borek.append((char) (Math.random() * (90 - 65) + 65));
        for (int j = 0; j < wordSize; j++) {
            borek.append((char) (Math.random() * (122 - 97) + 97));
        }
        out[1] = String.valueOf((int) (Math.random() * 120));
        out[0] = borek.toString();

        return out;
    }
}
