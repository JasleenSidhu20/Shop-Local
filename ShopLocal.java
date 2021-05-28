import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class ShopLocal extends Application {
    private Stage primaryStage;
    private BorderPane mainLayout;
    public static void main(String[] args){
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("ShopLocal Website");
        showMainView();

        Parent root = FXMLLoader.load(getClass().getResource("AppScene.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Title");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void showMainView() throws IOException{
        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(AppScene.class.getResource("AppScene.fxml"));
        mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    } 
}
