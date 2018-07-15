package Week7;
/*
 LABTASK: Week 7
 Student: Adilkhan Satemirov
 Mail: adilhansatemirov@gmail.com
 Teacher: Shahriyar Shamilulu
 */
import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class House extends Application{
    Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        //GROUND
        Rectangle ground = new Rectangle(0,400,700,200);
        ground.setFill(Color.DARKGREEN);

        //WALL
        Rectangle wall = new Rectangle(250,250,200,200);
        //setting frame black
        wall.setStroke(Color.BLACK);
        wall.setFill(Color.CHOCOLATE);

        //ROOF
        Polygon roof = new Polygon();
        roof.getPoints().addAll(350.0,150.0,
                210.0,290.0,
                490.0,290.0);
        roof.setFill(Color.MAROON);

        //WINDOW AND FRAME
        Rectangle window = new Rectangle(270,320,60,60);
        window.setFill(Color.YELLOW);
        window.setStroke(Color.BLACK);
        Rectangle frameHorizontal = new Rectangle(270,345,60,5);
        frameHorizontal.setFill(Color.BLACK);
        Rectangle frameVertical = new Rectangle(297,320,5,60);
        frameVertical.setFill(Color.BLACK);

        //DOOR
        Rectangle door = new Rectangle(360,330,70,120);
        door.setFill(Color.CHOCOLATE);
        door.setStroke(Color.BLACK);
        Circle handle = new Circle(3);
        handle.setFill(Color.BLACK);
        handle.setCenterX(370);
        handle.setCenterY(385);

        //AN OBJECT WE WANT TO MOVE
        Circle sun = new Circle(50);
        sun.setFill(Color.YELLOW);

        //THE TRACK WE WANT OBJECT TO MOVE ON
        Circle track = new Circle(300);
        track.setCenterX(350);
        track.setCenterY(350);

        //TRANSITION OBJECT
        PathTransition transition = new PathTransition();
        //select node we want to move
        transition.setNode(sun);
        //how much time
        transition.setDuration(Duration.seconds(6));
        //by what we want it to move
        transition.setPath(track);
        //how many times
        transition.setCycleCount(PathTransition.INDEFINITE);
        //shouldn't stop after each cycle
        transition.setInterpolator(Interpolator.LINEAR);
        //go!
        transition.play();

        //BACKGROUND = SKY
        Rectangle background = new Rectangle(0,0,700,500);
        background.setFill(Color.DARKBLUE);

        //PUTTING EVERYTHING TO THE GROUP
        Group root = new Group(background,sun,ground,wall,roof,window,door,handle,frameHorizontal,frameVertical);

        //MAKING CHANGE THE COLOR OF THE SKY
        FillTransition changeSky = new FillTransition(Duration.seconds(3),background,Color.DARKBLUE,Color.SKYBLUE);
        changeSky.setCycleCount(Animation.INDEFINITE);
        changeSky.setDelay(Duration.seconds(1.5));
        changeSky.setAutoReverse(true);
        changeSky.play();

        //OF THE GRASS
        FillTransition changeGrass = new FillTransition(Duration.seconds(3),ground,Color.DARKGREEN,Color.LAWNGREEN);
        changeGrass.setCycleCount(Animation.INDEFINITE);
        changeGrass.setDelay(Duration.seconds(1.5));
        changeGrass.setAutoReverse(true);
        changeGrass.play();

        //OF THE LIGHT IN THE WINDOW
        FillTransition changeWindow = new FillTransition(Duration.seconds(3),window,Color.YELLOW,Color.LIGHTGRAY);
        changeWindow.setCycleCount(Animation.INDEFINITE);
        changeWindow.setDelay(Duration.seconds(1.5));
        changeWindow.setAutoReverse(true);
        changeWindow.play();

        //Creating a scene object
        scene = new Scene(root, 690, 500);


        //Setting title to the Stage
        stage.setTitle("Circle object translate transition example");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
        stage.setResizable(false);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
