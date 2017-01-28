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
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Küsi kasutajalt alguskordinaadid ja laius-kõrgus ning joonista talle ristkülik.
 * Küsi kasutajalt sisendit kuidas soovid, pealselt, et teed seda JavaFXis.
 */
public class Ristkulik extends Application{
    int aX = 0;
    int aY = 0;
    int laius = 0;
    int k6rgus = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();

        Pane kujund = new Pane();
        kujund.setMinSize(500,500);

        Label pealkiri = new Label("Vali joonele alg- ja lõppväärtused");
        Label paX = new Label("Alguspunkti X-koordinaat");
        Label paY = new Label("Alguspunkti Y-koordinaat");
        Label plaius = new Label("Laius");
        Label pk6rgus = new Label("Kõrgus");
        Slider algX = new Slider(0,500,0);
        algX.setShowTickLabels(true);
        algX.valueProperty().addListener((observable, vanaVaartus, uusVaartus) ->
                aX = algX.valueProperty().intValue());
        Slider algY = new Slider(0,500,0);
        algY.setShowTickLabels(true);
        algY.valueProperty().addListener((observable, vanaVaartus, uusVaartus) ->
                aY = algY.valueProperty().intValue());
        Slider slaius = new Slider(0,250,0);
        slaius.setShowTickLabels(true);
        slaius.valueProperty().addListener((observable, vanaVaartus, uusVaartus) ->
                laius = slaius.valueProperty().intValue());
        Slider sk6rgus = new Slider(0,250,0);
        sk6rgus.setShowTickLabels(true);
        sk6rgus.valueProperty().addListener((observable, vanaVaartus, uusVaartus) ->
                k6rgus = sk6rgus.valueProperty().intValue());
        Button joonista = new Button("Joonista!");
        joonista.setOnAction((event) -> {
            Rectangle ristkylik = new Rectangle(aX,aY, laius,k6rgus);
            ristkylik.setStroke(Color.rgb((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
            ristkylik.setFill(Color.TRANSPARENT);
            kujund.getChildren().add(ristkylik);
        });
        VBox v22rtused = new VBox();
        v22rtused.setMinSize(500,500);
        v22rtused.getChildren().addAll(pealkiri,paX,algX,paY,algY,plaius,slaius,pk6rgus,sk6rgus,joonista);
        HBox ekraan = new HBox(v22rtused,kujund);
        Scene stseen = new Scene(ekraan);
        primaryStage.setScene(stseen);
    }

}
