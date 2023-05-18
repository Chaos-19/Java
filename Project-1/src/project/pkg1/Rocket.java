/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

import java.util.Random;
import javafx.scene.canvas.GraphicsContext;
import javafx.util.Duration;

/**
 *
 * @author GAEDC
 */
public class Rocket {
    
    
        double x;
        double y;
        double time;
        double duration;
        boolean isMoving = true;
        Random random;

        public Rocket(double x, double y, Duration duration) {
            this.x = x;
            this.y = y;
            this.duration = duration.toSeconds();
            random= new Random();
        
         
        }

        void onUpdate() {
            time += 0.016;

            if (time < duration) {
                System.out.println("|||||||||||||||||||||");
                return;
                
            }
            if (isMoving) {
                y -= random.nextInt(5);
            }
            if (y <= -60) {
                y = 230;
            }
        }

    
}
