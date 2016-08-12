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

 public PaneOrganizer2(){
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
         
       
        this._principal=_root;
     
   
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
     public void ventanaJUEGO (){
         Juego j=new Juego();
         //j.jugar();
         /*_root = new Pane();
        _bu = new Pane();
        _white = new Pane();
        _black = new Pane();
        _pira = new Pane();
        
        
         Image image = new Image("file:oce.png");
        im2 = new ImageView();
        im2.setImage(image);
        im2.setFitWidth(1000);
        im2.setFitHeight(800);
        
        
        Buceador b = new Buceador();
        sharkWhite w = new sharkWhite();
        sharkBlack k = new sharkBlack();
        piranha p = new piranha();
        
        _bu.getChildren().add(b.getBu());
        _white.getChildren().addAll(w.getIm(),w.getIm2(),w.getWord());
        _black.getChildren().addAll(k.getIm(),k.getIm2(),k.getWord());
        _pira.getChildren().addAll(p.getIm(),p.getIm2(),p.getWord());
        _im = new Pane();
        _im.getChildren().add(im2);
       
        actualizarVentana();
        Button btn4 = new Button("Salir");
        btn4.setLayoutX(890);
        btn4.setLayoutY(690);
        btn4.setFont(Font.font(null, FontWeight.BOLD, 25));
        _root.getChildren().addAll(_bu,_white,_black,_pira,btn4);
        btn4.setOnAction(new ClickHandler4());*/
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
         Label instrucciones = new Label("INSTRUCCIONES DEL JUEGO:\n   ");
         instrucciones.setLayoutX(50);
         instrucciones.setLayoutY(130);
         im.getChildren().add(fondo);
         
         _root.getChildren().addAll(im,titulo,btn3,btn4,integrantes,proyecto,instrucciones);
        
        integrantes.setFont(Font.font(null,FontWeight.NORMAL,12));
        titulo.setContentDisplay(ContentDisplay.CENTER);
        titulo.setFont(Font.font(null, FontWeight.BOLD, 80));
        btn3.setFont(Font.font(null, FontWeight.BOLD, 20));
        btn4.setFont(Font.font(null, FontWeight.BOLD, 20));
        integrantes.setFont(Font.font(null, FontWeight.BOLD, 12));
        integrantes.setTextFill(Color.LIGHTSKYBLUE);
        proyecto.setFont(Font.font(null, FontWeight.BOLD, 12));
        proyecto.setTextFill(Color.LIGHTSKYBLUE);
        instrucciones.setFont(Font.font(null, FontWeight.BOLD, 15));
        instrucciones.setTextFill(Color.WHITE);
        actualizarVentana();
        
    }
    
    
    public static void actualizarVentana()
    {
        Proyecto_Final_v10.scene=new Scene(_root,1000,800);
        Proyecto_Final_v10.stage.setScene(Proyecto_Final_v10.scene);
    }
            
            
           
    
}
