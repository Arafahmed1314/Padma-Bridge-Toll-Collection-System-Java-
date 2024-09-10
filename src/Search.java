import net.proteanit.sql.DbUtils;
import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Search extends JFrame {
    JTable table;
    JLabel label;
    Choice choice;
    Font f;
    JButton s,print;
    Search(){
        getContentPane().setBackground(Color.pink);
        setLayout(null);
        table=new JTable();
        f=new Font("ARIAL",Font.BOLD,15);
        JLabel search=new JLabel("SEARCH BY TIME");
        search.setFont(f);
        search.setBounds(20,20,200,20);
        add(search);
        choice=new Choice();
        choice.setBounds(220,20,150,20);
        add(choice);
        setSize(900,700);
        setLocation(300,100);
        setTitle("CAR INFORMATION");
        setVisible(true);
        s=new JButton("SEARCH");
        s.setBounds(20,70,100,20);
        add(s);
        print=new JButton("PRINT");
        print.setBounds(130,70,100,20);
        add(print);
        try
        {
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from infoo");
            while(rs.next()){
                choice.add(rs.getString("Date_Time"));
            }
        }
        catch (Exception ee){
            ee.printStackTrace();
        }
        try
        {
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from infoo");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception ee){
            ee.printStackTrace();
        }
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0,100,900,600);
        add(jsp);
        print.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                table.print();
                }
                catch (Exception eee){
                    eee.printStackTrace();
                }
            }
        });
        s.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
          String query="select * from infoo where Date_Time = '"+choice.getSelectedItem()+"'";
try {
    Conn c=new Conn();
    ResultSet rs=c.s.executeQuery(query);
    table.setModel(DbUtils.resultSetToTableModel(rs));
}
catch (Exception eee){
    eee.printStackTrace();
}
            }
        });
    }
    public static void main(String[] args) {
        new income();
    }
}
