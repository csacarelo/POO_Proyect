package proyecto_final_v1.pkg0;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author Christian
 */
public class Juego extends PaneOrganizer2{
    
    public static int puntaje;
    public static int vidas;
    int cargas;
    public static int nivel;
    public static boolean flagMurio=false;
    ArchPalabras Arch;
    public static Accion Enemigo1;
    public static Accion Enemigo2;
    public static Accion Enemigo3;
    public static Accion Enemigo4;
    CompararPalabras A;
    Scanner ser;
    static String  letras;
    public static Label PUNT;
    public static Label VIDA;
    public static Label NIV;
    Thread verificarQueEstenVivos;
    public static boolean flagTerminar;
    
    public Juego ()
    {
        Arch=new ArchPalabras();
        puntaje=0;
        vidas=3;
        cargas=0;
        nivel=1;
        Juego.flagTerminar=true;
        Juego.flagMurio=false;
        ser=new Scanner(System.in);
        PaneOrganizer2._root= new Pane();
        //Pane _bu = new Pane();
        Image image = new Image("file:oce.png");
        ImageView im2 = new ImageView();
        im2.setImage(image);
        im2.setFitWidth(1000);
        im2.setFitHeight(800);
        
        Buceador b = new Buceador();
        Button btn4 = new Button("REGRESAR");
         btn4.setLayoutX(790);
         btn4.setLayoutY(740);
         btn4.setOnAction(new ClickHandlerJuego());
         
         Label VIDAS = new Label("VIDAS:");
         VIDAS.setLayoutX(5);
         VIDAS.setLayoutY(5);
         
         VIDA = new Label("      "  + Integer.toString(vidas));
         VIDA.setLayoutX(55);
         VIDA.setLayoutY(5);
         
         Label PUNTAJE = new Label("PUNTAJE:");
         PUNTAJE.setLayoutX(255);
         PUNTAJE.setLayoutY(5);
         
         PUNT = new Label("      "  + Integer.toString(puntaje));
         PUNT.setLayoutX(340);
         PUNT.setLayoutY(5);
         
         Label NIVEL = new Label("NIVEL:");
         NIVEL.setLayoutX(540);
         NIVEL.setLayoutY(5);
         
         NIV = new Label("      "  + Integer.toString(nivel));
         NIV.setLayoutX(590);
         NIV.setLayoutY(5);
         
         btn4.setFont(Font.font(null, FontWeight.BOLD, 20));
     

         VIDAS.setFont(Font.font(null, FontWeight.BOLD, 25));
         VIDAS.setTextFill(Color.LIGHTSALMON);
        
         PUNTAJE.setFont(Font.font(null, FontWeight.BOLD, 25));
         PUNTAJE.setTextFill(Color.LIGHTSALMON);
        
         NIVEL.setFont(Font.font(null, FontWeight.BOLD, 25));
         NIVEL.setTextFill(Color.LIGHTSALMON);

         VIDA.setFont(Font.font(null, FontWeight.BOLD, 25));
         VIDA.setTextFill(Color.WHITE);
        
         PUNT.setFont(Font.font(null, FontWeight.BOLD, 25));
         PUNT.setTextFill(Color.WHITE);
        
         NIV.setFont(Font.font(null, FontWeight.BOLD, 25));
         NIV.setTextFill(Color.WHITE);

        PaneOrganizer2._root.getChildren().addAll(im2,b.getBu(),btn4,VIDAS,VIDA,PUNTAJE,PUNT,NIVEL,NIV);
    
        PaneOrganizer2.actualizarVentana();
        //PaneOrganizer2._root.getChildren().addAll(_bu);
   
    }
    
     private class ClickHandlerJuego implements EventHandler<ActionEvent> {
         
           @Override
           public void handle(ActionEvent event){

               A.destruir();
               Juego.flagTerminar=false;
              cerrarHilos();
              Thread.yield();
              ventanaPRINCIPAL();
              
           }       
     }
     
     
     
    public void Jugar()
    {
        iniciarAtacantes();
        A=new CompararPalabras();
        A.start();
        verificarQueEstenVivos=new Thread(new Runnable(){
            @Override
            public void run()
                {
                    while (Juego.flagTerminar)
                    {
                        murioAlgunAtacante();
                    }
                }  
                
                });

            
          verificarQueEstenVivos.start();

          

          
       // letras=this.ser.next();
            
    }
    
    public static void cambiarDeNivel()
    {
        if (Juego.puntaje>0 && Juego.puntaje<100)
            Juego.nivel=1;
        if(Juego.puntaje>=100 && Juego.puntaje<300)
            Juego.nivel=2;
        if(Juego.puntaje>=300 && Juego.puntaje<600)
            Juego.nivel=3;
        if(Juego.puntaje>=600)
            Juego.nivel=4;
    }
    
