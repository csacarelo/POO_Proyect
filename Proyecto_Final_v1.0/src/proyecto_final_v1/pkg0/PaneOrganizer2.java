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
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import static javafx.scene.text.FontWeight.BOLD;

/**
 *
 * @author Tatiana
 */
public class PaneOrganizer2 {
    private BorderPane _root;
    private BorderPane _principal;
    private ImageView fondo;
    private Pane im;
    private Image ima;

    public PaneOrganizer2(){
        _root = new BorderPane();
        im = new Pane();
        Image image = new Image("file:C:\\Users\\Tatiana\\Documents\\Semestre actual\\Programacion Orientada a Objetos\\POO_Proyect\\Proyecto_Final_v1.0\\oce.png");
         fondo = new ImageView();
         fondo.setImage(image);
         fondo.setLayoutX(1000);
         fondo.setLayoutY(800);
         im.getChildren().add(fondo);
        
        
        Button botones[]=this.setupButtons();
        Label titulo = new Label("TyperShark \n \n \n \n \n");
        Label integrantes = new Label(" INTEGRANTES:\n*Christian Sacarelo \n*Tatiana Sanchez \n*Gabriel Arauz");
        integrantes.setFont(Font.font(null,FontWeight.NORMAL,12));
        titulo.setContentDisplay(ContentDisplay.CENTER);
        titulo.setFont(Font.font(null, FontWeight.BOLD, 50));
        GridPane centerPane=new GridPane();
         VBox topPane=new VBox();
         HBox bottomPane=new HBox();
         topPane.setAlignment(Pos.BOTTOM_CENTER);
         topPane.setMinHeight(100);
         centerPane.setMinHeight(100); 
       
         _root.setTop(topPane);
         _root.setCenter(centerPane);
         _root.setBottom(bottomPane);
         //.setCenter(centerPane2);
        _root.getChildren().addAll(im);
         
        topPane.getChildren().add(titulo);
        //centerPane.getChildren().addAll(botones[0]);
        //centerPane2.getChildren().addAll(botones[1],botones[2],botones[3]);
        
        setCenterPane1(centerPane);
        centerPane.setAlignment(Pos.TOP_CENTER);
        bottomPane.setAlignment(Pos.TOP_CENTER);
        bottomPane.getChildren().add(integrantes);
        topPane.setSpacing(30);

        this._principal=_root;
     
   
    }
    
    public void setCenterPane1(GridPane p)
        {
            p.setHgap(12);
            p.setVgap(21);
            Button btn1 =new Button("Jugar");
            p.add(btn1, 2,10); 
            Button btn2 = new Button("TOP 10");
            p.add(btn2, 1,11); 
            Button btn3 = new Button("Instrucciones");
            p.add(btn3, 2,11); 
            Button btn4 = new Button("Salir");
            p.add(btn4, 3,11); 
       
        }
    
    public Button[] setupButtons()
        {
            Button btn1 = new Button("Jugar");
            Button btn2 = new Button("TOP 10");
            Button btn3 = new Button("Instrucciones");
            Button btn4 = new Button("Salir");
            btn1.setOnAction(new ClickHandler1());
            btn2.setOnAction(new ClickHandler2());
            btn3.setOnAction(new ClickHandler3());
            btn4.setOnAction(new ClickHandler4());
            Button a[]={btn1, btn2, btn3, btn4};
            return a;
            
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
               
             
           }       
     }
     
    private class ClickHandler3 implements EventHandler<ActionEvent> {
         
           @Override
           public void handle(ActionEvent event){
             
           }       
     }
    
    private class ClickHandler4 implements EventHandler<ActionEvent> {
         
           @Override
           public void handle(ActionEvent event){
             
           }       
     }
    
    public void ventanaTOP10 (){
    
        
    }
    
    public void ventanaINSTRUCCIONES (){
        
        
    }
    
    public void ventanaJUEGO (){
        _root = new BorderPane();
        Button botones[]=this.setupButtons();
        Label titulo = new Label("Instrucciones \n \n \n");
        Label integrantes = new Label(" INTEGRANTES:\n*Christian Sacarelo \n*Tatiana Sanchez \n*Gabriel Arauz");
        integrantes.setFont(Font.font(null,FontWeight.NORMAL,12));
        titulo.setContentDisplay(ContentDisplay.CENTER);
        titulo.setFont(Font.font(null, FontWeight.BOLD, 50));
         VBox centerPane=new VBox();
         VBox topPane=new VBox();
         HBox bottomPane=new HBox();
         topPane.setAlignment(Pos.BOTTOM_CENTER);
         topPane.setMinHeight(100);
         centerPane.setMinHeight(100); 

         _root.setTop(topPane);
         _root.setCenter(centerPane);
         _root.setBottom(bottomPane);
         _root.setStyle("-fx-background-color: #C2FBFB;");
         
        topPane.getChildren().add(titulo);
        centerPane.getChildren().addAll(botones[0],botones[1],botones[2],botones[3]);
        centerPane.setAlignment(Pos.TOP_CENTER);
        
        bottomPane.setAlignment(Pos.TOP_CENTER);
        bottomPane.getChildren().add(integrantes);
        topPane.setSpacing(30);
        centerPane.setSpacing(30);
        actualizarVentana();
        
    }
    
    public void actualizarVentana()
    {
        Proyecto_Final_v10.scene=new Scene(_root,1000,800);
        Proyecto_Final_v10.stage.setScene(Proyecto_Final_v10.scene);
    }
            
            
           
    
}