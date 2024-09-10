import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class WelcomePage extends JFrame implements ActionListener{
    WelcomePage(){
        JFrame f=new JFrame("Toll Controller");
        f.setLayout(null);
        f.getContentPane().setBackground(Color.cyan);
        f.setSize(1000, 600);
        f.setLocation(200, 60);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel heading = new JLabel("Toll Controller");
        f.add(heading);
        heading.setBounds(250, 50, 1200, 60);
        heading.setFont(new Font("Arial", Font.BOLD, 70));
        heading.setForeground(Color.BLACK);
        JLabel welcome = new JLabel("Welcome");
        f.add(welcome);
        welcome.setBounds(360, 180, 1200, 80);
        welcome.setFont(new Font("Arial", Font.BOLD, 50));
        welcome.setForeground(Color.BLACK);
        JButton b=new JButton("Login to Click Here");
        b.setFont(new Font("Arial", Font.BOLD, 20));
        b.setBounds(350, 350, 230, 50);
        b.setBackground(Color.blue);
        b.setForeground(Color.white);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new SelectionPage();
                f.setVisible(false);
            }
        });
        f.add(b);
        JButton c=new JButton("<BG color>");
        c.setBounds(900, 0, 100, 25);
        c.setBackground(Color.BLUE);
        c.setForeground(Color.white);
        c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Color cc= JColorChooser.showDialog(null,"choose a color",Color.green);
                f.getContentPane().setBackground(cc);
            }
        });
        f.add(c);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
    public static void main(String[] args) {
        new WelcomePage();
    }
}