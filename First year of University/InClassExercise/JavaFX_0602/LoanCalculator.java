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


public class LoanCalculator extends Application 
{
	private TextField t1 = new TextField();
	private TextField t2 = new TextField();
	private TextField t3 = new TextField();
	private TextField t4 = new TextField();
	private TextField t5 = new TextField();
	private TextField t6 = new TextField();
	private Button btCalculate = new Button("Calculate");
	private Button btInterest = new Button("Interest");

	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		GridPane gridPane = new GridPane(); 
		 gridPane.setHgap(5) ; 
		 gridPane.setVgap(5) ; 
		 gridPane.add(new Label( "Annual Interest Rate:") , 0, 0) ; 
		 gridPane.add(t1, 1, 0) ; 
		 gridPane.add(new Label("Number of Years:") , 0, 1) ; 
		 gridPane.add(t2, 1, 1) ; 
		 gridPane.add(new Label("Loan Amount:") , 0, 2) ; 
		 gridPane.add(t3, 1, 2) ; 
		 gridPane.add(new Label( "Monthly Payment:") ,0, 3) ; 
		 gridPane.add(t4, 1, 3) ; 
		 gridPane.add(new Label( "Total Payment:") ,0, 4) ; 
		 gridPane.add(t5, 1, 4) ; 
		 gridPane.add(new Label( "Total Interest:") ,0, 5) ; 
		 gridPane.add(t6, 1, 5) ; 
		 gridPane.add(btCalculate, 1, 6);
		 gridPane.add(btInterest, 0, 6); 
		 
		 
		 gridPane.setAlignment(Pos.CENTER);
		 t1.setAlignment(Pos.BOTTOM_RIGHT);
		 t2.setAlignment(Pos.BOTTOM_RIGHT);
		 t3.setAlignment(Pos.BOTTOM_RIGHT);
		 t4.setAlignment(Pos.BOTTOM_RIGHT);
		 t5.setAlignment(Pos.BOTTOM_RIGHT);
		 t6.setAlignment(Pos.BOTTOM_RIGHT);
		 t4.setEditable(false);
		 t5.setEditable(false);
		 t6.setEditable(false);
		 GridPane.setHalignment(btCalculate, HPos.RIGHT);
		 GridPane.setHalignment(btInterest, HPos.RIGHT);
		 
		 
		 btCalculate.setOnAction(e -> calculateLoanPayment());
		 btInterest.setOnAction(e -> calculateInterest());
		 
		 Scene scene = new Scene(gridPane,450,450);
		 primaryStage.setTitle("LoanCalculatot");
		 primaryStage.setScene(scene);
		 primaryStage.show();
		 
	}

	private void calculateInterest() 
	{
		double interest = Double.parseDouble(t1.getText());
		int year = Integer.parseInt(t2.getText());
		double loanAmount = Double.parseDouble(t3.getText());
		double monthlyPayment = loanAmount*(interest/1200)/(1-(1/Math.pow(1+(interest/1200), year*12)));
		double totalPayment = monthlyPayment*year*12;
		
		double result = totalPayment - loanAmount;
		
		t6.setText(String.format("$%.2f", result));
	}

	private void calculateLoanPayment() 
	{
		double interest = Double.parseDouble(t1.getText());
		int year = Integer.parseInt(t2.getText());
		double loanAmount = Double.parseDouble(t3.getText());
		
		double monthlyPayment = loanAmount*(interest/1200)/(1-(1/Math.pow(1+(interest/1200), year*12)));
		double totalPayment = monthlyPayment*year*12;
		
		t4.setText(String.format("$%.2f", monthlyPayment));
		t5.setText(String.format("$%.2f", totalPayment));
	}

}
