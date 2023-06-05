import Example.SwingExample;

import javax.swing.*;
import java.awt.*;

public class Main
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame("sWING TABLE");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);

    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());

    Object[][] data = {
            {"John", 25, "USA"},
            {"Alice", 30, "UK"},
            {"Bob", 35, "Canada"}
    };

    String[] columnName = {"Name", "Age", "Country"};

    JTable table = new JTable(data, columnName);

    JScrollPane scrollPane = new JScrollPane(table);

    panel.add(scrollPane, BorderLayout.CENTER);
    frame.add(panel);
    frame.setVisible(true);


    // new table implementation from here -> not working properly TODO: Need to check the code
    SwingExample sw = new SwingExample();
    JFrame jFrameNew = sw.getTable();
    jFrameNew.setVisible(true);
  }
}
