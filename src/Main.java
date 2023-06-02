import Example.SwingExample;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main
{
  public static void main(String[] args)
  {
//    JFrame frame = new JFrame("sWING TABLE");
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.setSize(400,300);
//
//    JPanel panel = new JPanel();
//    panel.setLayout(new BorderLayout());
//
//    Object[][] data = {
//      {"John", 25, "USA"},
//      {"Alice", 30, "UK"},
//      {"Bob", 35, "Canada"}
//    };
//
//    String[] columnName = {"Name", "Age", "Country"};
//
//    JTable table = new JTable(data, columnName);
//
//    JScrollPane scrollPane = new JScrollPane(table);
//
//    panel.add(scrollPane, BorderLayout.CENTER);
//    frame.add(panel);
//    frame.setVisible(true);
    SwingExample sw = new SwingExample();
    sw.getTable();
  }
}
