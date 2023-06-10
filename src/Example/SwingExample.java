package Example;

public class SwingExample {
    public void createTable() {

        TableView tableView = new TableView();
        tableView.buildUI(getModelData());
    }

    private Object[][] getModelData() {
        TableData tableData1 = new TableData("Kavindu", 30, "Sri Lanka");
        TableData tableData2 = new TableData("Kasun", 33, "canada");
        TableData tableData3 = new TableData("Ishara", 13, "New Zeeland");

        TableData[] tableDataArray = new TableData[]{tableData1, tableData2, tableData3};

        Object[][] data = new Object[4][3];
        for (int a = 0; a < tableDataArray.length; a++) {
            data[a][0] = tableDataArray[a].getName();
            data[a][1] = tableDataArray[a].getAge();
            data[a][2] = tableDataArray[a].getCountry();
        }
        return data;
    }

}
