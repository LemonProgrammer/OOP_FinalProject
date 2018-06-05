package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		Application.launch(Main.class, args);
		// Runner.run();

	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root;
		root = FXMLLoader.load(getClass().getResource("Mainmenu.fxml"));
//		root = FXMLLoader.load(getClass().getResource("/application/Resource/GameScene.fxml"));
		primaryStage.setTitle("Main Menu");
		primaryStage.setScene(new Scene(root, 630, 545));
		primaryStage.show();
	}

}
