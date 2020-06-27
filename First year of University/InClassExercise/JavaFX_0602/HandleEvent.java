 import javafx.application.Application;
 import javafx.geometry.Pos;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
 import javafx.scene.layout.HBox;
 import javafx.stage.Stage;
 import javafx.event.ActionEvent;
 import javafx.event.EventHandler;
 
 
public class HandleEvent extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception 
	{
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button btOK = new Button("OK");
		Button btCancel = new Button("Cancel");
		btOK.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				System.out.println("Ok button clicked");
			}
		});
		
		btCancel.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				System.out.println("Cancel button clicked");
			}
		}); 
		pane.getChildren().addAll(btOK, btCancel);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("HandleEvent"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
	}
}

class OKHandlerClass implements EventHandler<ActionEvent>
{

	@Override
	public void handle(ActionEvent event)
	{
		System.out.println("Cancel button clicked");
		
	}
	


}
