package SwingFirstDay;
import javax.swing.*;

public class FrameNextExample extends JFrame {
    JButton login = new JButton("Login");

    {
        // This block runs when the object is created, before the constructor
        setLayout(null);
        login.setBounds(40, 40, 100, 30);
        add(login);
    }

    public FrameNextExample() {
        setBounds(200, 200, 500, 500);
        setTitle("Good example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FrameNextExample();
    }
}
