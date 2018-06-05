package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		GameController gc = new GameController();
		gc.testGrid = new GridPane();
		gc.newGame();
		
		launch(args);
		// Runner.run();

	}

	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main1(String[] args) {
		launch(args);
	}
	}


