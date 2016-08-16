/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

/**
 *
 * @author Tatiana
 */
import static java.awt.Color.orange;
import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import static javafx.scene.text.FontWeight.BOLD;

/**
 *
 * @author Tatiana
 */
public class PaneOrganizer2 {
    public static Pane _root;
    private Pane im;
    private Pane _principal;
    private ImageView fondo;
    private Pane _bu;
    private Pane _white;
    private Pane _black;
    private Pane _pira;
    private ImageView im2;
    private Pane _im;
    private TextField Nombres;
 public PaneOrganizer2(){
     
        this.ventanaPRINCIPAL();
   
    }
    
    public Pane getRoot() {
		return _root;
	}

     private class ClickHandler1 implements EventHandler<ActionEvent> {
         
           @Override
           public void handle(ActionEvent event){
               ventanaJUEGO ();
            
           }
     }
     private class ClickHandler2 implements EventHandler<ActionEvent> {
         
           @Override
           public void handle(ActionEvent event){
               ventanaTOP10();
             
           }       
     }
     
    private class ClickHandler3 implements EventHandler<ActionEvent> {
         
           @Override
           public void handle(ActionEvent event){
               ventanaINSTRUCCIONES();
           }       
     }
    
    private class ClickHandler4 implements EventHandler<ActionEvent> {
         
           @Override
           public void handle(ActionEvent event){
               Platform.exit();
               System.exit(0);  
           }       
     }
    
    private class ClickHandler5 implements EventHandler<ActionEvent> {

    
           @Override
           public void handle(ActionEvent event){
                ventanaPRINCIPAL();
    
           }       
     }
    
    private class ClickHandler6 implements EventHandler<ActionEvent> {

           @Override
           public void handle(ActionEvent event){
               ArchTop arch=new ArchTop();
               arch.guardarPuntajes(Nombres.getText(), Juego.puntaje);
                ventanaPRINCIPAL();
    
           }       
     }
     public void ventanaJUEGO (){
         Juego j=new Juego();
         j.Jugar(); 
         
         //this.ventanaPRINCIPAL();
        
    }
    
    public void ventanaPRINCIPAL(){
        
        _root = new Pane();
        im = new Pane();
        
        Image image = new Image("file:fondo.jpg");
         fondo = new ImageView();
         fondo.setImage(image);
         fondo.setFitWidth(1000);
         fondo.setFitHeight(800);
         
        
         Button btn1 = new Button("Jugar");
         btn1.setLayoutX(470);
         btn1.setLayoutY(440);
         Button btn2 = new Button("TOP 10");
         btn2.setLayoutX(300);
         btn2.setLayoutY(490);
         Button btn3 = new Button("Instrucciones");
         btn3.setLayoutX(430);
         btn3.setLayoutY(490);
         Button btn4 = new Button("Salir");
         btn4.setLayoutX(630);
         btn4.setLayoutY(490);
         btn1.setOnAction(new ClickHandler1());
         btn2.setOnAction(new ClickHandler2());
         btn3.setOnAction(new ClickHandler3());
         btn4.setOnAction(new ClickHandler4());
         Label titulo = new Label("TyperShark ");
         titulo.setLayoutX(290);
         titulo.setLayoutY(10);
         Label integrantes = new Label(" Elaborado por:\n                        *Christian Sacarelo \n                        *Tatiana Sanchez \n"
                                       + "                        *Gabriel Arauz");
         integrantes.setLayoutX(430);
         integrantes.setLayoutY(730);
         Label proyecto = new Label("PROGRAMACION ORIENTADA A OBJETOS \n           Proyecto de Segunda Evaluacion \n               "
                                    + "Profesor: Orlando Zambrano\n                          2016 I TERMINO ");
         proyecto.setLayoutX(30);
         proyecto.setLayoutY(730);
         im.getChildren().add(fondo);
         
         
         _root.getChildren().addAll(im,titulo,btn1,btn2,btn3,btn4,integrantes,proyecto);
        
        integrantes.setFont(Font.font(null,FontWeight.NORMAL,12));
        titulo.setContentDisplay(ContentDisplay.CENTER);
        titulo.setFont(Font.font(null, FontWeight.BOLD, 80));
        btn1.setFont(Font.font(null, FontWeight.BOLD, 25));
        btn2.setFont(Font.font(null, FontWeight.BOLD, 25));
        btn3.setFont(Font.font(null, FontWeight.BOLD, 25));
        btn4.setFont(Font.font(null, FontWeight.BOLD, 25));
        integrantes.setFont(Font.font(null, FontWeight.BOLD, 12));
        integrantes.setTextFill(Color.LIGHTSKYBLUE);
        proyecto.setFont(Font.font(null, FontWeight.BOLD, 12));
        proyecto.setTextFill(Color.LIGHTSKYBLUE);
        actualizarVentana(); 
   
    }
    
