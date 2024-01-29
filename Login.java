import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener{

    JButton rules, back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("Java Coding Test");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Streetscript", Font.BOLD, 30));
        heading.setForeground(new Color(140, 144,254));
        add(heading);

        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 160, 300, 25);
        name.setFont(new Font("Streetscript", Font.BOLD, 16));
        name.setForeground(new Color(140, 144,254));
        add(name);

        tfname = new JTextField();
        tfname.setBounds(750, 200, 300, 25);
        tfname.setFont(new Font("Streetscript", Font.BOLD, 18));
        tfname.setForeground(new Color(140, 144,254));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(775, 270, 120, 35);
        rules.setBackground(new Color(140, 144, 254));
        rules.setForeground(new Color(140, 144, 254));
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(910, 270, 120, 35);
        back.setBackground(new Color(140, 144, 254));
        back.setForeground(new Color(140, 144, 254));
        back.addActionListener(this);
        add(back);

        setSize(1200, 500);
        setLocation(150, 150);
        setVisible(true);
    }
    

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        } else if(ae.getSource() == back){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Login();
    }

}
