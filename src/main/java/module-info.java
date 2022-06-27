module com.example.gpacalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gpacalculator to javafx.fxml;
    exports com.example.gpacalculator;
}