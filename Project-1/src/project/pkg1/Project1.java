/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author GAEDC
 */
public class Project1 extends Application {
ContentLoader load;
    @Override
    public void start(Stage primaryStage) {
        load= new ContentLoader(1070,650);
        primaryStage.setTitle("Trial - 1");
        primaryStage.setScene(new Scene(load.creatContent()));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
