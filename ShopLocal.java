import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;


public class ShopLocal extends Application {
   
    @Override
    public void start(Stage primaryStage) throws Exception {
<<<<<<< HEAD
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
     } 
=======
        Parent root = FXMLLoader.load(getClass().getResource("AppScene.fxml"));
        primaryStage.setTitle("Shop Local Businesses");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();

    }

    public static void main(String[] args){
        launch(args);
    }
    
>>>>>>> d4be6208b590c354db4e349bea0e8b4eef0ba262
}
