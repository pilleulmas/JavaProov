package JavaFX;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;

/**
 * Loo JavaFXis koristaja mäng.
 * 1. Ekraan (näiteks 500x500) on paksult ringe täis. Nii, et läbi ei näe.
 * 2. Ringile hiirega vastu minnes kaob ring ära.
 * 3. Ringide all on peidus sõnum (näiteks Labeliga), mida kasutaja lõpuks näeb.
 */

    public class Koristaja extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {

            primaryStage.show();

            Pane kujund = new Pane();
            Scene stseen = new Scene(kujund, 500, 500);
            primaryStage.setScene(stseen);
            Random rand=new Random();

            Label l = new Label("Keegi on su selja taga!");
            l.setTranslateX(rand.nextInt(400)+50);
            l.setTranslateY(rand.nextInt(400)+50);
            kujund.getChildren().add(l);

            ArrayList<Circle> list = new ArrayList<>();   //ringide moodustamine
            for (int i = 0; i < 200; i++) {
                Circle joonistanRingi = new Circle(Math.random() * 100);
                joonistanRingi.setTranslateX(Math.random()*500);
                joonistanRingi.setTranslateY(Math.random()*500);
                kujund.getChildren().add(joonistanRingi);
                list.add( joonistanRingi);
            }
            for (int i = 0; i <list.size() ; i++) {
                Circle tsekinRingi = list.get(i);
                tsekinRingi.setOnMouseEntered(event -> {
                    tsekinRingi.setVisible(false);
                });
            }
        }
    }



