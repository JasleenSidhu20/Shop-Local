import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
//import javafx.scene.control.Menu;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class AppSceneController {
    
    ObservableList<String> mainBusinessList = FXCollections.observableArrayList("Coffee/Tea", "Bars", "Restaraunt", "Desserts", "Grocery Stores", "Hair Salons", "Spas", "Car Wash", "Auto Repair", "Gas Stations", "Fashion");
   
    @FXML
    private TextField location_input;

    @FXML
    private Button main_search_button;

    @FXML
    private ChoiceBox<String> type_of_business;

    @FXML
    private Button register_business_button;

    @FXML
    private void initialize() {
        type_of_business.setValue("Select Type of Business");
        type_of_business.setItems(mainBusinessList);
    }
    
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
        Parent register_parent = FXMLLoader.load(getClass().getResource("AppScene.fxml"));
        Scene register_scene = new Scene(register_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.setScene(register_scene);
        app_stage.show();
    }

    @FXML
    void TypeOfBusiness(ActionEvent event) {

    }

}
