module com.example.knk {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;
    requires mysql.connector.java;


    opens com.example.knk to javafx.fxml;
    exports com.example.knk;
}