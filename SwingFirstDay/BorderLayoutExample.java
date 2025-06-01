package SwingFirstDay;
import javax.swing.*;
import  java.awt.*;
//BorderLayout arranges the components in the five regions.
//NORTH, SOUTH, EAST, WEST, and CENTER.
//In a BorderLayout, the CENTER region is always bigger because of how the layout manager is designed to allocate space.
//NORTH and SOUTH get their preferred heights and span the full width.
//EAST and WEST get their preferred widths and stretch vertically between NORTH and SOUTH.
//Whatever space is left — after placing the others — is given to CENTER.
public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Properly close the app on exit
        jframe.setSize(300,400);
        jframe.setVisible(true);
        //jframe.setLayout(new BorderLayout()); //not mandatory(Not strictly. JFrame's content pane uses BorderLayout by default, so technically you can omit this line, and the layout behavior will remain the same.)
        // Add buttons to the frame in BorderLayout regions
        JButton BTN1= new JButton("North");
        JButton BTN2= new JButton("South");
        JButton BTN3= new JButton("East");
        JButton BTN4= new JButton("West");
        JButton BTN5= new JButton("Center");

        jframe.add(BTN1, BorderLayout.NORTH);
        jframe.add(BTN2, BorderLayout.SOUTH);
        jframe.add(BTN3, BorderLayout.EAST);
        jframe.add(BTN4, BorderLayout.WEST);
        jframe.add(BTN5, BorderLayout.CENTER);

    }
}
