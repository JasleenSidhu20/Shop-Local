
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;


public class RegistrationController /*implements Initializable*/ {

    //allows different items in the choice box drop down (different types of businesses)
    ObservableList<String> businessList = FXCollections.observableArrayList("Delivery Food", "Coffee/Tea", "Bars", "Restaraunt", "Desserts", "Grocery Stores", "Hair Salons", "Spas", "Car Wash", "Auto Repair", "Gas Stations", "Fashion");
    //Small Business Information

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
    private ChoiceBox businessTypeBox;

    @FXML
    public Button registrationSubmitButton;

    @FXML
    public void initialize() {
        businessTypeBox.setValue("Select Type of Business");
        businessTypeBox.setItems(businessList);
    }

    @FXML
    
      void goRegistrationSubmit(ActionEvent event) {
        try {
            if (businessNameField.getText().isEmpty() || addressField.getText().isEmpty() || cityField.getText().isEmpty()
                || stateField.getText().isEmpty() || zipcodeField.getText().equals("") || ownerNameField.getText().isEmpty()
                || emailField.getText().isEmpty() || phoneNumberField.getText().equals("") ) {
                Alert b = new Alert(Alert.AlertType.ERROR);
                b.setTitle("ERROR");
                b.setHeaderText("Make sure no fields are left empty!");
                b.showAndWait();
            } else if (Integer.parseInt(zipcodeField.getText()) < 0 || Integer.parseInt(phoneNumberField.getText()) < 0) {
                //FIXME: Phone number less than length
                Alert neg = new Alert(Alert.AlertType.ERROR);
                neg.setTitle("ERROR");
                neg.setHeaderText("Make sure you don't enter a negative number for questions 3, 4, 5, and 7!");
                neg.showAndWait();
            } else {
                String businessName = businessNameField.getText();
                String address = addressField.getText();
                String city = cityField.getText();
                String state = stateField.getText();
                int zipcode = Integer.parseInt(zipcodeField.getText());
                String ownerName = ownerNameField.getText();
                //FIXME: Make owner name first and last name
                String email = emailField.getText();
                int phoneNumber = Integer.parseInt(phoneNumberField.getText());
                businessNameField.clear();
                addressField.clear();
                cityField.clear();
                stateField.clear();
                zipcodeField.clear();
                ownerNameField.clear();
                emailField.clear();
                phoneNumberField.clear();

            }
        } catch (NumberFormatException nfe) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("ERROR");
            a.setHeaderText("Make sure you enter a number for questions 3, 4, 5 and 7!");
            a.showAndWait();
            //FIXME: Fix this 
        }
    }

}
