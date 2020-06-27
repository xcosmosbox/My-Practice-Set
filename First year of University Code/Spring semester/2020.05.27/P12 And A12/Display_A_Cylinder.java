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
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class Display_A_Cylinder extends Application
{

	public static void main(String[] args)
	{
		Application.launch(args);
	}
	
	public void start(Stage primaryStage)
	{	
		Pane pane = new Pane();
		Ellipse ellipse = new Ellipse(100,40,50,20);
		ellipse.setFill(Color.WHITE);
		ellipse.setStroke(Color.BLACK);
		
		Line line_1 = new Line(50,40,50,240);
		Line line_2 = new Line(150,40,150,240);
		
		Arc arc1 = new Arc(100,240,50,20,0,180);
		arc1.getStrokeDashArray().addAll(6.0,21.0);
		arc1.setFill(Color.WHITE);
		arc1.setStroke(Color.BLACK);
		Arc arc2 = new Arc(100,240,50,20,180,180);
		arc2.setFill(Color.WHITE);
		arc2.setStroke(Color.BLACK);
		
		pane.getChildren().addAll(ellipse,line_1,line_2,arc1,arc2);
	
		Scene scene = new Scene(pane,450,450);
		primaryStage.setTitle("ShowCylinder");
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}

}
