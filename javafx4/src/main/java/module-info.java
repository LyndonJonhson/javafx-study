module com.example.javafx2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx4 to javafx.fxml;
    exports com.example.javafx4;
    exports com.example.javafx4.gui;
    opens com.example.javafx4.gui to javafx.fxml;
}