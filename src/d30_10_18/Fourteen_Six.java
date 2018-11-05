package d30_10_18;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class Fourteen_Six extends Application {

    Rectangle[][] board = new Rectangle[8][8];

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(1, 1, 1, 1));
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = new Rectangle(40, 40);
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        board[i][j].setFill(Color.WHITE);
                    } else {
                        board[i][j].setFill(Color.BLACK);
                    }
                } else {
                    if (j % 2 == 0) {
                        board[i][j].setFill(Color.BLACK);
                    } else {
                        board[i][j].setFill(Color.WHITE);
                    }
                }

                pane.add(board[i][j], i, j);


            }

        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("CheckerBoard");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