    public void ventanaTOP10 (){
        _root = new Pane();
        im = new Pane();
        ArchTop arch=new ArchTop();
        String TopNom[]=arch.conseguirLos10PrimerosNombres();
        String TopPunta[]=arch.conseguirLos10PirmerosPuntajes();
        
        Image image = new Image("file:fondo.jpg");
         fondo = new ImageView();
         fondo.setImage(image);
         fondo.setFitWidth(1000);
         fondo.setFitHeight(800);
         
         Button btn3 = new Button("Regresar");
         btn3.setLayoutX(770);
         btn3.setLayoutY(690);
         Button btn4 = new Button("Salir");
         btn4.setLayoutX(890);
         btn4.setLayoutY(690);
         
         btn3.setOnAction(new ClickHandler5());
         btn4.setOnAction(new ClickHandler4());
         Label titulo = new Label("TyperShark ");
         titulo.setLayoutX(290);
         titulo.setLayoutY(10);
         Label integrantes = new Label(" Elaborado por:\n                        *Christian Sacarelo \n                        *Tatiana Sanchez \n"
                                       + "                        *Gabriel Arauz");
         integrantes.setLayoutX(430);
         integrantes.setLayoutY(730);
         Label proyecto = new Label("PROGRAMACION ORIENTADA A OBJETOS \n           Proyecto de Segunda Evaluacion \n               "
                                    + "Profesor: Orlando Zambrano\n                          2016 I TERMINO ");
         proyecto.setLayoutX(30);
         proyecto.setLayoutY(730);
         
         Label jugador = new Label ("JUGADOR");
         jugador.setLayoutX(290);
         jugador.setLayoutY(210);
         Label punt = new Label ("PUNTAJE");
         punt.setLayoutX(540);
         punt.setLayoutY(210);
         
         Label nombres = new Label ((TopNom[0]+"\n"+TopNom[1]+"\n"+TopNom[2]+"\n"+TopNom[3]+"\n"+TopNom[4]+"\n"
                                   +TopNom[5]+"\n"+TopNom[6]+"\n"+TopNom[7]+"\n"+TopNom[8]+"\n"+TopNom[9]+"\n"));
         nombres.setLayoutX(320);
         nombres.setLayoutY(260);
        
         Label puntajes = new Label ((TopPunta[0]+"\n"+TopPunta[1]+"\n"+TopPunta[2]+"\n"+TopPunta[3]+"\n"+TopPunta[4]+"\n"
                                     +TopPunta[5]+"\n"+TopPunta[6]+"\n"+TopPunta[7]+"\n"+TopPunta[8]+"\n"+TopPunta[9]+"\n"));
        puntajes.setLayoutX(600);
        puntajes.setLayoutY(260);
        
         im.getChildren().add(fondo);
         
         _root.getChildren().addAll(im,titulo,btn3,btn4,integrantes,proyecto,jugador,punt,nombres,puntajes);
        
        integrantes.setFont(Font.font(null,FontWeight.NORMAL,12));
        titulo.setContentDisplay(ContentDisplay.CENTER);
        titulo.setFont(Font.font(null, FontWeight.BOLD, 80));
        btn3.setFont(Font.font(null, FontWeight.BOLD, 20));
        btn4.setFont(Font.font(null, FontWeight.BOLD, 20));
        integrantes.setFont(Font.font(null, FontWeight.BOLD, 12));
        integrantes.setTextFill(Color.LIGHTSKYBLUE);
        proyecto.setFont(Font.font(null, FontWeight.BOLD, 12));
        proyecto.setTextFill(Color.LIGHTSKYBLUE);
        jugador.setFont(Font.font(null, FontWeight.BOLD, 38));
        jugador.setTextFill(Color.LIGHTSALMON);
        punt.setFont(Font.font(null, FontWeight.BOLD, 38));
        punt.setTextFill(Color.LIGHTSALMON);
        nombres.setFont(Font.font(null, FontWeight.BOLD, 28));
        nombres.setTextFill(Color.WHITE);
        puntajes.setFont(Font.font(null, FontWeight.BOLD, 28));
        puntajes.setTextFill(Color.WHITE);
        
        actualizarVentana();
      
    }
    