    public static void actualizarValores()
    {
        Thread actualizar=new Thread(new Runnable(){
            @Override
            public void run()
            {
                Platform.runLater(new Runnable() {
                @Override
                    public void run(){
                        NIV.setText("      "  + Integer.toString(nivel));
                        PUNT.setText("      "  + Integer.toString(puntaje));
                        VIDA.setText("      "  + Integer.toString(vidas));

                    }
                });
            }
        });
        actualizar.start();
    }
    
    public void murioAlgunAtacante()
    {
        if(!flagMurio)
        {
            //actualizarValores();

            if(nivel==1)
            {
                if(!Enemigo1.isAlive())
                {
                    Enemigo1=new Accion(Arch,20);
                    Enemigo1.start();
                  
                }
            }
            if(nivel==2)
            {
                if(!Enemigo1.isAlive())
                {
                    Enemigo1=new Accion(Arch,15);
                    Enemigo1.start();
                }
                try{
                if(!Enemigo2.isAlive())
                {
                    Enemigo2=new Accion(Arch,15);
                    Enemigo2.start();

                }
                }catch(NullPointerException e){
                    Enemigo2=new Accion(Arch,15);
                    Enemigo2.start();
                }
            }
            if(nivel==3)
            {
                if(!Enemigo1.isAlive())
                {
                    Enemigo1=new Accion(Arch,10);
                    Enemigo1.start();
                   
                }
                if(!Enemigo2.isAlive() )
                {
                    Enemigo2=new Accion(Arch,10);
                    Enemigo2.start();
                }
                try{
                if(!Enemigo3.isAlive() )
                {
                    Enemigo3=new Accion(Arch,10);
                    Enemigo3.start();
                } 
                }catch(NullPointerException e){
                    Enemigo3=new Accion(Arch,10);
                    Enemigo3.start();
                }
            }
            if(nivel==4)
            {
                if(!Enemigo1.isAlive())
                {
                    Enemigo1=new Accion(Arch,5);
                    Enemigo1.start();
                 }
                if(!Enemigo2.isAlive())
                {
                    Enemigo2=new Accion(Arch,5);
                    Enemigo2.start();
                 }
                if(!Enemigo3.isAlive())
                {
                    Enemigo3=new Accion(Arch,5);
                    Enemigo3.start();
                 }
                try{
                if(!Enemigo4.isAlive() )
                {
                    Enemigo4=new Accion(Arch,5);
                    Enemigo4.start();
                 }
                }catch(NullPointerException e){
                    Enemigo4=new Accion(Arch,5);
                    Enemigo4.start();
                }
            }
        }else{
     //       this.vidas--;
            this.cerrarHilos();
            if(Juego.vidas==0)
            {
                Juego.flagTerminar=false;
                A.destruir();
               Thread actualizar=new Thread(new Runnable(){
                    @Override
                    public void run()
                    {
                        Platform.runLater(new Runnable() {
                        @Override
                            public void run(){
                                Juego.this.ventanaPRINCIPAL();
                            }
                        });
                    }
                });
                actualizar.start();

                
            }
            flagMurio=false;
            
        }
        
    }
    
    public void iniciarAtacantes()
    {
        if(nivel==1)
        {
            Enemigo1=new Accion(Arch,20);
            Enemigo1.start();
        }
        if(nivel==2)
        {
            Enemigo1=new Accion(Arch,15);
            Enemigo2=new Accion(Arch,15);
            Enemigo1.start();
            Enemigo2.start();
        }
        if(nivel==3)
        {
            Enemigo1=new Accion(Arch,10);
            Enemigo2=new Accion(Arch,10);
            Enemigo3=new Accion(Arch,10);
            Enemigo1.start();
            Enemigo2.start();
            Enemigo3.start();
        }
        if(nivel==4)
        {
            Enemigo1=new Accion(Arch,5);
            Enemigo2=new Accion(Arch,5);
            Enemigo3=new Accion(Arch,5);
            Enemigo4=new Accion(Arch,5);
            Enemigo1.start();
            Enemigo2.start();
            Enemigo3.start();
            Enemigo4.start();
        }
        
    }
   
    public static boolean verSiHiloEstaVivo(Accion a)
    {
        if(a!=null)
            if(a.isAlive())
                return true;
        return false;
    }
    public static void cerrarHilos()
    {
        if(Enemigo1!=null)
            if(Enemigo1.isAlive())
                Enemigo1.destruir();
        if(Enemigo2!=null)
            if(Enemigo2.isAlive())
                Enemigo2.destruir();
        if(Enemigo3!=null)
            if(Enemigo3.isAlive())
                Enemigo3.destruir();
        if(Enemigo4!=null)
            if(Enemigo4.isAlive())
                Enemigo4.destruir();
        //A.destruir();
        
    }
    
}

