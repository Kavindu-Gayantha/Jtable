package Example;

public class TableController {
    private TableModel model;
    private TableView view;

    public TableController(TableModel model, TableView view) {
        this.model = model;
        this.view = view;


        // Register controller as a listener for view events
        // Handle events and update the model/view accordingly
    }

    void setFrameVisible(boolean visible) {
        view.setFrameVisible(visible);
    }
}
