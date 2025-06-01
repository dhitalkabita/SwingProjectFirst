package GUIControl;

import javax.swing.*;
import java.awt.event.*;

public class CustomDialogPosition {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gender Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        JCheckBox female = new JCheckBox("Female");
        female.setBounds(50, 30, 100, 30);
        frame.add(female);

        JButton checkButton = new JButton("Check");
        checkButton.setBounds(50, 80, 100, 30);
        frame.add(checkButton);

        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (female.isSelected()) {
                    // Create the option pane
                    JOptionPane pane = new JOptionPane("Female is selected", JOptionPane.INFORMATION_MESSAGE);

                    // Create a dialog from the option pane
                    JDialog dialog = pane.createDialog(null,"Message");

                    // Set the dialog position
                    dialog.setLocation(200, 100);

                    // Show the dialog
                    dialog.setVisible(true);
                }
            }
        });

        frame.setVisible(true);
    }
}
