package sample.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox singUpCheckBoxMale;

    @FXML
    private TextField signUpFirstName;

    @FXML
    private TextField signUpLastName;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField signUpCountry;

    @FXML
    private PasswordField passwordField;

    @FXML
    private CheckBox singUpCheckBoxFemale;

    @FXML
    private TextField loginField;



    @FXML
    void initialize() {


    }
}
