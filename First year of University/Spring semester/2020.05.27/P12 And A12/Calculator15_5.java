import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
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


public class Calculator15_5 extends Application 
{
	private TextField t1 = new TextField();
	private TextField t2 = new TextField();
	private TextField t3 = new TextField();
	private TextField t4 = new TextField();

	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	
	public void start(Stage primaryStage)
	{	
		GridPane pane = new GridPane();
		pane.setHgap(5);
		pane.setVgap(5);
		
		Label label_1 = new Label("Investment Amount: ");
		Label label_2 = new Label("Number of year: ");
		Label label_3 = new Label("Annual Interest Rate: ");
		Label label_4 = new Label("Future Value: ");
		
		Button bt = new Button("Calculate");
		
		pane.add(label_1, 0, 0);
		pane.add(t1, 1, 0);
		pane.add(label_2, 0, 1);
		pane.add(t2, 1, 1);
		pane.add(label_3, 0, 2);
		pane.add(t3, 1, 2);
		pane.add(label_4, 0, 3);
		pane.add(t4, 1, 3);
		pane.add(bt, 1, 4);
		
		pane.setAlignment(Pos.CENTER);
		t1.setAlignment(Pos.BASELINE_RIGHT);
		t2.setAlignment(Pos.BASELINE_RIGHT);
		t3.setAlignment(Pos.BASELINE_RIGHT);
		t4.setAlignment(Pos.BASELINE_RIGHT);
		t4.setEditable(false);
		GridPane.setHalignment(bt, HPos.RIGHT);
		
		bt.setOnAction(e -> calculate());
		
		Scene scene = new Scene(pane,450,450);
		primaryStage.setTitle("ShowCalculate");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void calculate()
	{
		double invest = Double.parseDouble(t1.getText());
		int numOfYear = Integer.parseInt(t2.getText());
		double rate = Double.parseDouble(t3.getText());
		double result = invest*Math.pow(1+rate/1200, numOfYear*12);
		
		t4.setText(String.format("$%.2f", result));
	}

}
