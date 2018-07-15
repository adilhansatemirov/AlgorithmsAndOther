package JavaFX;

import javafx.animation.Animation;
import javafx.animation.ScaleTransition;
import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 
import javafx.stage.Stage; 
import javafx.util.Duration; 
         
public class ScalingTransition extends Application {  
   @Override 
   public void start(Stage stage) {      
      //Drawing a Circle 
      Circle circle = new Circle();
      Circle circle2 = new Circle();

      //Setting the position of the circle 
      circle.setCenterX(270.0f);
      circle.setCenterY(135.0f);

      circle2.setCenterX(330.0f);
      circle2.setCenterY(135.0f);

      
      //Setting the radius of the circle 
      circle.setRadius(40.0f);
      circle2.setRadius(40.0f);

      //Setting the color of the circle 
      circle.setFill(Color.WHITE);
      circle2.setFill(Color.RED);

      //Setting the stroke width of the circle 
      circle.setStrokeWidth(20); 
      circle2.setStrokeWidth(20);

      //Creating scale Transition 
      ScaleTransition scaleTransition = new ScaleTransition();
      ScaleTransition scaleTransition2 = new ScaleTransition();
      scaleTransition2.setDelay(Duration.seconds(2));

      //Setting the duration for the transition 
      scaleTransition.setDuration(Duration.seconds(2));
      scaleTransition2.setDuration(Duration.seconds(2));

      //Setting the node for the transition 
      scaleTransition.setNode(circle);
      scaleTransition2.setNode(circle2);

      //Setting the dimensions for scaling 
      scaleTransition.setByY(1.5);
      scaleTransition.setByX(1.5);

      scaleTransition2.setByY(1.5);
      scaleTransition2.setByX(1.5);

      //Setting the cycle count for the translation 
      scaleTransition.setCycleCount(Animation.INDEFINITE);
      scaleTransition2.setCycleCount(Animation.INDEFINITE);

      //Setting auto reverse value to true 
      scaleTransition.setAutoReverse(true); 
      scaleTransition2.setAutoReverse(true);

      //Playing the animation
      scaleTransition.play();
      scaleTransition2.play();

      //Creating a Group object
      Group root = new Group(circle2,circle);
         
      //Creating a scene object  
      Scene scene = new Scene(root, 600, 300); 
      
      //Setting title to the Stage 
      stage.setTitle("Scale transition example"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
}