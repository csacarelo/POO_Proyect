/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christian
 */
public class ArchTop {

    public LinkedList<Puntajes> puntajes;
    private File archPuntajes;
    
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
                ///reviewScore = Archi.nextInt();
                reviewText = Archi.nextLine();
                String Cargado[] = reviewText.split(cod);
                this.puntajes.add(new Puntajes(Cargado[0],new Integer (Cargado[1])));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error Al Abrir Archivo De Caracteres");
        }
        Archi.close();
    }
    
    public String[] conseguirLos10Primeros()
    {
        String retornar[]=new String[10];
        Collections.sort(this.puntajes);
        for (int i=0;i<10;i++)
        {
            retornar[i]=new String(this.puntajes.get(i).getNombre()+"     "+this.puntajes.get(i).getPuntuacion());
        }
        
        return retornar;
    }
    
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
