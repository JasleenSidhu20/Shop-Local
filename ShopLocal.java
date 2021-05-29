import java.io.*;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;


public class ShopLocal extends Application {

    private static Stage stg;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stg = primaryStage;
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("AppScene.fxml"));
        primaryStage.setTitle("Shop Local Businesses");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();

    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource("fxml"));
        stg.getScene().setRoot(pane);
    }

    public static void main(String[] args){
        launch(args);
    }
}
