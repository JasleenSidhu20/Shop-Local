import java.io.IOException;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RestaurantController {

    @FXML
    private Button returnButton;

    @FXML
    private Text fifthRestaurant;

    @FXML
    private Text sixthRestaurant;
    
    @FXML
    void ReturnFunction(ActionEvent event) throws IOException {
        Parent reg_par = FXMLLoader.load(getClass().getResource("AppScene.fxml"));
        Scene reg_scene = new Scene(reg_par);
        Stage reg_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        reg_stage.setScene(reg_scene);
        reg_stage.show();
    }

}
