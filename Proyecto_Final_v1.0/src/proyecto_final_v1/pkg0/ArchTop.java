package proyecto_final_v1.pkg0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christian, Tatiana, Gabriel
 * @version 1.0 05 de Agosto de 2016
 */

public class ArchTop {

    public LinkedList<Puntajes> puntajes;
    private File archPuntajes;
    
    
    /**
    * Constructor de clase ArchTop donde una LinkedList llamada puntajes obtendra
    * el puntaje de cada partida de juego y lo guardara en un archivo Puntajes.txt
    * @exception FileNotFoundException error de archivo no encontrado, ocurre 
    * cuando no es posible encontrar el archivo caracteres.
    */
    public ArchTop ()
    {
        this.puntajes = new LinkedList<Puntajes>();
        this.archPuntajes=new File("Puntajes.txt");
        String cod = new String(" ");
        String reviewText;
        Scanner Archi=null;
        try {
            Archi = new Scanner(new FileReader(this.archPuntajes));
            while (Archi.hasNext()) {
                reviewText = Archi.nextLine();
                String Cargado[] = reviewText.split(cod);
                this.puntajes.add(new Puntajes(Cargado[0],new Integer (Cargado[1])));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error Al Abrir Archivo De Caracteres");
        }
        Archi.close();
    }
    
    
    /**
    * Metodo conseguirLos10PrimerosNombres String que obtiene el nombre de los
    * 10 jugadores con mayor puntaje.
    * @return retornar
    */
    public String[] conseguirLos10PrimerosNombres()
    {
        String retornar[]=new String[10];
        Collections.sort(this.puntajes);
        for (int i=0;i<10;i++)
        {
            retornar[i]=new String(this.puntajes.get(i).getNombre());
        }
        
        return retornar;
    }
    
    
    /**
    * Metodo conseguirLos10PrimerosPuntajes String que obtiene el puntaje mayor
    * de los 10 jugadores.
    * @return retornar
    */
    public String[] conseguirLos10PirmerosPuntajes()
    {
                String retornar[]=new String[10];
        Collections.sort(this.puntajes);
        for (int i=0;i<10;i++)
        {
            retornar[i]=new String(Integer.toString(this.puntajes.get(i).getPuntuacion()));
        }
        
        return retornar;
         
    }
    
    
    /**
    * Metodo guardarPuntajes void que guarda el nombre del jugador y su puntaje
    * respectivo en el archivo Puntajes.txt.
    * @param nombre String que es el nombre del jugador.
    * @param puntaje int que es el puntaje obtenido del jugador en la partida.
    * 
    */
    public void guardarPuntajes(String nombre,int puntaje) 
    {
        this.puntajes.add(new Puntajes(nombre,puntaje));

            FileWriter fw = null;
        try {
            fw = new FileWriter(this.archPuntajes, true);
        } catch (IOException ex) {
            Logger.getLogger(ArchTop.class.getName()).log(Level.SEVERE, null, ex);
        }
            PrintWriter pw=new PrintWriter(fw);

        pw.println(nombre+" "+puntaje);
        pw.close();
        try {
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ArchTop.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
