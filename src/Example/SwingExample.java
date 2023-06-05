package Example;

import javax.swing.*;
import java.awt.*;

public class SwingExample {
    public JFrame getTable() {


        Object[][] data = {
                {"John", 25, "USA"},
                {"Alice", 30, "UK"},
                {"Bob", 35, "Canada"}
        };

        String[] columnName = {"Name", "Age", "Country"};

        TableModel tableModel = new TableModel(data, columnName);

        JTable table = new JTable(tableModel);  // use the model

        JScrollPane scrollPane = new JScrollPane(table);

        JPanel jPanel = getPanel();
        jPanel.add(scrollPane, BorderLayout.CENTER);
        JFrame frame = getFrame();
        frame.add(jPanel);
//        frame.setVisible(true);
        return frame;
    }

    private JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        return panel;
    }

    private JFrame getFrame() {
        JFrame frame = new JFrame("sWING TABLE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        return frame;
    }


}
