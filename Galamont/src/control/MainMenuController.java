package control;

import java.io.File;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class MainMenuController {
	@FXML
	Button startButton;

	Media menuSong = new Media(new File("bin\\assets\\TitleSong.mp3").toURI().toString());
	MediaPlayer mP = new MediaPlayer(menuSong);

	public void initialize() {
		// mP.play();
	}

	public void startButtonClicked() {
		// Scene scene = startButton.getScene();
		// Window window = scene.getWindow();
		try {
			FXMLLoader loader = FXMLLoader.load(getClass().getResource("control/GameScene.fxml"));
			Stage stage = (Stage) startButton.getScene().getWindow();
			Scene scene = new Scene(loader.getRoot());
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
