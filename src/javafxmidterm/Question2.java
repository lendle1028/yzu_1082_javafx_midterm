/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxmidterm;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

/**
 *
 * @author lendle
 */
public class Question2 extends Application {
    private Polyline polyline=null;
    private Color color=Color.BLACK;
    @Override
    public void start(Stage primaryStage) {
        try {
            double stageWidth=1000;
            double stageHeight=800;
            BorderPane pane=new BorderPane();
            Pane root = new Pane();
            pane.setCenter(root);
            FlowPane controlPane=new FlowPane();
            pane.setBottom(controlPane);
            
            Button blackButton=new Button("black");
            Button blueButton=new Button("blue");
            Button redButton=new Button("red");
            
            controlPane.getChildren().addAll(blackButton, blueButton, redButton);
            blackButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    color=Color.BLACK;
                }
            });
            blueButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    color=Color.BLUE;
                }
            });
            redButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    color=Color.RED;
                }
            });
            
            Scene scene = new Scene(pane, stageWidth, stageHeight);
            primaryStage.setResizable(false);
            /**
             * (50%)
             * Use mouse dragged and mouse released event to create a painter application
             * 1. allow multiple lines
             * 2. use the color selected by user
             */
            
            
            primaryStage.setTitle("Hello World!");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception ex) {
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
