module com.example.javafx2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx5 to javafx.fxml;
    exports com.example.javafx5;
    exports com.example.javafx5.gui;
    opens com.example.javafx5.gui to javafx.fxml;
}