import javax.swing.*;
import java.awt.*;

public class InternalFrameExample extends JFrame {

    JDesktopPane desktopPane;
    JInternalFrame internalFrame;

    public InternalFrameExample() {
        setTitle("Internal Frame Example");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        // Create desktop pane to hold internal frames
        desktopPane = new JDesktopPane();
        add(desktopPane);

        // Create an internal frame
        internalFrame = new JInternalFrame("My Internal Frame", true, true, true, true);
        internalFrame.setSize(300, 200);
        internalFrame.setLocation(100, 100);
        internalFrame.setVisible(true);

        // Add a button to internal frame
        JButton btn = new JButton("Click Me");
        internalFrame.add(btn);
        internalFrame.setLayout(new FlowLayout());

        // Add internal frame to desktop pane
        desktopPane.add(internalFrame);
    }

    public static void main(String[] args) {

        new InternalFrameExample().setVisible(true);
    }
}
