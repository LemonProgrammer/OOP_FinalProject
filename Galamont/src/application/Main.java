package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
		// Runner.run();

	}

	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane Root = FXMLLoader.load(getClass().getClassLoader().getResource("application/Mainmenu.fxml"));
			primaryStage.setTitle("Main Menu");
			primaryStage.setScene(new Scene(Root, 630, 425));
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main1(String[] args) {
		launch(args);
	}
}
