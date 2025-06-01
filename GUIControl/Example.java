package GUIControl;

import javax.swing.*;
import java.awt.*;

public class Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Set Bounds Example");
        frame.setLayout(null); // Needed for setBounds to take effect

        JButton button = new JButton("Click Me");

        Rectangle r = new Rectangle(50, 100, 120, 40); // x, y, width, height
        button.setBounds(r); // Apply rectangle to the button

        frame.add(button);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
