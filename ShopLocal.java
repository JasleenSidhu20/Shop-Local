import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
public class ShopLocal extends Application {
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("AppScene.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Title");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
