import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import java.io.FileWriter;
import javafx.scene.Node;
//import org.json.simple.JSONObject;
import java.io.IOException;
//import org.json.simple.JSONArray;


public class RegistrationController {

    //allows different items in the choice box drop down (different types of businesses)
    ObservableList<String> businessList = FXCollections.observableArrayList("Coffee/Tea", "Bars", "Restaraunt", "Desserts", "Grocery Stores", "Hair Salons", "Spas", "Car Wash", "Auto Repair", "Gas Stations", "Fashion");
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
    private ChoiceBox<String> businessTypeBox;

    @FXML
    private Button registrationSubmitButton;

    @FXML
    private Button buttonReturn;

    @FXML
    void buttonReturnFunction(ActionEvent event) throws IOException{
        Parent regs_par = FXMLLoader.load(getClass().getResource("AppScene.fxml"));
        Scene regs_scene = new Scene(regs_par);
        Stage regs_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        regs_stage.setScene(regs_scene);
        regs_stage.show();
    }

    @FXML
    private void initialize() {
        businessTypeBox.setValue("Select Type of Business");
        businessTypeBox.setItems(businessList);
    }


    @FXML
      void goRegistrationSubmit(ActionEvent event) throws IOException {
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
                neg.setHeaderText("Make sure you enter a positive number for the zipcode and phone number!");
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
                //JSONObject jsonObject = new JSONObject();
                //jsonObject.put("businessName", "businessName");
                //jsonObject.put("address", "address");
                //jsonObject.put("city", "city");
                //jsonObject.put("state", "state");
                //jsonObject.put("zipcode", "zipcode");
                //jsonObject.put("ownerName", "ownerName");
                //JSONArray liste = new JSONArray();
                //liste.add(jsonObject);
                //FileWriter file = new FileWriter("businesses.json");
                //file.write(jsonObject.toJSONString());
                //file.flush();
                businessNameField.clear();
                addressField.clear();
                cityField.clear();
                stateField.clear();
                zipcodeField.clear();
                ownerNameField.clear();
                emailField.clear();
                phoneNumberField.clear();
                Parent reg_par = FXMLLoader.load(getClass().getResource("AppScene.fxml"));
                Scene reg_scene = new Scene(reg_par);
                Stage reg_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                reg_stage.setScene(reg_scene);
                reg_stage.show();
            }
        } catch (NumberFormatException nfe) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("ERROR");
            a.setHeaderText("Make sure you enter a number for the zipcode and phone number!");
            a.showAndWait();
            //FIXME: Fix this 
        } 
        //catch (IOException ioe){

        //}
    }

}
