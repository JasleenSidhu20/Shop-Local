import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import javafx.scene.control.Button;


public class RegistrationController {
    private ShopLocal business;

    @FXML
    private void goRegistration() throws IOException{
        business.showRegistration();
    }
    //allows different items in the choice box drop down (different types of businesses)
    ObservableList<String> businessList = FXCollections.observableArrayList("Restaraunt", "Fashion", "Grocery");
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
    private ChoiceBox<?> businessTypeBox;

    @FXML
    private void initialize(){
        businessTypeBox.setValue("Select Type of Business");
        businessTypeBox.setItems(businessList);
    }

    @FXML
    private Button registrationSubmitButton;

    //Submit Button should return to the main page (AppScene)
    private void goRegistrationSubmit() throws IOException{
        business.showMainView();
    }

}
