package SwingFirstDay;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JButton Login;
    private JPanel PanelMain;

    public Main() {
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
JOptionPane.showMessageDialog(null,"Hello World");
            }
        });
    }

    public static void main(String[] args) {
JFrame Jframe= new JFrame("Main");
Jframe.setContentPane(new Main().PanelMain);
Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Jframe.pack();
Jframe.setVisible(true);
    }
}
