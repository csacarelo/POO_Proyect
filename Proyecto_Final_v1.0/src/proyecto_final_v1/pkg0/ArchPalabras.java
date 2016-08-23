/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_v1.pkg0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class ArchPalabras {
    private File archivoDePalabras;
    private File archivoDeCaracteres;
    private LinkedList<String>palabras;
    private LinkedList<String>caracteres;
    
    
    public ArchPalabras()
    {
        Scanner Archi=null;
        this.archivoDePalabras=new File ("Palabras.txt");
        this.archivoDeCaracteres=new File("Caracteres.txt");
        this.caracteres=new LinkedList<String>();
        this.palabras=new LinkedList<String>();
        try {
            Archi = new Scanner(new FileReader(this.archivoDeCaracteres));
            while (Archi.hasNext()) {
         
                this.caracteres.add(Archi.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error Al Abrir Archivo De Caracteres");
        }
        Archi.close();
        
        try {
            Archi = new Scanner(new FileReader(this.archivoDePalabras));
            while (Archi.hasNext()) {
                ///reviewScore = Archi.nextInt();
                this.palabras.add(Archi.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error Al Abrir Archivo De Palabras");
        }
        Archi.close();
    }
    
    
    public String conseguirPalabraAleatoria()
    {
        int valorRandom=(int)(Math.random()*this.palabras.size());
        return this.palabras.get(valorRandom);
    }
    
    public String conseguirCaracterAleatoria()
    {
        int valorRandom=(int)(Math.random()*this.caracteres.size());
        return this.caracteres.get(valorRandom);
    }
}
