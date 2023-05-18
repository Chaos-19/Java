/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

import java.util.Timer;
import javafx.animation.AnimationTimer;
import javafx.scene.Parent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

/**
 *
 * @author GAEDC
 */
public class ContentLoader {

    public Canvas canvas;
    public GraphicsContext gc;
    private final double width;
    final double height;
    LaunchSpace stage = new LaunchSpace();
    Rocket rocket;
    flame f;

    public ContentLoader(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Parent creatContent() {
        rocket = new Rocket(320, 250, Duration.millis(3));
        f = new flame(270, 400, Duration.millis(3));
        Pane root = new Pane();

        root.setPrefSize(width, height);

        canvas = new Canvas(width, height);
        gc = canvas.getGraphicsContext2D();

        root.getChildren().add(canvas);

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                gc.clearRect(0, 0, width, height);
                updateContent();
            }

        };
        timer.start();

        return root;
    }

    void updateContent() {
        gc.drawImage(ImageLoader.getRever_img(), 0, 330, 1070, height / 2);
        gc.drawImage(ImageLoader.getLauncher_img(), 0, 290, 1070, 670);
        rocket.onUpdate();
        gc.drawImage(ImageLoader.getRocket(), rocket.x, rocket.y, 200, 200);

        gc.setFill(Color.BLACK);
        f.onUpdate((rocket.y - 250));
        gc.drawImage(f.flame_img, f.x, f.y + (rocket.y - 250), 300, 200);

    }

}

class flame {

    double x;
    double y;
    double time;
    double duration;
    boolean chang;
    Image flame_img;

    public flame(double x, double y, Duration duration) {
        this.x = x;
        this.y = y;
        this.time = time;
        this.duration = duration.toSeconds();
        flame_img = ImageLoader.getCloud_img();
    }

    void onUpdate(double y) {
        this.time += 0.016;
        int count = 0;
        System.err.println("time : " + time + " dura  : " + duration);
        if (time >= duration + 5) {
            System.out.println("---------------------------------------");
            flame_img = ImageLoader.getFlem2();
            count++;
        }
        else if (count > 7) {
            flame_img = ImageLoader.getCloud_img();
            this.time=0;
        }

    }
}
