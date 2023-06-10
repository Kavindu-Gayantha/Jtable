package Example;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {
    private Object[][] data;
    private String[] columNames;

    public TableModel(Object[][] data, String[] columNames) {
        this.data = data;
        this.columNames = columNames;
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }


}
