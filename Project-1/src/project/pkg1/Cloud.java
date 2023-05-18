/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

import java.util.Random;
import javafx.util.Duration;

/**
 *
 * @author GAEDC
 */
public class Cloud {

    double height;
    double x;
    double y;
    double timeTrack;
    double duration;
    Random random;

    public Cloud(double x, double y, double height, Duration duration) {
        this.x = x;
        this.y = y;
        this.timeTrack = timeTrack;
        this.duration = duration.toSeconds();
        random = new Random();
        this.height = height;
    }

    public void update() {

        timeTrack += 0.016;

        if (timeTrack <= duration) {
            return;
        }

        if (y >= height) {
            y = -30;
        }
        y += random.nextInt(10);
    }

}
