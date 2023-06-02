package Example;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SwingExample
{
  public JFrame getTable(){
    JFrame frame = new JFrame("sWING TABLE");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,300);

    Object[][] data = {
      {"John", 25, "USA"},
      {"Alice", 30, "UK"},
      {"Bob", 35, "Canada"}
    };

    String[] columnName = {"Name", "Age", "Country"};

    JTable table = new JTable(data, columnName);

    JScrollPane scrollPane = new JScrollPane(table);

    getPanel().add(scrollPane, BorderLayout.CENTER);
    frame.add(getPanel());
    frame.setVisible(true);
    return frame;
  }

  public JPanel getPanel(){
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    return panel;
  }



}
