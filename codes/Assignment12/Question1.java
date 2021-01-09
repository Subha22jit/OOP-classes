import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Question1 extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, minus, mult, div, mod, equal;
    JTextArea screen;
    String output = "";
    JFrame f;

    Question1() {
        f = new JFrame("Cool Calculator");
        f.setDefaultCloseOperation(3);
        screen = new JTextArea(this.output);
        screen.setBounds(10, 10, 230, 40);
        b1 = new JButton("1");
        b1.setBounds(10, 60, 50, 50);
        b2 = new JButton("2");
        b2.setBounds(70, 60, 50, 50);
        b3 = new JButton("3");
        b3.setBounds(130, 60, 50, 50);
        b4 = new JButton("4");
        b4.setBounds(10, 120, 50, 50);
        b5 = new JButton("5");
        b5.setBounds(70, 120, 50, 50);
        b6 = new JButton("6");
        b6.setBounds(130, 120, 50, 50);
        b7 = new JButton("7");
        b7.setBounds(10, 180, 50, 50);
        b8 = new JButton("8");
        b8.setBounds(70, 180, 50, 50);
        b9 = new JButton("9");
        b9.setBounds(130, 180, 50, 50);
        b0 = new JButton("0");
        b0.setBounds(70, 240, 50, 50);
        // Operators
        add = new JButton("+");
        add.setBounds(190, 180, 50, 110);
        equal = new JButton("=");
        equal.setBounds(190, 60, 50, 110);
        minus = new JButton("-");
        minus.setBounds(10, 300, 50, 50);
        mult = new JButton("X");
        mult.setBounds(70, 300, 50, 50);
        div = new JButton("/");
        div.setBounds(130, 300, 50, 50);
        mod = new JButton("%");
        mod.setBounds(190, 300, 50, 50);
        f.add(screen);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(add);
        f.add(minus);
        f.add(mult);
        f.add(div);
        f.add(mod);
        f.add(equal);
        f.setSize(270, 400);
        f.setLayout(null);
        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        add.addActionListener(this);
        minus.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        equal.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        this.output = this.output + b.getText();
        this.screen.setText(this.output);
    }

    public static void main(String[] args) {
        Question1 q1 = new Question1();
    }

}