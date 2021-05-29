import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.event.ActionEvent;

public class AppSceneController {
    
    @FXML
    private TextField location_input;

    @FXML
    private Button main_search_button;

    @FXML
    private MenuButton type_of_business;

    @FXML
    private Menu register_business_button;

    @FXML
    void RegisterBusiness(ActionEvent event) throws IOException {
        System.out.println("clicked!");
        Parent register_parent = FXMLLoader.load(getClass().getResource("reg2.0.fxml"));
        Scene register_scene = new Scene(register_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(register_scene);
        app_stage.show();
    }

    @FXML
    void SearchButton(ActionEvent event) throws IOException {
        Parent register_parent = FXMLLoader.load(getClass().getResource("reg2.0.fxml"));
        Scene register_scene = new Scene(register_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(register_scene);
        app_stage.show();
    }

    @FXML
    void TypeOfBusiness(ActionEvent event) {

    }

}
