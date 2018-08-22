package loginapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.text.ParseException;

public class loginapp extends Application {

    public void start(Stage stage) throws Exception{
        Parent root = (Parent) FXMLLoader.load(getClass().getResource(name:"login.fxml"));

        Scene
    }

    public static void main(String [] args){
        launch(args);
    }
}
