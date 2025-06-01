package SwingFirstDay;
import javax.swing.*;
import java.awt.*;
//javax.swing.*: Contains modern Swing components like JFrame, JButton, JLabel, etc.
//java.awt.*: Contains layout managers, colors, fonts, and the older AWT GUI components like Frame, Button, etc.
//Flow layouts are typically used to arrange buttons in a panel.
// It arranges buttons horizontally until no more buttons fit on the same line.
// The FlowLayoutExample class puts components in a row, sized at their preferred size.
//FlowLayout is part of the java.awt package
public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(400, 500);

        jframe.setLayout(new FlowLayout(FlowLayout.CENTER));

        jframe.add(new JButton("Button 1"));
        jframe.add(new JButton("Button 2"));
        jframe.add(new JButton("Button 3"));
          JLabel  label1 =new JLabel("I Love Nepal");
jframe.add(label1);
        jframe.setVisible(true);
    }
}