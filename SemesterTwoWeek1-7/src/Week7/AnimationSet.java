package Week7;

import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.LinkedList;
import java.util.Queue;

public class AnimationSet extends Application{
    @Override
    public void start(Stage stage) throws Exception {
//*************RADIO BUTTONS**************************************************************************************
        ToggleGroup group = new ToggleGroup();

        RadioButton rotationButton = new RadioButton("Rotation");
        rotationButton.setStyle("-fx-border-radius: 0px;");
        rotationButton.relocate(20,100);
        rotationButton.setToggleGroup(group);
        rotationButton.setSelected(true);

        RadioButton translationButton = new RadioButton("Translation");
        translationButton.relocate(20,227.8);
        translationButton.setToggleGroup(group);

        RadioButton scalingButton = new RadioButton("Scaling");
        scalingButton.relocate(20,350);
        scalingButton.setToggleGroup(group);

//***********COLOR BUTTONS****************************************************************************************
        Button green = new Button();
        green.relocate(630,50);
        green.setMinSize(50,70);
        green.setStyle("-fx-background-color: green;");

        Button blue = new Button();
        blue.relocate(630,150);
        blue.setMinSize(50,70);
        blue.setStyle("-fx-background-color: blue;");

        Button red = new Button();
        red.relocate(630,250);
        red.setMinSize(50,70);
        red.setStyle("-fx-background-color: red;");

        Button yellow = new Button();
        yellow.relocate(630,350);
        yellow.setMinSize(50,70);
        yellow.setStyle("-fx-background-color: yellow;");

//************LINES FOR LAYOUT************************************************************************************
        Rectangle lineLeft = new Rectangle(120,0,1,500);
        lineLeft.setOpacity(0.2);

        Rectangle lineRight = new Rectangle(600,0,1,500);
        lineRight.setOpacity(0.2);

//************PLAY BUTTON*****************************************************************************************
        Button play = new Button();
        play.relocate(350,430);
        play.setMinSize(0,0);
        play.setMaxSize(0,0);

        ImageView playImage = new ImageView(new Image(getClass().getResourceAsStream("play-button.png")));
        playImage.setFitHeight(70);
        playImage.setFitWidth(70);

        play.setGraphic(playImage);

        //RIGHT
        Button buttonSwitch = new Button();
        buttonSwitch.setMinSize(350,300);
        buttonSwitch.relocate(190,100);
        buttonSwitch.setStyle("-fx-background-color: transparent;");

//************SHAPES**********************************************************************************************
        Rectangle rectangle = new Rectangle(190,100,325,250);
        rectangle.setFill(Color.YELLOW);

        Circle circle = new Circle(350,220,130);
        circle.setFill(Color.YELLOW);

        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(350.0,90.0,470.0,350.0,230.0,350.0);
        triangle.setFill(Color.YELLOW);

        //QUEUE OF SHAPES
        Queue<Node> shapes = new LinkedList<>();
        //PUTTING EVERYTHING INSIDE
        shapes.offer(rectangle);
        shapes.offer(circle);
        shapes.offer(triangle);

        //DEACTIVATING EVERYTHING
        circle.setVisible(false);
        rectangle.setVisible(false);
        triangle.setVisible(false);

        //ACTIVATING THE FIRST ONE (RECTANGLE)
        shapes.peek().setVisible(true);

        //ON CLICKED
        buttonSwitch.setOnAction(e->{
            //turning of the first one (active rectangle)
            shapes.peek().setVisible(false);
            //putting it at the end
            shapes.offer(shapes.peek());
            //removing from beginning
            shapes.remove();
            //activate the next one
            shapes.peek().setVisible(true);
        });

//************TRANSITIONS*****************************************************************************************
        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.seconds(0.8));
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(1);
        rotateTransition.setAutoReverse(true);

        TranslateTransition translateTransition = new TranslateTransition();
        translateTransition.setDuration(Duration.seconds(0.3));
        translateTransition.setByY(-80);
        translateTransition.setCycleCount(2);
        translateTransition.setAutoReverse(true);

        ScaleTransition scaleTransition = new ScaleTransition();
        scaleTransition.setDuration(Duration.seconds(0.3));
        scaleTransition.setByX(1.0);
        scaleTransition.setByY(1.0);
        scaleTransition.setAutoReverse(true);
        scaleTransition.setCycleCount(2);

        Group root = new Group();
        //ADDING SHAPES TO THE GROUP
        root.getChildren().addAll(rotationButton,scalingButton,translationButton);
        root.getChildren().addAll(green,blue,red,yellow);
        root.getChildren().addAll(circle,rectangle,triangle);
        root.getChildren().addAll(buttonSwitch,play);
        root.getChildren().addAll(lineLeft,lineRight);
//************COLOR SETTINGS**************************************************************************************
        green.setOnAction(e->{
            triangle.setFill(Color.GREEN);
            rectangle.setFill(Color.GREEN);
            circle.setFill(Color.GREEN);
        });
        blue.setOnAction(e->{
            triangle.setFill(Color.BLUE);
            rectangle.setFill(Color.BLUE);
            circle.setFill(Color.BLUE);
        });
        yellow.setOnAction(e->{
            triangle.setFill(Color.YELLOW);
            rectangle.setFill(Color.YELLOW);
            circle.setFill(Color.YELLOW);
        });
        red.setOnAction(e->{
            triangle.setFill(Color.RED);
            rectangle.setFill(Color.RED);
            circle.setFill(Color.RED);
        });

        play.setOnAction(e->{
            rotateTransition.setNode(shapes.peek());
            translateTransition.setNode(shapes.peek());
            scaleTransition.setNode(shapes.peek());

            if(group.getSelectedToggle()==rotationButton){
                rotateTransition.play();
            }
            if(group.getSelectedToggle()==translationButton){
                translateTransition.play();
            }
            if(group.getSelectedToggle()==scalingButton){
                scaleTransition.play();
            }
        });

        Scene scene = new Scene(root, 700, 500);
        stage.setTitle("LABTASK ON TRANSITIONS");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
