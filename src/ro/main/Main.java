package ro.main;


import com.fazecast.jSerialComm.SerialPort;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import gnu.io.*;
import com.fazecast.jSerialComm.*;

public class Main extends Application {
    Stage stage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("/ro/interfaces/home.fxml"));

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setMaxHeight(600);
        primaryStage.setMaximized(false);
        scene.setFill(Color.TRANSPARENT);
        primaryStage.initStyle(StageStyle.TRANSPARENT);

        primaryStage.show();

    }
    public void living() throws Exception{
        Stage living = new Stage();
        stage = living;

        Parent livingRoom = FXMLLoader.load(getClass().getResource("/ro/interfaces/living.fxml"));

        Scene scene = new Scene(livingRoom);
        stage.initModality(Modality.APPLICATION_MODAL);
        living.setScene(scene);
        living.initStyle(StageStyle.TRANSPARENT);
        living.showAndWait();
    }
    public void bedRoom()throws Exception{
        Stage stageBedRoom = new Stage();
        stage = stageBedRoom;
        Parent bedR = FXMLLoader.load(getClass().getResource("/ro/interfaces/bedRoom.fxml"));
        Scene sceneBed = new Scene(bedR);
        stageBedRoom.initModality(Modality.APPLICATION_MODAL);
        stageBedRoom.setScene(sceneBed);

        stageBedRoom.initStyle(StageStyle.TRANSPARENT);
        stageBedRoom.showAndWait();
    }
    public void room_1()throws Exception{
        Stage stageRoom_1 = new Stage();
        stage = stageRoom_1;
        Parent room1 = FXMLLoader.load(getClass().getResource("/ro/interfaces/room_1.fxml"));

        Scene sceneRoom1 = new Scene(room1);
        stageRoom_1.initModality(Modality.APPLICATION_MODAL);
        stageRoom_1.initStyle(StageStyle.TRANSPARENT);
        stageRoom_1.showAndWait();
    }


    public static void main(String[] args) {
        launch(args);
        SerialPort port = SerialPort.getCommPort("");



    }
}
