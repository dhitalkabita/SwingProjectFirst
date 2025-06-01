package GUIControl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboExample extends JFrame implements ActionListener {
    JRadioButton male,female;
    ButtonGroup bg;
    JCheckBox cb1,cb2,cb3;
    JComboBox cbox;
    JButton btnclick;
    JTextField t1,txt1,txt2;
    JLabel nameLabel,num1,num2, result;
    public ComboExample()  {
        setSize(600,600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("RadioButton, checkbox & combo-box");
        setLocationRelativeTo(null);//is used to center a window
        setResizable(false);  //Prevents the user from resizing the window.(Disables the ability to drag and stretch the frame's edges.)
        //  setExtendedState(MAXIMIZED_BOTH);

        //Textfield Start
         nameLabel = new JLabel("Name:");
        add(nameLabel).setBounds(150, 80, 50, 30);
        t1 = new JTextField();
        add(t1).setBounds(200, 80, 100, 30);
        //t1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14)); // Set font to bold & italic
        num1= new JLabel("First Number:");
        add(num1).setBounds(120, 120, 150, 30);
        txt1 = new JTextField();
        add(txt1).setBounds(200, 120, 100, 30);
        num2= new JLabel("Second Number:");
        add(num2).setBounds(105, 160, 150, 30);
        txt2 = new JTextField();
        add(txt2).setBounds(200, 160, 100, 30);

        // RadioButton start
        male=new JRadioButton("Male");
        add(male).setBounds(200,200,100,30);
        female=new JRadioButton("Female");
        add(female).setBounds(300,200,100,30);
        bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);
        // RadioButton end

//Checkbox start
        cb1=new JCheckBox("Sports");
        add(cb1).setBounds(200,240,100,40);
        cb2=new JCheckBox("Music");
        add(cb2).setBounds(200,280,100,40);
        cb3=new JCheckBox("PhotoGraphs");
        add(cb3).setBounds(200,320,100,40);
        //Checkbox end

//  ComboBox Start
        cbox=new JComboBox();
        add(cbox).setBounds(200,380,200,40);
        cbox.addItem("--Select--");
        cbox.addItem("ktm");
        cbox.addItem("bkt");
        cbox.addItem("lpr");
        cbox.addItem("pkr");
        cbox.addItem("ctn");
        cbox.addItem("htd");
//  ComboBox end

        btnclick=new JButton("Check");
        add(btnclick);
        Rectangle r = new Rectangle(200, 450, 120, 40); // x, y, width, height
        btnclick.setBounds(r); // Apply rectangle to the button
    btnclick.addActionListener(this); //Add the current object (the one this code is inside) as the listener for button click events
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==btnclick){
    String name = t1.getText().trim();
    if (!name.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Name: " + name);
        //JOptionPane.showMessageDialog(null, "<html>Name: <b><i>" + name + "</i></b></html>");
    }

}
{
    if(male.isSelected()){
        JOptionPane.showMessageDialog(null,"Male is selected");
    }
if(female.isSelected()){
    JOptionPane.showMessageDialog(null,"Female is selected");
}
    if(cb1.isSelected()){
        JOptionPane.showMessageDialog(null,"Sports checked");
    }
    if(cb2.isSelected()){
        JOptionPane.showMessageDialog(null,"Music checked");
    }
    if(cb3.isSelected()){
        JOptionPane.showMessageDialog(null,"PhotoGraphy checked");
    }
    if(!cbox.getSelectedItem().equals("--Select--")) {
        JOptionPane.showMessageDialog(null, cbox.getSelectedItem());
    }
}
    }

    public static void main(String[] args) {
        new ComboExample();
    }
}
