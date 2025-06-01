package SwingFirstDay;

import javax.swing.*;
import java.awt.*;

public class GroupLayoutExample {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
        {
            JFrame j = new JFrame("GroupLayout Example");
            j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            j.setSize(400, 500);

            Container c = j.getContentPane();
            GroupLayout gl = new GroupLayout(c);
            c.setLayout(gl);

            // Auto gaps between components
            gl.setAutoCreateGaps(true);
            gl.setAutoCreateContainerGaps(true);

            JButton B1 = new JButton("Button1");
            JButton B2 = new JButton("Button2");
            JButton B3 = new JButton("Button3");

            // Horizontal group
            gl.setHorizontalGroup(
                    gl.createSequentialGroup()
                            .addComponent(B1)
                            .addComponent(B2)
                            .addComponent(B3)
            );

            // Vertical group
            gl.setVerticalGroup(
                    gl.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(B1)
                            .addComponent(B2)
                            .addComponent(B3)
            );

            j.setVisible(true);
        });
    }
}
