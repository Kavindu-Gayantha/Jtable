package Example;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TableView extends JTable {

    private JPanel panel;
    private JFrame frame;

    public TableView() {
        this.panel = new JPanel();
        this.frame = new JFrame("SWING TABLE : " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
    }

    void buildUI(Object[][] data) {

        frame = getFrame();
        getPanel().setLayout(new BorderLayout());
        JTable table = new JTable(new TableModel(data, new String[]{"name", "Age", "Country"}));  // use the model

        JScrollPane scrollPane = new JScrollPane(table);

        panel.add(scrollPane, BorderLayout.CENTER);
        frame.add(panel);
    }

    public void setFrameVisible(boolean visible) {
        frame.setVisible(visible);
    }

    private JPanel getPanel() {
        return panel;
    }

    private JFrame getFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        return frame;
    }


}
