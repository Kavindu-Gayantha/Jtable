package Example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
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
        table.setBorder(new EmptyBorder(10, 10, 10, 10));

        JLabel tableHeaderLabel = getLabel("Java swing table example");
        tableHeaderLabel.setVisible(true);
        tableHeaderLabel.setHorizontalAlignment(SwingConstants.CENTER);
        tableHeaderLabel.setSize(100, 10);
        tableHeaderLabel.setFont(getFont("Arial", true, false, 24));
        tableHeaderLabel.setForeground(Color.black);
        tableHeaderLabel.setBorder(new EmptyBorder(30, 10, 30, 10));  // like a padding

        JScrollPane scrollPane = new JScrollPane(table);

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(tableHeaderLabel, BorderLayout.NORTH);

        frame.getContentPane().add(panel);
    }

    public void setFrameVisible(boolean visible) {
        frame.setVisible(visible);
    }

    private JPanel getPanel() {
        panel.setBackground(new Color(205, 244, 174));
        return panel;
    }

    private JFrame getFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(800, 600);
        return frame;
    }

    private JLabel getLabel(String text) {
        return new JLabel(text);
    }

    private Font getFont(String name, boolean isBold, boolean isItalic, int size) {
        return new Font(name, isBold ? Font.BOLD : isItalic ? Font.ITALIC : Font.PLAIN, size);
    }


}
