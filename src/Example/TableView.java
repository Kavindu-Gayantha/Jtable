package Example;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

public class TableView extends JTable {
    void buildUI(Object[][] data) {

        JFrame frame = getFrame();
        JPanel jPanel = getPanel();
        JTable table = new JTable(new TableModel(data, new String[]{"name", "Age", "Country"}));  // use the model

        JScrollPane scrollPane = new JScrollPane(table);

        jPanel.add(scrollPane, BorderLayout.CENTER);
        frame.add(jPanel);
        frame.setVisible(true);
    }

    private JPanel getPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        return panel;
    }

    private JFrame getFrame() {
        JFrame frame = new JFrame("SWING TABLE : " + LocalDateTime.now());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        return frame;
    }


}
