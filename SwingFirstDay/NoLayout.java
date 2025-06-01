package SwingFirstDay;
import javax.swing.*;
//Layout managers in Java are used to arrange components within a container.
//They automatically handle the sizing and positioning of components, adapting to different screen sizes and resolutions.
// The java.awt and javax.swing packages provide several built-in layout managers:
public class NoLayout {
    public static void main(String[] args) {
        JFrame  jframe=new JFrame();
        jframe.setSize(500,600);
        jframe.setVisible(true);
        jframe.setLayout(null);

        JLabel label1=new JLabel("Hello World");
        label1.setBounds(100,100,150,  200);
        jframe.add(label1);
//       JLabel label2=new JLabel("From Nepal");
//        label2.setBounds(100,120,150,  200);
//        jframe.add(label2);
    }
}
