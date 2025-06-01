import javax.swing.*;

public class FrameExample {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setLayout(null);  // Enable manual positioning
//  j.setSize(500,500);
//j.setLocation(150,150);
//this would place the window 150 pixels to the right and 150 pixels down from the top-left corner of the screen:this would place the window 150 pixels to the right and 150 pixels down from the top-left corner of the screen.
        j.setBounds(200, 150, 500, 500);  //Sets both the position and size of the component in one go.


        JButton login = new JButton("Click me");
        login.setBounds(40, 40, 100, 30);
        j.add(login);

        JTextField tx = new JTextField();
        tx.setBounds(40, 80, 100, 30);  // moved up from 100 to 80 to avoid overlap
        j.add(tx);

        // JLabel is used to display a short string or an image icon. JLabel can display text, image or both .
        JLabel label = new JLabel("Name");
        label.setBounds(40, 100, 250, 30);  // moved down to 120 so it’s below the text field
        j.add(label);

//        ImageIcon icon = new ImageIcon("C:\\Users\\Kabita\\Desktop\\JAVA\\k.jpg");
//        JLabel imageLabel = new JLabel(icon);  // set icon in constructor
//        imageLabel.setBounds(40, 140, 250, 350);
//        j.add(imageLabel);

        j.setVisible(true); // set visible should be after adding components
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
