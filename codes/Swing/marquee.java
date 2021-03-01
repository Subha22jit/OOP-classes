import java.awt.*;

import javax.swing.*;

public class marquee {

    public static void main(String[] args) {
        String str = "This is a Text";
        JFrame f = new JFrame();
        JLabel text = new JLabel(str);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text.setBounds(10, 10, 200, 40);
        Font font = new Font("Times New Roman", Font.BOLD, 12);
        text.setFont(font);
        f.getContentPane().setBackground(Color.GREEN);
        text.setForeground(Color.BLUE);
        f.add(text);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            char c = str.charAt(0);
            str = str.substring(1, str.length());
            str = str + c;
            text.setText(str);
        }
    }
}
