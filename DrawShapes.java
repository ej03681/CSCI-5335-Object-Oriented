import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DrawShapes extends Application {
@Override
public void start(Stage primaryStage) {
	Circle circle = new Circle(100, 100, 50);
	Button drawC = new Button("Draw Circle");
	
    Rectangle rect = new Rectangle(80, 80, 120, 60);
    Button drawR = new Button("Draw Rectangle");
    
    Ellipse ellipse = new Ellipse(75, 75, 75, 35);
    Button drawEl = new Button("Draw Ellipse");    
    
    Line line = new Line(90, 90, 10, 10);
    Button drawL = new Button("Draw Line");
    
    StackPane ellipsePane = new StackPane();
    ellipsePane.getChildren().addAll(drawEl);
    ellipsePane.setAlignment(drawEl, Pos.BOTTOM_CENTER);
    drawEl.setOnAction(new EventHandler<ActionEvent>() {
		@SuppressWarnings({ "unchecked" })
		@Override
		public void handle(ActionEvent e) {
		ellipsePane.getChildren().addAll(ellipse);
		}
    });
    
    StackPane circlePane = new StackPane();
    circlePane.getChildren().addAll(drawC);
    circlePane.setAlignment(drawC, Pos.BOTTOM_CENTER);
    drawC.setOnAction(new EventHandler<ActionEvent>() {
		@SuppressWarnings({ "unchecked" })
		@Override
		public void handle(ActionEvent e) {
		circlePane.getChildren().addAll(circle);			
		}
    });
    
    StackPane rectanglePane = new StackPane();
    rectanglePane.getChildren().addAll(drawR);
    rectanglePane.setAlignment(drawR, Pos.BOTTOM_CENTER);
    drawR.setOnAction(new EventHandler<ActionEvent>() {
		@SuppressWarnings({ "unchecked" })
		@Override
		public void handle(ActionEvent e) {
		rectanglePane.getChildren().addAll(rect);			
		}
    });
    
    StackPane linePane = new StackPane();
    linePane.getChildren().addAll(drawL);
    linePane.setAlignment(drawL, Pos.BOTTOM_CENTER);
    drawL.setOnAction(new EventHandler<ActionEvent>() {
		@SuppressWarnings({ "unchecked" })
		@Override
		public void handle(ActionEvent e) {
		linePane.getChildren().addAll(line);
		}
    });

    HBox pane = new HBox(20);
    pane.getChildren().addAll(ellipsePane, circlePane, rectanglePane, linePane);

    Scene scene = new Scene(pane, 550, 150);
    primaryStage.setTitle("Draw Shapes GUI");
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }

  public static void main(String[] args) {
    launch(args);
  }
}
