package proyecto_final_v1.pkg0;

import javafx.application.Platform;
import javafx.scene.layout.Pane;

/**
 *
 * @author Christian, Tatiana, Gabriel
 * @version 1.0 05 de Agosto de 2016
 */

public class Accion extends Thread{
    
    Atacante A;
    int Velocidad;
    boolean flagAlive=true;
    String palabraDeLaImagen;
    
    
    /**
    * Constructor de clase Accion la cual hereda de la clase interna Thread.   
    * @param arch ArchPalabras que es un archivo e palabras en el idioma ingles.
    * @param Rapidez int que es la velocidad de cada atacante.
    */
    public Accion (ArchPalabras arch,int Rapidez)
    {
        int valorRandom=(int)(Math.random()*3+1);
        Velocidad=Rapidez;
        switch(valorRandom)
        {
            case 1:
                A=new piranha(arch.conseguirCaracterAleatoria(),Rapidez);
                break;
            case 2:
                A=new sharkBlack(arch.conseguirPalabraAleatoria(),arch.conseguirPalabraAleatoria(),Rapidez);
                break;
            default:
                A=new sharkWhite(arch.conseguirPalabraAleatoria(),Rapidez);
                //A=new sharkBlack(arch.conseguirPalabraAleatoria(),Rapidez);
                break;
        }
        
                    
    }
    
    
    /**
    * Metodo run que es donde empieza a correr cada hilo, siendo este un atacante.
    * Se le asigna una palabra al tiburon blanco, dos palabras al tiburon negro,
    * y un caracter a la piranha.
    * Cuando la palabra es ingresada por teclado se compara con la del atacante
    * y esta se elimina y tambien el hilo y se crea uno nuevo, 
    * con esto el jugador acumula puntaje y avanza de nivel.
    */
    @Override
    public void run() {
        
        palabraDeLaImagen=A.getWord().getText();
        
        Platform.runLater(new Runnable() {
            @Override
                public void run(){
                    Pane a=new Pane();
                    a.getChildren().addAll(A.getA());
                    PaneOrganizer2._root.getChildren().add(a);
                    
                }
        });
        
        while (flagAlive && A.isFlagAcabo())
        {

            try
            {
                if(Character.toString(palabraDeLaImagen.charAt(0)).compareToIgnoreCase(CompararPalabras.ga)==0)
                {
                   palabraDeLaImagen=palabraDeLaImagen.substring(1);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run(){
                            
                           if(A.getID()!=3 || A.murio)
                                A.word.setText(palabraDeLaImagen);
                           else
                               A.word2.setText(palabraDeLaImagen);
                        }
                    });
                   
                }
            }catch(StringIndexOutOfBoundsException e)
            {
                if(A.getID()!=3)
                {
                    Juego.puntaje=Juego.puntaje+A.ID*10;
                    Juego.puntajeReal=Juego.puntajeReal+A.ID*10;
                    Juego.cambiarDeNivel();
                    destruir();
                    Juego.actualizarValores();
                }else if(A.murio)
                {
                    A.cambiarPalabra();
                    palabraDeLaImagen=A.getWord2().getText();
                    A.murio=false;
                }else{
                    Juego.puntaje=Juego.puntaje+A.ID*10;
                    Juego.puntajeReal=Juego.puntajeReal+A.ID*10;
                    Juego.cambiarDeNivel();
                    destruir();
                    Juego.actualizarValores();
                }
                    

            }
            
            
        }
    }
    
    
    /**
    * Metodo destruir de tipo void que destruye el Action y es utilizado
    * en el metodo principal e esta clase llamado run.
    */  
    public void destruir()
    {
        flagAlive=false;
        A.destruir();
    }

    
}
