package application;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CreditScene extends Application {

	    @Override
	    public void start(Stage primaryStage) {
	    	
	    	
	        VBox vbox = new VBox();
	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("*************************************"));
	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("*************************************"));
	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("*************************************"));

	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("Thanks to everyone who helped in the creation of Neumont Galga"));
	    
	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("TEAM LEAD---> FERNANDO BLANCO "));
	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("*************************************"));

	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("GUI AND LOGIC---> CRISTAIN LAXACMY"));
	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("*************************************"));

	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("GUI AND LOGIC---> SATCHIT SHARMA"));
	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("*************************************"));

	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("ASSETS AND ANIMATION---> ALEX PURCELL"));
	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("*************************************"));

	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("ASSETS AND ANIMATION---> GAGE BIBLSI"));
	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("*************************************"));

	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("SPECIAL THANKS TO TUTOR KENT STRINGER"));
	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("*************************************"));

	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("SPECIAL THANKS TO TUTOR MR HILL"));
	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("*************************************"));
	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("AND OF COURSE THANKS TO SUPREME CHANCOLLOR KREBS"));
	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("*************************************"));

	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("I THINK I WANTED TO DIE 47 TIMES THROUGHOUT THIS PROJECT"));
	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("*************************************"));
	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("*************************************"));
	        for (int i = 0; i < 1; i++)
	            vbox.getChildren().add(new Text("*************************************"));


	        ScrollPane sp = new ScrollPane(vbox);
	        Scene scene = new Scene(sp, 433, 12*12);

	        primaryStage.setScene(scene);
	        scene.getStylesheets().add("application.css");
	        primaryStage.show();
	        
	       
	        double textHeight = vbox.getHeight() / vbox.getChildren().size();
	        primaryStage.setHeight(textHeight*19+primaryStage.getHeight()-scene.getHeight());

	        Timeline timeline = new Timeline();
	        timeline.setCycleCount(Timeline.INDEFINITE);
	        KeyValue kv = new KeyValue(sp.vvalueProperty(), sp.getVmax());
	        KeyFrame kf = new KeyFrame(Duration.millis(3900), kv);
	        timeline.getKeyFrames().addAll(kf);
	        timeline.play();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}


