

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FX_1 extends Application
{

	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	
	public void start(Stage primaryStage)
	{
//		Pane pane2 = new HBox(100);
//		pane2.setPadding(new Insets(50,50,50,50));
		
		
		FlowPane pane = new FlowPane();
		pane.setPadding(new Insets(21,102,77,22));
		pane.setHgap(3);
		pane.setVgap(4);
		
		Image image = new Image("dow.png");
		
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(100);
		imageView.setFitWidth(100);
		pane.getChildren().add(imageView);
		
		Label label = new Label("First Name: ");
		label.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20));
		
		pane.getChildren().addAll(label,new TextField(), new Label("MI: "));
		TextField tfMi = new TextField();
		tfMi.setPrefColumnCount(1);
		pane.getChildren().addAll(tfMi,new Label("Last Name: "),new TextField());
	
		Scene scene = new Scene(pane,300,450);
		primaryStage.setTitle("ShowName");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}

}
