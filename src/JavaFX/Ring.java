package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt x, y kordinaadid ja raadius ning joonista talle ring.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ring extends Application {
    int aX = 0;
    int aY = 0;
    int rad = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();

        Pane kujund = new Pane();
        kujund.setMinSize(500,500);

        Label pealkiri = new Label("Vali ringile koordinaadid ja raadius!");
        Label pX = new Label("X-koordinaat");
        Label paY = new Label("Y-koordinaat");
        Label pR= new Label("Raadius");
        Slider algX = new Slider(0,500,0);
        algX.setShowTickLabels(true);
        algX.valueProperty().addListener((observable, vanaVaartus, uusVaartus) ->
                aX = algX.valueProperty().intValue());
        Slider algY = new Slider(0,500,0);
        algY.setShowTickLabels(true);
        algY.valueProperty().addListener((observable, vanaVaartus, uusVaartus) ->
                aY = algY.valueProperty().intValue());
        Slider raadius = new Slider(0,250,0);
        raadius.setShowTickLabels(true);
        raadius.valueProperty().addListener((observable, vanaVaartus, uusVaartus) ->
                rad = raadius.valueProperty().intValue());

        Button joonista = new Button("Joonista!");
        joonista.setOnAction((event) -> {
            Circle ring = new Circle(aX,aY,rad);
            ring.setStroke(Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
            ring.setFill(Color.TRANSPARENT);
            kujund.getChildren().add(ring);
        });
        VBox v22rtused = new VBox();
        v22rtused.setMinSize(500,500);
        v22rtused.getChildren().addAll(pealkiri,pX,algX,paY,algY,pR,raadius,joonista);
        HBox ekraan = new HBox(v22rtused,kujund);
        Scene stseen = new Scene(ekraan);
        primaryStage.setScene(stseen);
    }
}
