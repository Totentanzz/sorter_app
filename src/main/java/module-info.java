module com.po_lab.sorter.app {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.po_lab.sorter.app to javafx.fxml, javafx.graphics;
    opens com.po_lab.sorter.app.controller to javafx.fxml;
}