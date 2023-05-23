package com.example.knk;
import javafx.application.Application;

public class Main extends Application{
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(new Scene(root, 520, 400));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
}
