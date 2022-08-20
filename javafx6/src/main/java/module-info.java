module com.example.javafx2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx6 to javafx.fxml;
    exports com.example.javafx6;
    exports com.example.javafx6.gui;
    opens com.example.javafx6.gui to javafx.fxml;
}