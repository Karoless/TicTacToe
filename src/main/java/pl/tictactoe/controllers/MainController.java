package pl.tictactoe.controllers;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import java.util.Optional;


public class MainController {

    @FXML
    private void initialize() {

    }

    @FXML
    public void closeApp(ActionEvent actionEvent) {
        Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
        confirmationAlert.setTitle("Zamknij aplikacje");
        confirmationAlert.setHeaderText("Czy na pewno chcesz zamknąć aplikacje?");
        Optional<ButtonType> result = confirmationAlert.showAndWait();
        if(result.get() == ButtonType.OK) {
            Platform.exit();
            System.exit(0);
        }

    }
    @FXML
    public void setCaspian(ActionEvent actionEvent) {
        Application.setUserAgentStylesheet(Application.STYLESHEET_CASPIAN);
    }
    @FXML
    public void setModena(ActionEvent actionEvent) {
        Application.setUserAgentStylesheet(Application.STYLESHEET_MODENA);
    }
    @FXML
    public void aboutApp(ActionEvent actionEvent) {
        Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
        infoAlert.setTitle("O aplikacji");
        infoAlert.setHeaderText(null);
        infoAlert.setContentText("Aplikacja treningowa \nAutor: Karol Stachowicz");
        infoAlert.showAndWait();
    }
}
