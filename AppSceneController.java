import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;

public class AppSceneController {

    @FXML
    private TextField location_input;

    @FXML
    private Button main_search_button;

    @FXML
    private ComboBox<?> type_of_business;

    @FXML
    private Menu register_business_button;

    @FXML
    public void RegisterBusiness(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("Registration.fxml");
    }

    @FXML
    public void SearchButton(ActionEvent event) throws IOException {
        String location = location_input.getText().toString();

    }

    @FXML
    public void TypeOfBusiness(ActionEvent event) throws IOException {

    }

}
