import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


import static java.lang.System.exit;

public class MoreOption extends JFrame implements ActionListener {
//   private JPanel jp;
   private JTable table;
    MoreOption() {
        table=new JTable();
        table.setBounds(0,10,200,200);
        JFrame frame5 = new JFrame("Toll Controller");
        frame5.setLayout(null);
        frame5.setSize(1000, 600);
        frame5.setLocation(200, 60);
        frame5.getContentPane().setBackground(Color.cyan);
        frame5.setVisible(true);
        frame5.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame5.setDefaultCloseOperation(EXIT_ON_CLOSE);

//    jp=new JPanel();
//    jp.setSize(300,500);
//    jp.setBounds(500,100,300,400);
//    frame5.add(jp);
        //color
        JButton c = new JButton("<BG color>");
        c.setBounds(900, 0, 100, 25);
        c.setFont(new Font("Arial", Font.BOLD, 12));
        c.setBackground(Color.blue);
        c.setForeground(Color.white);
        c.addActionListener(e -> {
            Color cc = JColorChooser.showDialog(null, "choose a color", Color.green);
            frame5.getContentPane().setBackground(cc);
        });
        frame5.add(c);

        //heading 01
        JLabel heading = new JLabel("----->Admin Panel<-----");
        frame5.add(heading);
        heading.setBounds(300, 10, 400, 60);
        heading.setFont(new Font("Arial", Font.BOLD, 30));
        heading.setForeground(Color.BLACK);

        //back
        JButton Back = new JButton("< Back");
        Back.setFont(new Font("serif", Font.BOLD, 20));
        Back.setBounds(0, 0, 100, 25);
        Back.setBackground(Color.blue);
        Back.setForeground(Color.white);
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AdminPanel();
                //new WelcomePage();
                frame5.setVisible(false);
            }
        });
        frame5.add(Back);



        //Total Vehicel
        JButton TotalVehicle = new JButton("Total Vehicle");
        TotalVehicle.setFont(new Font("serif", Font.BOLD, 20));
        TotalVehicle.setBounds(200, 100, 230, 50);
        TotalVehicle.setBackground(Color.blue);
        TotalVehicle.setForeground(Color.white);
        TotalVehicle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //   new OfflinePayment();
                //new WelcomePage();
                totalcar t=new totalcar();
                t.setVisible(true);
//                frame5.setVisible(false);

            }
        });
        frame5.add(TotalVehicle);
        JButton ONLINE = new JButton("ONLINE");
        ONLINE.setFont(new Font("serif", Font.BOLD, 20));
        ONLINE.setBounds(200, 400, 230, 50);
        ONLINE.setBackground(Color.blue);
        ONLINE.setForeground(Color.white);
        frame5.add(ONLINE);
        ONLINE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                DATABASE2 dd=new DATABASE2();
//                dd.setVisible(true);
JOptionPane.showMessageDialog(null,"Online Record Combined With Offline ","SORRY",JOptionPane.OK_OPTION);
            }
        });
ONLINE.setVisible(false);
        JButton OFFLINE = new JButton("OFFLINE");
        OFFLINE.setFont(new Font("serif", Font.BOLD, 20));
        OFFLINE.setBounds(500, 400, 230, 50);
        OFFLINE.setBackground(Color.blue);
        OFFLINE.setForeground(Color.white);
        frame5.add(OFFLINE);
        OFFLINE.setVisible(false);
        OFFLINE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DATABASE d=new DATABASE();
                d.setVisible(true);

            }
        });
        //Total Income
        JButton TotalIincome = new JButton("Total Income");
        TotalIincome.setFont(new Font("serif", Font.BOLD, 20));
        TotalIincome.setBounds(500, 100, 230, 50);
        TotalIincome.setBackground(Color.blue);
        TotalIincome.setForeground(Color.white);
        frame5.add(TotalIincome);

        //Search
        JButton Search = new JButton("Search");
        Search.setFont(new Font("serif", Font.BOLD, 20));
        Search.setBounds(200, 200, 230, 50);
        Search.setBackground(Color.blue);
        Search.setForeground(Color.white);
        Search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new OfflinePayment();
                //new WelcomePage();
                Search s=new Search();
                s.setVisible(true);
//                frame5.setVisible(false);

            }
        });
        frame5.add(Search);

        //database
        JButton Database = new JButton("Database");
        Database.setFont(new Font("serif", Font.BOLD, 20));
        Database.setBounds(500, 200, 230, 50);
        Database.setBackground(Color.blue);
        Database.setForeground(Color.white);

        Database.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //  new OfflinePayment();
                //new WelcomePage();
                ONLINE.setVisible(true);
                OFFLINE.setVisible(true);
//                DATABASE d=new DATABASE();
//                d.setVisible(true);
//                frame5.setVisible(false);

            }
        });
        frame5.add(Database);

        //exit
        JButton exit = new JButton("Exit");
        exit.setFont(new Font("serif", Font.BOLD, 20));
        exit.setBounds(340, 300, 230, 50);
        exit.setBackground(Color.blue);
        exit.setForeground(Color.white);
        exit.addActionListener(this);
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //  new OfflinePayment();
                //new WelcomePage();
                exit(0);
                frame5.setVisible(false);

            }
        });
        frame5.add(exit);
      /*  public void actionPerformed(ActionEvent e) {
            if (e.getSource() == exit) {

            }
        }*/

        TotalIincome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
income i=new income();
i.setVisible(true);
//        try
//        {
//            Conn c=new Conn();
//            ResultSet rs=c.s.executeQuery("select * from Tollcounter");
//table.setModel(DbUtils.resultSetToTableModel(rs));
//        }
//        catch (Exception ee){
//            ee.printStackTrace();
//        }
////      JScrollPane jsp=new JScrollPane(table);
////      jsp.setBounds(0,10,200,300);
//      jp.add(table);
          }
        });
    }
    public static void main(String args[]){
        new MoreOption();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}