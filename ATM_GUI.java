import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ATM_GUI extends Application {
	@Override
public void start(Stage primaryStage) throws java.io.IOException {
		
	FlowPane ATM = new FlowPane();

	Button withdraw = new Button("Withdraw");
	withdraw.setPrefWidth(150);
	withdraw.setPrefHeight(150);
	withdraw.setFont(Font.font(26));
	
	Button deposit = new Button("Deposit");
	deposit.setPrefWidth(150);
	deposit.setPrefHeight(150);
	deposit.setFont(Font.font(26));
	
	Button checkBal = new Button("Balance");
	checkBal.setPrefWidth(150);
	checkBal.setPrefHeight(150);
	checkBal.setFont(Font.font(26));
	
	ATM.alignmentProperty().set(Pos.CENTER);
	
	ATM.setMargin(withdraw, new Insets(100, 10, 0, 10));
	ATM.setMargin(deposit, new Insets(100, 10, 0, 10));
	ATM.setMargin(checkBal, new Insets(100, 10, 0, 10));
	ATM.getChildren().addAll(withdraw, deposit, checkBal);
	
	
	
	Text quickdraw = new Text("Quick Withdraw");
	Button twenty = new Button("20");
	Button forty = new Button("40");
	Button eighty = new Button("60");
	Button hundo = new Button("100");


	BorderPane quick = new BorderPane();
	quick.getChildren().addAll();
	
	ATM.getChildren().addAll();
	
	
	
	
	
	
	Scene scene = new Scene(ATM, 700, 600);
	primaryStage.setTitle("ATM");
	primaryStage.setScene(scene);
	primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
