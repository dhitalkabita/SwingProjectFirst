package SwingFirstDay;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FlowLayoutDemo extends JFrame
{
    private JButton lb;
    private JButton rb;
    private JButton cb;
    private FlowLayout layout;
    private Container container;
    public FlowLayoutDemo()
    {
        super("the title");
        layout = new FlowLayout();
        container = getContentPane();
        setLayout(layout); //left alignment
        lb = new JButton("left");
        add(lb);
        lb.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        layout.setAlignment(FlowLayout.LEFT);
                        layout.layoutContainer(container);
                    }
                }
        );
//right alignment
        rb = new JButton("right");
        add(rb);
        rb.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        layout.setAlignment(FlowLayout.RIGHT);
                        layout.layoutContainer(container);
                    }
                }
        );
//center alignment
        cb = new JButton("center");
        add(cb);
        cb.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent event)
                    {
                        layout.setAlignment(FlowLayout.CENTER);
                        layout.layoutContainer(container);
                    }
                }
        );
    }
    public static void main(String[] args)
    {
        FlowLayoutDemo l = new FlowLayoutDemo();
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l.setSize(300, 100);
        l.setVisible(true);
    }
}