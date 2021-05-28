import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class RegistrationController {

    @FXML
    private TextField businessNameField;

    @FXML
    private TextField addressField;

    @FXML
    private TextField cityField;

    @FXML
    private TextField stateField;

    @FXML
    private TextField zipcodeField;

    @FXML
    private TextField ownerNameField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField phoneNumberField;

    @FXML
    private ChoiceBox<?> businessTypeBox;

    @FXML
    private Button registrationSubmitButton;

}