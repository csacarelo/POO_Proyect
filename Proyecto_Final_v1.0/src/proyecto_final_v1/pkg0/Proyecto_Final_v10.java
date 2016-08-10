/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Christian
 */
public class Proyecto_Final_v10 extends Application {
    
    public static Scene scene;
    public static Stage stage;
    @Override
    public void start(Stage stage) {
        this.stage=stage;
        PaneOrganizer2 organizer = new PaneOrganizer2();
        scene = new Scene(organizer.getRoot(),1000,800);
        stage.setScene(scene);
        stage.setTitle("Proyecto Segundo Parcial");
        stage.show();
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArchTop a=new ArchTop();
        System.out.println(a.conseguirLos10Primeros()[0]);
        //System.out.println(a.conseguirPalabraAleatoria());
        a.guardarPuntajes("Jose", 600);
        System.out.println(a.conseguirLos10Primeros()[0]);
        launch(args);

    }
    
}
