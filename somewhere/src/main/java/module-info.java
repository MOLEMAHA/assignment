module com.example.somewhere {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.somewhere to javafx.fxml;
    exports com.example.somewhere;
}