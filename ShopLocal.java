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
 //       this.primaryStage = primaryStage;
 //       this.primaryStage.setTitle("ShopLocal Website");
 //       showMainView();

//         Parent root = FXMLLoader.load(getClass().getResource("AppScene.fxml"));
//         Scene scene = new Scene(root);
//         primaryStage.setTitle("Title");
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }
//     private void showMainView() throws IOException{
//         FXMLLoader loader = new FXMLLoader();
// //        loader.setLocation(AppScene.class.getResource("AppScene.fxml"));
//         mainLayout = loader.load();
//         Scene scene = new Scene(mainLayout);
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     } 
        stg = primaryStage;
        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(getClass().getResource("AppScene.fxml"));
        primaryStage.setTitle("Shop Local Businesses");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();

    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(getClass().getResource(fxml));
        stg.getScene().setRoot(pane);
    }

    public static void main(String[] args){
        launch(args);
    }
}
