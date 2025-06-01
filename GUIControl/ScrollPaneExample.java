package GUIControl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScrollPaneExample extends JFrame implements ActionListener {
    JTextField txt1, txt2;
    JLabel num1, num2, result;
    JButton sum;
    JTextArea textArea;
    JScrollPane scrollPane;

    public ScrollPaneExample() {
        setSize(600, 600);
        setLayout(null);
        setTitle("Sum");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // First number label and text field
        num1 = new JLabel("First Number:");
        num1.setBounds(100, 100, 150, 30);
        add(num1);

        txt1 = new JTextField();
        txt1.setBounds(300, 100, 100, 30);
        add(txt1);

        // Second number label and text field
        num2 = new JLabel("Second Number:");
        num2.setBounds(100, 150, 150, 30);
        add(num2);

        txt2 = new JTextField();
        txt2.setBounds(300, 150, 100, 30);
        add(txt2);

        // Result label
        result = new JLabel("Result: 0.0");
        result.setBounds(300, 200, 150, 30);
        add(result);

        // Sum button
        sum = new JButton("Sum");
        sum.setBounds(300, 250, 100, 40);
        sum.addActionListener(this);
        add(sum);

        // Text area with scroll pane
        textArea = new JTextArea(10, 20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(100, 320, 400, 150);
        add(scrollPane);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sum) {
            try {
                double a = Double.parseDouble(txt1.getText());
                double b = Double.parseDouble(txt2.getText());
                double s = a + b;

                result.setText("Result: " + s);
                textArea.append("Sum of " + a + " and " + b + " is " + s + "\n");

                // Optional: auto-scroll to bottom
                textArea.setCaretPosition(textArea.getDocument().getLength());

                // Optional: clear inputs
                txt1.setText("");
                txt2.setText("");

            } catch (NumberFormatException ex) {
                result.setText("");
                JOptionPane.showMessageDialog(this, "Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new ScrollPaneExample();
    }
}
