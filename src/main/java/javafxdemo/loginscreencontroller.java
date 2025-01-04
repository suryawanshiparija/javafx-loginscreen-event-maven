package javafxdemo;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class loginscreencontroller {

    @FXML
    public TextField loginName;

    @FXML
    public TextField password;

    @FXML
    public void loginButtonClick() {
        System.out.println("Username: " + loginName.getText());
        System.out.println("Password: " + password.getText());
    }
}