    public void ventanaINSTRUCCIONES (){
        _root = new Pane();
        im = new Pane();
        
        Image image = new Image("file:fondo.jpg");
         fondo = new ImageView();
         fondo.setImage(image);
         fondo.setFitWidth(1000);
         fondo.setFitHeight(800);
         
         Button btn3 = new Button("Regresar");
         btn3.setLayoutX(770);
         btn3.setLayoutY(690);
         Button btn4 = new Button("Salir");
         btn4.setLayoutX(890);
         btn4.setLayoutY(690);
         
         btn3.setOnAction(new ClickHandler5());
         btn4.setOnAction(new ClickHandler4());
         Label titulo = new Label("TyperShark ");
         titulo.setLayoutX(290);
         titulo.setLayoutY(10);
       Label integrantes = new Label(" Elaborado por:\n                        *Christian Sacarelo \n                        *Tatiana Sanchez \n"
                                       + "                        *Gabriel Arauz");
         integrantes.setLayoutX(430);
         integrantes.setLayoutY(730);
         Label proyecto = new Label("PROGRAMACION ORIENTADA A OBJETOS \n           Proyecto de Segunda Evaluacion \n               "
                                    + "Profesor: Orlando Zambrano\n                          2016 I TERMINO ");
         proyecto.setLayoutX(30);
         proyecto.setLayoutY(730);
         Label instrucciones = new Label("INSTRUCCIONES DEL JUEGO");
         instrucciones.setLayoutX(290);
         instrucciones.setLayoutY(120);
         Label inst = new Label("*El juego TyperShark permite al usiario entrenar su habilidad en el uso del teclado y mejorar su rapidez en el mismo.\n"
                              + "*Consiste en proteger a un buceador de los animales marinos, mientras va descendiendo hasta el fondo del mar.\n"
                              + "*Esto se logra tipeando las mismas palabras que cada animal marino contiene. Existen tres tipos de animales marinos:\n"
                              + "        Tiburon blanco:\n"
                              + "            -Contiene Palabras.\n"
                              + "            -Desparece cuando se ha tipeado todas las letras de su palabra.\n"
                              + "            -Si toca al buceador, este pierde una vida.\n"
                              + "        Tiburon negro:\n"
                              + "            -Contiene Palabras.\n"
                              + "            -Desparece cuando se ha tipeado todas las palabras.\n"
                              + "            -Cuando se ha tipeado toda la palabra, aparece una nueva, en este caso un tiburon negro tiene dos palabras.\n"
                              + "        Piraña:\n"
                              + "            -Contiene un caracter.\n" 
                              + "            -Desparece cuando se ha tipeado su letra.\n" 
                              + "            -Avanza mas rapidamente que un tiburon.\n"
                              + "            -Se requiere que mas de tres pirañas toquen a un buceador para que este pierda una vida.\n"
                              + "*El buceador acumula puntos por cada animal que desaparece:\n"
                              + "        Piraña equivale a 10 puntos.\n"
                              + "        Tiburon blanco equivale a 20 puntos.\n"
                              + "        Tiburon negro equivale a 30 puntos.\n"
                              + "*Inicialmente el buceador dispone de tres vidas, pero puede ganar vidas extra por cada 100 puntos acumulados.\n"
                              + "*Con 150 puntos, el buceador puede eliminar todos los animales marinos en la cercania solo presionando la tecla ENTER.\n"
                              + "*A medica que acumula puntaje, el jugador va avanzando a un siguiente nivel, donde los animales aumentan su rapidez.\n"
                              + "*El juego termina cuando el buceador pierde todas sus vidas.");
         inst.setLayoutX(15);
         inst.setLayoutY(155);
         im.getChildren().add(fondo);
         
         
         _root.getChildren().addAll(im,titulo,btn3,btn4,integrantes,proyecto,instrucciones,inst);
        
        integrantes.setFont(Font.font(null,FontWeight.NORMAL,12));
        titulo.setContentDisplay(ContentDisplay.CENTER);
        titulo.setFont(Font.font(null, FontWeight.BOLD, 80));
        btn3.setFont(Font.font(null, FontWeight.BOLD, 20));
        btn4.setFont(Font.font(null, FontWeight.BOLD, 20));
        integrantes.setFont(Font.font(null, FontWeight.BOLD, 12));
        integrantes.setTextFill(Color.LIGHTSKYBLUE);
        proyecto.setFont(Font.font(null, FontWeight.BOLD, 12));
        proyecto.setTextFill(Color.LIGHTSKYBLUE);
        instrucciones.setFont(Font.font(null, FontWeight.BOLD, 30));
        instrucciones.setTextFill(Color.LIGHTSALMON);
        inst.setFont(Font.font(null, FontWeight.BOLD, 17));
        inst.setTextFill(Color.WHITE);
        
        actualizarVentana();
        
    }
    
