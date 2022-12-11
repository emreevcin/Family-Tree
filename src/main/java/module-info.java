module com.emreevcin.familytree {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.emreevcin.familytree to javafx.fxml;
    exports com.emreevcin.familytree;
}