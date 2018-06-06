package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
		// Runner.run();

	}

    @Override
    public void start(Stage primaryStage) {
        Parent Root;
        try {
            Root = FXMLLoader.load(getClass().getResource("GameScene.fxml"));
            primaryStage.setTitle("Hey");
            primaryStage.setScene(new Scene(Root, 1000, 800));
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main1(String[] args) {
        launch(args);
    }
}


