package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Joonista ekraanile hunnik ristkülikuid, suvalistel positsioonidel. Ühe korra kastile klikates
 * muutub ta 2x väiksemaks. Teist korda klikates kaob ta sootuks.
 */
public class PixelChaser extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();

        Pane kujund = new Pane();
        Scene stseen = new Scene(kujund, 500, 500);
        primaryStage.setScene(stseen);

        ArrayList<Rectangle> list = new ArrayList<>();   //ristkylikute moodustamine
        for (int i = 0; i < 20; i++) {
            Rectangle rectangle = new Rectangle(Math.random()*450,Math.random()*450, 100, 100);
            kujund.getChildren().add(rectangle);
            list.add(rectangle);
        }
        for (int i = 0; i <list.size() ; i++) {
            Rectangle changeSize = list.get(i);
            changeSize.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2) {
                    changeSize.setVisible(false);
                    System.out.println("double clicked");
                }
                changeSize.setHeight(50);
                changeSize.setWidth(50);
            });
        }
    }

}
