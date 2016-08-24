package proyecto_final_v1.pkg0;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 *
 * @author Christian, Tatiana, Gabriel
 * @version 1.0 05 de Agosto de 2016
 */

public class Proyecto_Final_v10 extends Application {
    
    public static Scene scene;
    public static Stage stage;
    
    
    /**
    * Metodo start void que sirve para llamar a nuestra clase PaneOrgnizer2
    * y mostrar la ventana respectiva de acuerdo al boton que presione el jugador.
    * @param stage Stage que es el la pantalla que llenamos con el Paneorganizer2.
    */
    @Override
    public void start(Stage stage) {
        this.stage=stage;
        PaneOrganizer2 organizer = new PaneOrganizer2();
     
        stage.setTitle("Proyecto Segundo Parcial");
        stage.show();
        }

    
    /**
    * Metodo estatico main void donde hemos puesto que empiece a sonar una musica
    * para que le de animos al juegador de probar TyperShark.
    * @param args the command line arguments
     */
    public static void main(String[] args) {
    String uriString = new File("Firework.mp3").toURI().toString();
    MediaPlayer player = new MediaPlayer( new Media(uriString));
     player.play();  
        launch(args);

    }
}
