package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
<<<<<<< HEAD
import javafx.scene.layout.BorderPane;

import javafx.scene.layout.GridPane;

=======
>>>>>>> FernandoBranch
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
<<<<<<< HEAD
		GameController gc = new GameController();
		gc.testGrid = new GridPane();
		gc.newGame();
		
		launch(args);
=======
		Application.launch(Main.class, args);
>>>>>>> FernandoBranch
		// Runner.run();

	}

	@Override
<<<<<<< HEAD
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


=======
	public void start(Stage primaryStage) throws IOException {
		Parent root;
		root = FXMLLoader.load(getClass().getResource("Mainmenu.fxml"));
//		root = FXMLLoader.load(getClass().getResource("/application/Resource/GameScene.fxml"));
		primaryStage.setTitle("Main Menu");
		primaryStage.setScene(new Scene(root, 630, 545));
		primaryStage.show();
	}

}
>>>>>>> FernandoBranch
