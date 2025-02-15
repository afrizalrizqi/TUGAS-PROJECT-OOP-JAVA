package Project_Kelompok;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JavaFream1 extends JPanel {
    private JButton jcomp1;
    private JButton jcomp2;
    private JButton jcomp3;
    private JButton jcomp4;
    private JButton jcomp5;

    public JavaFream1() {
        //construct components
        jcomp1 = new JButton ("Center");
        jcomp2 = new JButton ("South");
        jcomp3 = new JButton ("North");
        jcomp4 = new JButton ("East");
        jcomp5 = new JButton ("West");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 570));
        BorderLayout layout = new BorderLayout(0, 0);
        setLayout (layout);

        //add components
        add (jcomp1, BorderLayout.CENTER);
        add (jcomp2, BorderLayout.SOUTH);
        add (jcomp3, BorderLayout.NORTH);
        add (jcomp4, BorderLayout.EAST);
        add (jcomp5, BorderLayout.WEST);
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        // frame.getContentPane().add (new MyPanel());
        frame.pack();
        frame.setVisible (true);
    }

}