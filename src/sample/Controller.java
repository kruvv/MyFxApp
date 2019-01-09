package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button authSignButton;

    @FXML
    private Button loginSignUpButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField loginField;



    @FXML
    void initialize() {
        authSignButton.setOnAction(event -> {
            System.out.println("You press key on button < Come in >");
        });

    }
}

