import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class P12_1_CreatForFuns extends Application
{

	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	
	public void start(Stage primaryStage)
	{	
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(21,102,77,22));
		pane.setHgap(5);
		pane.setVgap(5);
		
		Image image = new Image("dow.png");
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(100);
		imageView.setFitWidth(100);
		pane.add(new ImageView(image),0,0);
		pane.add(new ImageView(image),1,0);
		pane.add(new ImageView(image),0,1);
		pane.add(new ImageView(image),1,1);
		
	
		Scene scene = new Scene(pane,300,450);
		primaryStage.setTitle("ShowFuns");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}


}
