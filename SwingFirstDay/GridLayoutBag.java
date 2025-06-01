package SwingFirstDay;
import javax.swing.*;
import java.awt.*;
public class GridLayoutBag {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setLayout(new GridBagLayout());
        jframe.setSize(300, 400);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        // gbc.fill = GridBagConstraints.BOTH; // Fill both horizontally and vertically

        // Button 1 at (1, 0)
        gbc.gridx = 1;
        gbc.gridy = 0;
        jframe.add(new JButton("btn1"), gbc);

        // Button 2 at (0, 0)
        gbc.gridx = 0;
        gbc.gridy = 0;
        jframe.add(new JButton("btn2"), gbc);

        // Button 3 at (0, 1) with internal padding
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipady = 10;
        jframe.add(new JButton("btn3"), gbc);

        jframe.setVisible(true);
    }
}
