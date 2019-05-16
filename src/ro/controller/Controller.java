package ro.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import ro.main.Main;

public class Controller {
    private Main main = new Main();
    @FXML
    private Button living;
    @FXML
    private Button bedRoom;
    @FXML
    private Button room_1;

    @FXML
    private void living(ActionEvent event) {

        try {
            main.living();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @FXML
    void closeWindows(ActionEvent event) {
            System.exit(0);
    }

    @FXML
    void bedRoom(ActionEvent event) throws Exception {
        main.bedRoom();
    }
    @FXML
    void room_1(ActionEvent event) throws Exception {
        main.room_1();
    }
}
