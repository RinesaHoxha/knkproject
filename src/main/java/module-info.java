module com.example.knk {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.knk to javafx.fxml;
    exports com.example.knk;
}