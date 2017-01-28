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
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguse ja lõpu x-y kordinaadid ning joonista talle joon.
 * Akna võime limiteerida 500x500 piksli peale.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Joon extends Application {
    int aX = 0;
    int aY = 0;
    int lX = 0;
    int lY = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();

        Pane kujund = new Pane();
        kujund.setMinSize(500,500);

        Label pealkiri = new Label("Vali joonele alg- ja lõppväärtused");
        Label paX = new Label("Alguspunkti X-koordinaat");
        Label paY = new Label("Alguspunkti Y-koordinaat");
        Label plX = new Label("Lõpp-punkti X-koordinaat");
        Label plY = new Label("Lõpp-punkti X-koordinaat");
        Slider algX = new Slider(0,500,0);
        algX.setShowTickLabels(true);
        algX.valueProperty().addListener((observable, vanaVaartus, uusVaartus) ->
            aX = algX.valueProperty().intValue());
        Slider algY = new Slider(0,500,0);
        algY.setShowTickLabels(true);
        algY.valueProperty().addListener((observable, vanaVaartus, uusVaartus) ->
            aY = algY.valueProperty().intValue());
        Slider loppX = new Slider(0,500,0);
        loppX.setShowTickLabels(true);
        loppX.valueProperty().addListener((observable, vanaVaartus, uusVaartus) ->
            lX = loppX.valueProperty().intValue());
        Slider loppY = new Slider(0,500,0);
        loppY.setShowTickLabels(true);
        loppY.valueProperty().addListener((observable, vanaVaartus, uusVaartus) ->
            lY = loppY.valueProperty().intValue());
        Button joonista = new Button("Joonista!");
        joonista.setOnAction((event) -> {
            Line joon = new Line(aX,aY,lX,lY);
            joon.setStroke(Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
            kujund.getChildren().add(joon);
        });
        VBox v22rtused = new VBox();
        v22rtused.setMinSize(500,500);
        v22rtused.getChildren().addAll(pealkiri,paX,algX,paY,algY,plX,loppX,plY,loppY,joonista);
        HBox ekraan = new HBox(v22rtused,kujund);
        Scene stseen = new Scene(ekraan);
        primaryStage.setScene(stseen);
    }

}
