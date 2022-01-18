import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        //HangmanGame.startGame();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hangman Game");

        // setting a vBOX Layout
        VBox box = new VBox();
        // setting up a scene with that layout
        Scene firstScene = new Scene(box,640,480);
        // put scene into this stage.
        primaryStage.setScene(firstScene);
        primaryStage.show();

    }
}
