module com.example.testing12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testing12 to javafx.fxml;
    exports com.example.testing12;
}