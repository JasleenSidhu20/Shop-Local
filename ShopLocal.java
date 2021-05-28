import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
//import javafx.scene.control.MenuItem;
public class ShopLocal extends Application {
    /*
    @FXML
    private MenuItem delete;

    @FXML
    void deleteProgram(ActionEvent event) {
    }
    */
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