     public void ventanaFinDeJuego(){
        
        _root = new Pane();
        im = new Pane();
        Nombres = new TextField();
        
        Image image = new Image("file:fondo.jpg");
         fondo = new ImageView();
         fondo.setImage(image);
         fondo.setFitWidth(1000);
         fondo.setFitHeight(800);
         
        this.Nombres.setLayoutX(350);
        this.Nombres.setLayoutY(470);
        
        Nombres.setStyle(""
                          + "-fx-font-size: 30px;"
                          + "-fx-font-weight: bold;"
                          + "-fx-text-fill: black;"
                          + "-fx-background-color: white");
         
         Button btn1 = new Button("Guardar");
         btn1.setLayoutX(480);
         btn1.setLayoutY(620);
        
         btn1.setOnAction(new ClickHandler6());
         
         Label titulo = new Label("GAME OVER");
         titulo.setLayoutX(220);
         titulo.setLayoutY(30);
        
         Label nombre = new Label("Ingresa tu Nombre:");
         nombre.setLayoutX(350);
         nombre.setLayoutY(370);
        
         Label integrantes = new Label(" Elaborado por:\n                        *Christian Sacarelo \n                        *Tatiana Sanchez \n"
                                       + "                        *Gabriel Arauz");
         integrantes.setLayoutX(430);
         integrantes.setLayoutY(730);
         Label proyecto = new Label("PROGRAMACION ORIENTADA A OBJETOS \n           Proyecto de Segunda Evaluacion \n               "
                                    + "Profesor: Orlando Zambrano\n                          2016 I TERMINO ");
         proyecto.setLayoutX(30);
         proyecto.setLayoutY(730);
         im.getChildren().add(fondo);
         
         Label score = new Label("Score:");
         score.setLayoutX(390);
         score.setLayoutY(240);
         
         Label sc = new Label(Integer.toString(Juego.puntaje));
         sc.setLayoutX(530);
         sc.setLayoutY(240);
         
         _root.getChildren().addAll(im,titulo,btn1,integrantes,proyecto,score,nombre,this.Nombres,sc);
        
        titulo.setContentDisplay(ContentDisplay.CENTER);
        titulo.setFont(Font.font(null, FontWeight.BOLD, 100));
        titulo.setTextFill(Color.WHITE);
        
        btn1.setFont(Font.font(null, FontWeight.BOLD, 25));
        integrantes.setFont(Font.font(null, FontWeight.BOLD, 12));
        integrantes.setTextFill(Color.LIGHTSKYBLUE);
        proyecto.setFont(Font.font(null, FontWeight.BOLD, 12));
        proyecto.setTextFill(Color.LIGHTSKYBLUE);
        nombre.setFont(Font.font(null, FontWeight.BOLD, 40));
        nombre.setTextFill(Color.LIGHTSALMON); 
        score.setFont(Font.font(null, FontWeight.BOLD, 40));
        score.setTextFill(Color.LIGHTSALMON); 
        sc.setFont(Font.font(null, FontWeight.BOLD, 40));
        sc.setTextFill(Color.WHITE); 
       
        actualizarVentana(); 
        
    }
    public static void actualizarVentana()
    {
        Proyecto_Final_v10.scene=new Scene(_root,1000,800);
        Proyecto_Final_v10.stage.setScene(Proyecto_Final_v10.scene);
    }
            
            
           
    
}
