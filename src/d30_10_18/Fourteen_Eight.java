package d30_10_18;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.shuffle;

public class Fourteen_Eight extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(1, 1, 1, 1));
        ArrayList<Object> cards = new ArrayList<>();
        for(int i = 0; i<54;i++){
            cards.add(i,i+1);
        }
        shuffle(cards);
        int counter = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 9; j++) {
                pane.add(new ImageView(new Image("d30_10_18/image/" + cards.get(counter) + ".png")), j, i);
                counter++;
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("CheckerBoard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
