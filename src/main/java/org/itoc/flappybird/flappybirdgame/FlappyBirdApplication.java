package org.itoc.flappybird.flappybirdgame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.io.IOException;

public class FlappyBirdApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        double canvasWidth = 600;
        double canvasHeight = 400;
        Color bgColor = new Color(169, 191, 255, 255);
        Canvas canvas = new Canvas(canvasWidth, canvasHeight);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(bgColor);
        gc.fillRect(0,0,canvasWidth,canvasHeight);
        Scene scene = new Scene(..., canvasWidth, canvasHeight);

        // Set stage properties
        stage.setTitle("Flappy Bird");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}