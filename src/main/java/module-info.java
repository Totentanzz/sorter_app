module com.example.sort {
    requires javafx.controls;
    requires javafx.fxml;
    requires jfreechart;
    requires jfreechart.fx;
    requires java.desktop;


    opens com.example.App to javafx.fxml;
    exports com.example.App;
    exports com.example.Backend;
    opens com.example.Backend to javafx.fxml;
}