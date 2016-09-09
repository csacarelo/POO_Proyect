package proyecto_final_v1.pkg0;

import java.util.Scanner;
import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.image.Image;

/**
 *
 * @author Christian, Tatiana, Gabriel
 * @version 1.0 05 de Agosto de 2016
 */

public class Juego extends PaneOrganizer2{
    
    public static int puntaje;
    public static int vidas;
    public static int vidasPrianha;
    public static int puntajeReal;
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
    private static ImageView im1;
    private static ImageView im2;
    private static ImageView im3;
    
    
     /**
    * Constructor de clase Juego la cual hereda de la clase Paneorganizer2.   
    * Aqui se ha creado toda la ventana Juego que se mostrara al jugador, donde
    * se vera el nivel, las vidas y el puntaje obtenido durante el juego.
    */   
    public Juego ()
    {
        Arch=new ArchPalabras();
        puntaje=0;
        puntajeReal=0;
        vidas=3;
        cargas=0;
        nivel=1;
        vidasPrianha=3;
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

         Button btn3 = new Button("Regresar");
         btn3.setLayoutX(770);
         btn3.setLayoutY(800);
        
        
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

         Image ima = new Image("file:piranha.png");
         im1 = new ImageView();
         im1.setImage(ima);
         im1.setFitWidth(30);
         im1.setPreserveRatio(true); //Mantiene equilibrada la imagen a escala
         im1.setLayoutX(900);
         im1.setLayoutY(5);

         this.im2 = new ImageView();
         this.im2.setImage(ima);
         this.im2.setFitWidth(30);
         this.im2.setPreserveRatio(true); //Mantiene equilibrada la imagen a escala
         this.im2.setLayoutX(925);
         this.im2.setLayoutY(5);         

        
         im3 = new ImageView();
         im3.setImage(ima);
         im3.setFitWidth(30);
         im3.setPreserveRatio(true); //Mantiene equilibrada la imagen a escala
         im3.setLayoutX(950);
         im3.setLayoutY(5);     

         btn3.setFont(Font.font(null, FontWeight.BOLD, 15));
         
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

        PaneOrganizer2._root.getChildren().addAll(im2,b.getBu(),VIDAS,VIDA,PUNTAJE,PUNT,NIVEL,NIV,this.im1,this.im2,this.im3,btn3);
    
        PaneOrganizer2.actualizarVentana();
        
    }
    
    
     /**
    * Metodo Jugar donde empiezan a crearse los acction, los cuales son hilos 
    * que pertenecen a cada uno de los atacantes.
    * Se verifica si algun hilo sigue vivo constantemente.
    */   
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

    }
    
    
    /**
    * Metodo estatico cambiarDeNivel void donde se valida que puntaje debe tener 
    * el jugador para ir subiendo de nivel, teniendo como maximo nivel 4.
    */   
    public static void cambiarDeNivel()
    {
        if (Juego.puntajeReal>0 && Juego.puntajeReal<100 )
            Juego.nivel=1;
        if(Juego.puntajeReal>=100 && Juego.puntajeReal<300)
            Juego.nivel=2;
        if(Juego.puntajeReal>=300 && Juego.puntajeReal<600)
            Juego.nivel=3;
        if(Juego.puntajeReal>=600)
            Juego.nivel=4;
    }
    
    
    /**
    * Metodo estatico actualizarValores void que sirve para ir actualizando los
    * valores de nivel, vidas y puntaje en el trascurso del juego.
    */
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
                        compararVidasPiranhas();

                    }
                });
            }
        });
        actualizar.start();
    }
    
    
    /**
    * Metodo estatico compararVidasPiranhas void que sirve para mostrar en la
    * ventana juego la figura de las piranhas que nos restan para perder 1 vida.
    */
    public static void compararVidasPiranhas()
    {
        if(Juego.vidasPrianha==3)
        {
           Juego.im1.setVisible(true);
           Juego.im2.setVisible(true);
           Juego.im3.setVisible(true);                    
        }
        if(Juego.vidasPrianha==2)
        {
           Juego.im1.setVisible(true);
           Juego.im2.setVisible(true);
           Juego.im3.setVisible(false);                    
        } 
        if(Juego.vidasPrianha==1)
        {
           Juego.im1.setVisible(true);
           Juego.im2.setVisible(false);
           Juego.im3.setVisible(false);                    
        }        
        
    }
    
    
    /**
    * Metodo  murioAlgunAtacante void que sirve para verificar cuando el
    * jugador ya no tiene mas vidas, el juego termina y llama a la ventana
    * FinDeJuego
    */
    public void murioAlgunAtacante()
    {
        if(!flagMurio)
        {
           
            this.comprobarAtacantes();

        }else{
    
            if(Juego.vidasPrianha<=0)
            {
                Juego.vidas--;
                Juego.vidasPrianha=3;
            }
            if(Juego.vidas<=0)
            {
               Juego.cerrarHilos();
                Juego.flagTerminar=false;
                A.destruir();
               Thread actualizar=new Thread(new Runnable(){
                    @Override
                    public void run()
                    {
                        Platform.runLater(new Runnable() {
                        @Override
                            public void run(){
                                Juego.this.ventanaFinDeJuego();
                            }
                        });
                    }
                });
                actualizar.start();

                
            }
                flagMurio=false;
                
            
        }
        
    }
    
    
    /**
    * Metodo comprobarAtacantes void que sirve para comprobar cuantos atacantes
    * estan inicializados de acuerdo al nivel del juego.
    */
    public void comprobarAtacantes()
    {
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
    }
    
    
    /**
    * Metodo iniciarAtacantes void que sirve para asignar cuantos atacantes
    * deben aparecer de acuerdo a cada nivel.
    */
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
    
    
     /**
    * Metodo verSiHiloEstaVivo void que sirve para destruir el hilo del atacante
    * que desaparece al momento de tipear toda su palabra o caracter..
    */
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
        
    }
    
}

