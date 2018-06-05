package control;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class MainMenuController
{
	@FXML
	Button startButton;

	public void initialize()
	{
		File testFile = new File("bin\\assets\\First Level Song.mp3");
		if (testFile.exists())
		{
			System.out.println("I exist!");
		}
		String path = testFile.toURI().toString();
		Media menuSong = new Media(path);
		MediaPlayer mP = new MediaPlayer(menuSong);
		mP.play();
	}

	public void startButtonClicked()
	{
		//Scene scene = startButton.getScene();
		//Window window = scene.getWindow();
		//String path = ;
		//GameController gc = new GameController();
		try
		{

			AnchorPane loader = new AnchorPane();
			loader = FXMLLoader.load(getClass().getClassLoader().getResource("application/Resource/GameScene.fxml"));
			Scene scene = new Scene(loader);
			Stage stage = (Stage) startButton.getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
