package P1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter extends JFrame {

    Container c;
    JTextField tf;
    JButton count, rest, show;
    int number;

    public Counter() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.white);

        tf = new JTextField();
        tf.setBounds(100, 5, 180, 40);
        c.add(tf);

        count = new JButton("Count");
        count.setBounds(80, 60, 80, 40);
        c.add(count);

        show = new JButton("show");
        show.setBounds(160, 60, 80, 40);
        c.add(show);

        rest = new JButton("Rest");
        rest.setBounds(240, 60, 80, 40);
        c.add(rest);

        count.addActionListener((ActionEvent ae) -> {
            try {
                number++;
                System.out.println(number);
            } catch (NumberFormatException ex) {
               
            }
        });

        show.addActionListener((ActionEvent ae) -> {
            tf.setText(number + " ");
        });

        rest.addActionListener((ActionEvent ae) -> {
            tf.setText("0");
            number = 0;
        });
    }

    public static void main(String[] args) {
        Counter frame = new Counter();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(5, 10, 400, 200);
        frame.setTitle("Counter");
    }
}
