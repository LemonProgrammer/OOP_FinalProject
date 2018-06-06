package control;

import java.io.File;
import java.io.IOException;
//<<<<<<< HEAD

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

//=======
import java.net.URISyntaxException;
import java.net.URL;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
//>>>>>>> FernandoBranch
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

//<<<<<<< HEAD
//public class MainMenuController {
//	@FXML
//	Button startButton;
//
//	//Media menuSong = new Media(new File("bin\\assets\\TitleSong.mp3").toURI().toString());
//	//MediaPlayer mP = new MediaPlayer(menuSong);
//
//	public void initialize() {
//		// mP.play();
//	}
//
//	public void startButtonClicked() {
//
//	Label l2= new Label();
//	 Image image = new Image(getClass().getResourceAsStream("START.png"));
//    l2.setGraphic(new ImageView(image));
//
//		try {
//			FXMLLoader loader = FXMLLoader.load(getClass().getResource("control/GameScene.fxml"));
//			Stage stage = (Stage) startButton.getScene().getWindow();
//			Scene scene = new Scene(loader.getRoot());
//			stage.setScene(scene);
//			stage.show();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//=======
public class MainMenuController
{
	@FXML
	Button startButton;

	public void initialize()
	{
//		File testFile = new File("bin\\assets\\TitleSong.mp3");
//		if (testFile.exists())
//		{
//			System.out.println("I exist!");
//		}
//		String path = testFile.toURI().toString();
//		Media menuSong = new Media(path);
//		MediaPlayer mP = new MediaPlayer(menuSong);
//		mP.play();
	}

	public void startButtonClicked()
	{
		//Scene scene = startButton.getScene();
		//Window window = scene.getWindow();
		//String path = ;
		//GameController gc = new GameController();
		Label l2= new Label();
		 Image image = new Image(getClass().getClassLoader().getResourceAsStream("assets/START.png"));
	    l2.setGraphic(new ImageView(image));
		try
		{

			AnchorPane loader = new AnchorPane();
			loader = FXMLLoader.load(getClass().getClassLoader().getResource("application/Resource/GameScene.fxml"));
			Scene scene = new Scene(loader);
			Stage stage = new Stage();//(Stage) scene.getWindow();//startButton.getScene().getWindow();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//>>>>>>> FernandoBranch
	}
}
