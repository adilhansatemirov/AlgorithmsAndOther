package Week7;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;



public class Pacman extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        //IMAGE OF PACMAN
        ImageView pacmanImage = new ImageView(new Image(getClass().getResourceAsStream("pacman.gif")));
        pacmanImage.setFitWidth(75);
        pacmanImage.setFitHeight(75);

        //PACMAN BUTTON
        Button pacman = new Button();
        pacman.setMinSize(1,1);
        pacman.setMaxSize(1,1);
        pacman.relocate(110,450);

        //IMAGE OF OCTOPUS
        ImageView octopus = new ImageView(new Image(getClass().getResourceAsStream("octopus.gif")));
        octopus.setFitHeight(50);
        octopus.setFitWidth(50);
        octopus.relocate(90,325);

        //ROTATION PACMAN
        Rotate rotatePacman = new Rotate();
        rotatePacman.setAngle(-90);
        pacman.getTransforms().add(rotatePacman);

        //ROTATION OCTOPUS
        Rotate rotateOctopus = new Rotate();
        rotateOctopus.setAngle(-90);
        octopus.getTransforms().add(rotateOctopus);

        //ADDING IMAGE OF PACMAN TO THE BUTTON OF PACMAN
        pacman.setGraphic(pacmanImage);

        //CREATING A PATH
        Path path = new Path();
        path.getElements().add(new MoveTo(110,250));
        path.getElements().add(new CubicCurveTo(120,50,325,50,340,250));
        path.getElements().add(new CubicCurveTo(345,500,600,500,590,250));
        path.getElements().add(new CubicCurveTo(600,50,345,50,340,250));
        path.getElements().add(new CubicCurveTo(325,500,120,500,110,250));
        path.setOpacity(0.0);

        //MOVE PACMAN TO THE PLACE WHERE PATH TRANSITION STARTS
        TranslateTransition translatePacman = new TranslateTransition();
        translatePacman.setDuration(Duration.seconds(1.5));
        translatePacman.setToX(0);
        translatePacman.setToY(-200);
        translatePacman.setNode(pacman);
        translatePacman.setInterpolator(Interpolator.LINEAR);
        //he will be late for 1 second

        //MOVE OCTOPUS TO THE PLACE WHERE PATH TRANSITION STARTS
        TranslateTransition translateOctopus = new TranslateTransition();
        translateOctopus.setDuration(Duration.seconds(0.3));
        translateOctopus.setToX(0);
        translateOctopus.setToY(-45);
        translateOctopus.setInterpolator(Interpolator.LINEAR);
        translateOctopus.setNode(octopus);

        //INFINITE TRANSITION FOR PACMAN
        PathTransition transitionPacman = new PathTransition();
        transitionPacman.setDuration(Duration.seconds(13));
        transitionPacman.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transitionPacman.setPath(path);
        transitionPacman.setNode(pacman);
        transitionPacman.setInterpolator(Interpolator.LINEAR);
        transitionPacman.setCycleCount(Animation.INDEFINITE);

        //INFINITE TRANSITION FOR OCTOPUS
        PathTransition transitionOctopus = new PathTransition();
        transitionOctopus.setDuration(Duration.seconds(13));
        transitionOctopus.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transitionOctopus.setNode(octopus);
        transitionOctopus.setPath(path);
        transitionOctopus.setInterpolator(Interpolator.LINEAR);
        transitionOctopus.setCycleCount(Animation.INDEFINITE);

        //WHEN PACMAN CLICKED RUN OCTOPUS, 1 SECOND LATE RUN PACMAN
        pacman.setOnAction(e -> {
            translatePacman.play();
            translateOctopus.play();

        });

        //WHEN OCTOPUS IN THE PLACE, INFINITE TRANSITION ACTIVATES
        translateOctopus.setOnFinished(e-> {
            rotateOctopus.setAngle(0);
            octopus.relocate(0,0);
            transitionOctopus.play();
        });

        //THE SAME THING FOR PACMAN
        translatePacman.setOnFinished(e->{
            rotatePacman.setAngle(0);
            pacman.relocate(0,0);
            transitionPacman.play();
        });


        //OBJECTS WE NEED
        Group root = new Group(octopus,pacman,path);

        Scene scene = new Scene(root, 690, 500, Color.BLACK);
        stage.setTitle("LABTASK ON TRANSITIONS");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
