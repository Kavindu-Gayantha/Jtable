package Example;

import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {
    private Object data;
    private String[] columName;

    public TableModel(Object data, String[] columName) {
        this.data = data;
        this.columName = columName;
    }

    @Override
    public int getRowCount() {
        return 0;
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }


}
