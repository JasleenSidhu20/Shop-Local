import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;


public class ShopLocal extends Application {
   
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("AppScene.fxml"));
        primaryStage.setTitle("Shop Local Businesses");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();

    }

    public static void main(String[] args){
        launch(args);
    }
    
}
