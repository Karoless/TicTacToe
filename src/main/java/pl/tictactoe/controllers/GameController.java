package pl.tictactoe.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import pl.tictactoe.Logic.GameLogic;


public class GameController {

    @FXML
    public Button button0X0;
    @FXML
    public Button button1X0;
    @FXML
    public Button button2X0;
    @FXML
    public Button button0X1;
    @FXML
    public Button button1X1;
    @FXML
    public Button button2X1;
    @FXML
    public Button button0X2;
    @FXML
    public Button button1X2;
    @FXML
    public Button button2X2;

    private GameLogic gameLogic;

    @FXML
    public void initialize() {
        gameLogic = new GameLogic();
        this.gameLogic.setScreen();
        this.setDefaultDisable(false);
        this.setDefaultText();

    }
    @FXML
    public void setDefaultText() {
        this.button0X0.setText("");
        this.button0X1.setText("");
        this.button0X2.setText("");
        this.button1X0.setText("");
        this.button1X1.setText("");
        this.button1X2.setText("");
        this.button2X0.setText("");
        this.button2X1.setText("");
        this.button2X2.setText("");
    }
    @FXML
    public void setDefaultDisable(boolean result) {
        this.button0X0.setDisable(result);
        this.button0X0.setOpacity(100);
        this.button0X1.setDisable(result);
        this.button0X1.setOpacity(100);
        this.button0X2.setDisable(result);
        this.button0X2.setOpacity(100);
        this.button1X0.setDisable(result);
        this.button1X0.setOpacity(100);
        this.button1X1.setDisable(result);
        this.button1X1.setOpacity(100);
        this.button1X2.setDisable(result);
        this.button1X1.setOpacity(100);
        this.button2X0.setDisable(result);
        this.button2X0.setOpacity(100);
        this.button2X1.setDisable(result);
        this.button2X1.setOpacity(100);
        this.button2X2.setDisable(result);
        this.button2X1.setOpacity(100);
    }

    @FXML
    public void actionOnButton0x0() {
        this.button0X0.setText(this.gameLogic.setScreen(0,0));
        this.button0X0.setDisable(true);
        this.button0X0.setOpacity(100);
        System.out.println(this.gameLogic.gameOver());
        if(this.gameLogic.gameOver()) {
            this.finishGame();
        }
    }
    @FXML
    public void actionOnButton0x1() {
        this.button0X1.setText(this.gameLogic.setScreen(0,1));
        this.button0X1.setDisable(true);
        this.button0X1.setOpacity(100);
        System.out.println(this.gameLogic.gameOver());
        if(this.gameLogic.gameOver()) {
            this.finishGame();
        }
    }
    @FXML
    public void actionOnButton0x2() {
        this.button0X2.setText(this.gameLogic.setScreen(0,2));
        this.button0X2.setDisable(true);
        this.button0X2.setOpacity(100);
        System.out.println(this.gameLogic.gameOver());
        if(this.gameLogic.gameOver()) {
            this.finishGame();
        }
    }
    @FXML
    public void actionOnButton1x0() {
        this.button1X0.setText(this.gameLogic.setScreen(1,0));
        this.button1X0.setDisable(true);
        this.button1X0.setOpacity(100);
        System.out.println(this.gameLogic.gameOver());
        if(this.gameLogic.gameOver()) {
            this.finishGame();
        }
    }
    @FXML
    public void actionOnButton1x1() {
        this.button1X1.setText(this.gameLogic.setScreen(1,1));
        this.button1X1.setDisable(true);
        this.button1X1.setOpacity(100);
        System.out.println(this.gameLogic.gameOver());
        if(this.gameLogic.gameOver()) {
            this.finishGame();
        }

    }
    @FXML
    public void actionOnButton1x2() {
        this.button1X2.setText(this.gameLogic.setScreen(1,2));
        this.button1X2.setDisable(true);
        this.button1X2.setOpacity(100);
        System.out.println(this.gameLogic.gameOver());
        if(this.gameLogic.gameOver()) {
            this.finishGame();
        }

    }
    @FXML
    public void actionOnButton2x0() {
        this.button2X0.setText(this.gameLogic.setScreen(2,0));
        this.button2X0.setDisable(true);
        this.button2X0.setOpacity(100);
        System.out.println(this.gameLogic.gameOver());
        if(this.gameLogic.gameOver()) {
            this.finishGame();
        }

    }
    @FXML
    public void actionOnButton2x1() {
        this.button2X1.setText(this.gameLogic.setScreen(2,1));
        this.button2X1.setDisable(true);
        this.button2X1.setOpacity(100);
        System.out.println(this.gameLogic.gameOver());
        if(this.gameLogic.gameOver()) {
            this.finishGame();
        }

    }
    @FXML
    public void actionOnButton2x2() {
        this.button2X2.setText(this.gameLogic.setScreen(2,2));
        this.button2X2.setDisable(true);
        this.button2X2.setOpacity(100);
        System.out.println(this.gameLogic.gameOver());
        if(this.gameLogic.gameOver()) {
            this.finishGame();
        }
    }
    @FXML
    public void finishGame() {
        Alert infoAlert = new Alert(Alert.AlertType.INFORMATION);
        infoAlert.setTitle("Koniec gry");
        infoAlert.setHeaderText(null);
        infoAlert.setContentText(this.gameLogic.getResult());
        infoAlert.showAndWait();

        System.out.println("test");
        this.initialize();
    }
}

