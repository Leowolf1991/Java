package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    Stage window;
    float aqua_after =0;
    float aqua_before =0;
    String buffer1;
    String buffer2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Расчёт потери мата");
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(12);

        Label aquabalance_after = new Label("Аквабаланс после последнего полива: ");
        GridPane.setConstraints(aquabalance_after,0, 0);

        TextField input_first_weight = new TextField("Введите вес");
        GridPane.setConstraints(input_first_weight,1 , 0);

        Label aquabalance_before = new Label("Аквабаланс до первого полива: ");
        GridPane.setConstraints(aquabalance_before, 0 ,1);

        TextField input_second_weight = new TextField("Введите вес");
        GridPane.setConstraints(input_second_weight, 1,1);

        Label lbResult = new Label("Результат");
        GridPane.setConstraints(lbResult,1 ,2);

        Button btnCalc = new Button("Расчитать потерю веса");
        GridPane.setConstraints(btnCalc,1,3);

        gridPane.getChildren().addAll(aquabalance_after,aquabalance_before,input_first_weight,input_second_weight,btnCalc,lbResult);

        Scene scene = new Scene(gridPane, 600, 300);
        window.setScene(scene);

        btnCalc.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                buffer1 = input_first_weight.getText();
                buffer2 = input_second_weight.getText();
                aqua_after = Float.parseFloat(buffer1);
                aqua_before = Float.parseFloat(buffer2);
                float result = 100-((aqua_before/aqua_after)*100);
                lbResult.setText("Потеря веса мата составила: "+ String.format("%.2f",result) + "%");
            }
        });
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}