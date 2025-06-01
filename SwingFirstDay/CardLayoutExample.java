package SwingFirstDay;


import javax.swing.*;
import java.awt.*;

public class CardLayoutExample {
    public static void main(String[] args) {
        JFrame j=new JFrame("Warning");
        j.setBounds(200,200,300,400);
        j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
        j.setVisible(true);
        j.setLayout(new CardLayout());

    }
}
