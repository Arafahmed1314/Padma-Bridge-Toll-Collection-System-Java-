import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
public class DATABASE extends JFrame {
    JTable table;
    JLabel label;
    Choice choice;
    Font f;
    DATABASE() {
        getContentPane().setBackground(Color.pink);
        setLayout(null);
        table = new JTable();
        f = new Font("ARIAL", Font.BOLD + Font.ITALIC, 22);
        JLabel search = new JLabel("ALL INFORMATION");
        search.setBounds(325, 45, 250, 20);
        search.setFont(f);
        add(search);
        setSize(900, 700);
        setLocation(300, 100);
        setTitle("CAR INFORMATION");
        setVisible(true);
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from infoo");
        } catch (Exception ee) {
            ee.printStackTrace();
        }
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from infoo");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception ee) {
            ee.printStackTrace();
        }
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0, 100, 900, 600);
        add(jsp);
    }
    public static void main(String[] args) {
        new income();
    }
}
