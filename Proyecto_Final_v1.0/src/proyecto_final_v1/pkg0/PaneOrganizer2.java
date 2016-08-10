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
    private Pane _root;
    private Pane im;
    private Pane _principal;
    private ImageView fondo;
 

 public PaneOrganizer2(){
        _root = new Pane();
        im = new Pane();
        
        Image image = new Image("file:C:\\Users\\Tatiana\\Documents\\practicas de poo\\Pantallas\\fondo.jpg");
         fondo = new ImageView();
         fondo.setImage(image);
         fondo.setFitWidth(1000);
         fondo.setFitHeight(800);
         
        
         Button btn1 = new Button("Jugar");
         btn1.setLayoutX(470);
         btn1.setLayoutY(450);
         Button btn2 = new Button("TOP 10");
         btn2.setLayoutX(300);
         btn2.setLayoutY(510);
         Button btn3 = new Button("Instrucciones");
         btn3.setLayoutX(430);
         btn3.setLayoutY(510);
         Button btn4 = new Button("Salir");
         btn4.setLayoutX(630);
         btn4.setLayoutY(510);
         btn1.setOnAction(new ClickHandler1());
         btn2.setOnAction(new ClickHandler2());
         btn3.setOnAction(new ClickHandler3());
         btn4.setOnAction(new ClickHandler4());
         Label titulo = new Label("TyperShark ");
         titulo.setLayoutX(300);
         titulo.setLayoutY(20);
         Label integrantes = new Label(" Elaborado por:\n                        *Christian Sacarelo \n                        *Tatiana Sanchez \n                        *Gabriel Arauz");
         integrantes.setLayoutX(450);
         integrantes.setLayoutY(730);
         Label proyecto = new Label("PROGRAMACION ORIENTADA A OBJETOS \n           Proyecto de Segunda Evaluacion \n               Profesor: Orlando Zambrano\n                          2016 I TERMINO ");
         proyecto.setLayoutX(70);
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
   
        actualizarVentana();
        
    }
    
    public void ventanaPRINCIPAL(){
        _root = new Pane();
        im = new Pane();
        
        Image image = new Image("file:C:\\Users\\Tatiana\\Documents\\practicas de poo\\Pantallas\\fondo.jpg");
         fondo = new ImageView();
         fondo.setImage(image);
         fondo.setFitWidth(1000);
         fondo.setFitHeight(800);
         
        
         Button btn1 = new Button("Jugar");
         btn1.setLayoutX(470);
         btn1.setLayoutY(450);
         Button btn2 = new Button("TOP 10");
         btn2.setLayoutX(300);
         btn2.setLayoutY(510);
         Button btn3 = new Button("Instrucciones");
         btn3.setLayoutX(430);
         btn3.setLayoutY(510);
         Button btn4 = new Button("Salir");
         btn4.setLayoutX(630);
         btn4.setLayoutY(510);
         btn1.setOnAction(new ClickHandler1());
         btn2.setOnAction(new ClickHandler2());
         btn3.setOnAction(new ClickHandler3());
         btn4.setOnAction(new ClickHandler4());
         Label titulo = new Label("TyperShark ");
         titulo.setLayoutX(300);
         titulo.setLayoutY(20);
         Label integrantes = new Label(" Elaborado por:\n                        *Christian Sacarelo \n                        *Tatiana Sanchez \n                        *Gabriel Arauz");
         integrantes.setLayoutX(450);
         integrantes.setLayoutY(730);
         Label proyecto = new Label("PROGRAMACION ORIENTADA A OBJETOS \n           Proyecto de Segunda Evaluacion \n               Profesor: Orlando Zambrano\n                          2016 I TERMINO ");
         proyecto.setLayoutX(70);
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
        
        Image image = new Image("file:C:\\Users\\Tatiana\\Documents\\practicas de poo\\Pantallas\\fondo.jpg");
         fondo = new ImageView();
         fondo.setImage(image);
         fondo.setFitWidth(1000);
         fondo.setFitHeight(800);
         
         Button btn3 = new Button("Regresar");
         btn3.setLayoutX(770);
         btn3.setLayoutY(760);
         Button btn4 = new Button("Salir");
         btn4.setLayoutX(900);
         btn4.setLayoutY(760);
         
         btn3.setOnAction(new ClickHandler5());
         btn4.setOnAction(new ClickHandler4());
         Label titulo = new Label("TyperShark ");
         titulo.setLayoutX(300);
         titulo.setLayoutY(20);
         Label integrantes = new Label(" Elaborado por:\n                        *Christian Sacarelo \n                        *Tatiana Sanchez \n                        *Gabriel Arauz");
         integrantes.setLayoutX(450);
         integrantes.setLayoutY(730);
         Label proyecto = new Label("PROGRAMACION ORIENTADA A OBJETOS \n           Proyecto de Segunda Evaluacion \n               Profesor: Orlando Zambrano\n                          2016 I TERMINO ");
         proyecto.setLayoutX(70);
         proyecto.setLayoutY(730);
         im.getChildren().add(fondo);
         
         _root.getChildren().addAll(im,titulo,btn3,btn4,integrantes,proyecto);
        
        integrantes.setFont(Font.font(null,FontWeight.NORMAL,12));
        titulo.setContentDisplay(ContentDisplay.CENTER);
        titulo.setFont(Font.font(null, FontWeight.BOLD, 80));
        btn3.setFont(Font.font(null, FontWeight.BOLD, 20));
        btn4.setFont(Font.font(null, FontWeight.BOLD, 20));
        integrantes.setFont(Font.font(null, FontWeight.BOLD, 12));
        integrantes.setTextFill(Color.LIGHTSKYBLUE);
        proyecto.setFont(Font.font(null, FontWeight.BOLD, 12));
        proyecto.setTextFill(Color.LIGHTSKYBLUE);
        actualizarVentana();
        
    }
    
    public void ventanaINSTRUCCIONES (){
        _root = new Pane();
        im = new Pane();
        
        Image image = new Image("file:C:\\Users\\Tatiana\\Documents\\practicas de poo\\Pantallas\\fondo.jpg");
         fondo = new ImageView();
         fondo.setImage(image);
         fondo.setFitWidth(1000);
         fondo.setFitHeight(800);
         
         Button btn3 = new Button("Regresar");
         btn3.setLayoutX(770);
         btn3.setLayoutY(760);
         Button btn4 = new Button("Salir");
         btn4.setLayoutX(900);
         btn4.setLayoutY(760);
         
         btn3.setOnAction(new ClickHandler5());
         btn4.setOnAction(new ClickHandler4());
         Label titulo = new Label("TyperShark ");
         titulo.setLayoutX(300);
         titulo.setLayoutY(20);
         Label integrantes = new Label(" Elaborado por:\n                        *Christian Sacarelo \n                        *Tatiana Sanchez \n                        *Gabriel Arauz");
         integrantes.setLayoutX(450);
         integrantes.setLayoutY(730);
         Label proyecto = new Label("PROGRAMACION ORIENTADA A OBJETOS \n           Proyecto de Segunda Evaluacion \n               Profesor: Orlando Zambrano\n                          2016 I TERMINO ");
         proyecto.setLayoutX(70);
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
    
    
    public void actualizarVentana()
    {
        Proyecto_Final_v10.scene=new Scene(_root,1000,800);
        Proyecto_Final_v10.stage.setScene(Proyecto_Final_v10.scene);
    }
            
            
           
    
}