package com.fuck.aaaa;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.*;

public class ExampleProgram extends Application {
    @Override
    public void start(Stage primaryStage){
        Pane thingo = new Pane();
        thingo.setBackground(Background.fill(Color.AQUA));
        thingo.setMinSize(100, 100);
        Scene scene = new Scene(thingo);
        primaryStage.setScene(scene);
    }
    public static void main(String[] args){
        launch(args);
    }
}
