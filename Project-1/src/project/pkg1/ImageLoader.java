/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg1;

import javafx.scene.image.Image;

/**
 *
 * @author GAEDC
 */
public class ImageLoader {

    private static Image rocket = new Image("/Images/booster2-sheet0.png");
    public static Image sky_bg = new Image("/Images/sky-sheet0.png");
    public static Image cloud_img = new Image("/Images/flame-sheet1.png");
    private static final Image rever_img = new Image("/Images/tiledbackground2.png");
    private static Image launcher_img = new Image("/Images/factoryback-sheet0.png");
    private static final Image flem = new Image("/Images/Ресурс12-sheet0_1.png");
     private static final Image flem2 = new Image("/Images/flame-sheet0 (2).png");

    public static Image getSky_bg() {
        return sky_bg;
    }

    public static Image getCloud_img() {
        return cloud_img;
    }

    public static Image getRocket() {
        return rocket;
    }

    public static Image getRever_img() {
        return rever_img;
    }

    public static Image getLauncher_img() {
        return launcher_img;
    }

    public static Image getFlem() {
        return flem;
    }

    public static Image getFlem2() {
        return flem2;
    }

}
