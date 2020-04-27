/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmidterm;

import java.io.File;
import java.net.MalformedURLException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

/**
 *
 * @author lendle
 */
public class Question1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            double stageWidth=1000;
            double stageHeight=800;
            Group root = new Group();
            File file=new File("1526555840158p4r5o988np.jpg");
            Image image=new Image(file.toURI().toURL().toString());
            ImageView imageView=new ImageView(image);
            double fitWidth=500;
            double fitHeight=image.getHeight()*500/image.getWidth();
            
            imageView.setFitWidth(fitWidth);
            imageView.setPreserveRatio(true);
            imageView.setLayoutX(stageWidth/2-fitWidth/2);
            imageView.setLayoutY(stageHeight/2-fitHeight/2);
            
            /*
             * (50%)
             * Use the onScroll event to scale up/down the imageview.
             * 1. prevent the scroll factor from being negative
             * 2. keep the image in the center of the stage
             */
            
            root.getChildren().add(imageView);
            Scale scale=new Scale(1, 1);
            imageView.getTransforms().add(scale);
            
            Scene scene = new Scene(root, stageWidth, stageHeight);
            primaryStage.setResizable(false);
            
            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
