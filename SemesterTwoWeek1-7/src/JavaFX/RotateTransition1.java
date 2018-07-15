package JavaFX;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration; 
         
public class RotateTransition1 extends Application { 
   @Override 
   public void start(Stage stage) {      
      //Creating a hexagon 
      Polygon hexagon = new Polygon();
      Rectangle square = new Rectangle(100,100);
      square.setX(300);
      square.setY(150);

      //Adding coordinates to the hexagon 
      hexagon.getPoints().addAll(200.0, 50.0,
              400.0, 50.0,
              450.0, 150.0,
              400.0, 250.0,
              200.0, 250.0,
              150.0, 150.0);
      //Setting the fill color for the hexagon 
      hexagon.setFill(Color.RED); 
       
      //Creating a rotate transition    
      RotateTransition rotateTransition = new RotateTransition(); 
      
      //Setting the duration for the transition 
      rotateTransition.setDuration(Duration.seconds(3));
      
      //Setting the node for the transition 
      rotateTransition.setNode(square);
      
      //Setting the angle of the rotation 
      rotateTransition.setByAngle(360);
      
      //Setting the cycle count for the transition 
      rotateTransition.setCycleCount(Animation.INDEFINITE);
      
      //Setting auto reverse value to false 
      rotateTransition.setAutoReverse(true); 
      
      //Playing the animation 
      rotateTransition.play(); 
         
      //Creating a Group object   
      Group root = new Group(square);
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 300);
      
      //Setting title to the Stage 
      stage.setTitle("Hexagon rotate transition example ");
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
} 