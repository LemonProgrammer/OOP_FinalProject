package control;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainMenuController {
	public void startButtonClicked() {
	Label l2= new Label();
	 Image image = new Image(getClass().getResourceAsStream("START.png"));
    l2.setGraphic(new ImageView(image));
    //start.set
	}
}
