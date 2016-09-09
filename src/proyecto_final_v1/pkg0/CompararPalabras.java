package proyecto_final_v1.pkg0;

import java.util.Scanner;
import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author Christian, Tatiana, Gabriel
 * @version 1.0 05 de Agosto de 2016
 */

public class CompararPalabras extends Thread {
    Scanner scane=new Scanner(System.in);
    boolean flag=true;
    public static String ga="";
    public static KeyCode a;
    public CompararPalabras()
    {
        
    }
    
    @Override
    public void run()
    {
        result();
       while (flag) 
       {

       }
    }
    
    
     /**
    * Metodo result void que permitira ejecutar el evento de ingreso por teclado
    * de lo caracteres que presiona el jugador.
    * Aqui tambien se valida el ataque especial que puede eliminar todos los 
    * atacantes cercanos con 150 puntos y presionando solo la tecla ENTER. 
    */       
    private void result(){
        PaneOrganizer2._root.setOnKeyPressed(new EventHandler<KeyEvent>(){
            @Override
            public void handle(KeyEvent ke) {
            ga=ke.getText();
            a=ke.getCode();
            if(ke.getCode().compareTo(KeyCode.ENTER)==0 && Juego.puntaje>=150)
            {
                Juego.cerrarHilos();
                Juego.puntaje=Juego.puntaje-150;
                Juego.cambiarDeNivel();
                Juego.actualizarValores();
            }
                
            System.out.println("Key Pressed: " + ga);
            }
            
        });
        
    }
    
    
     /**
    * Metodo destruir void que pone la bandera flag en falso.
    */   
    public void destruir()
    {
        flag=false;
    }
    
  
}
