package proyecto_final_v1.pkg0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Christian, Tatiana, Gabriel
 * @version 1.0 05 de Agosto de 2016
 */

public class ArchPalabras {
    private File archivoDePalabras;
    private File archivoDeCaracteres;
    private LinkedList<String>palabras;
    private LinkedList<String>caracteres;
    
    
    /**
    * Constructor de clase ArchPalabras donde se llama a un archivo Palabras.txt 
    * para las palabras que se le asignan a los tiburones y  tambien otro 
    * archivo Caracteres.txt para los caracteres que se le asignan a las piranhas.
    * @exception FileNotFoundException error de archivo no encontrado, ocurre 
    * cuando no es posible encontrar el archivo caracteres y tambien el archivo
    * palabras.
    */
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
    
    
    /**
    * Metodo conseguirPalabraAleatoria String que saca del archivo Palabras.txt
    * una palabra de forma aleatoria(random).
    */
    public String conseguirPalabraAleatoria()
    {
        int valorRandom=(int)(Math.random()*this.palabras.size());
        return this.palabras.get(valorRandom);
    }
    
    
    /**
    * Metodo conseguirPalabraAleatoria String que saca del archivo Caracteres.txt
    * una palabra de forma aleatoria(random).
    */
    public String conseguirCaracterAleatoria()
    {
        int valorRandom=(int)(Math.random()*this.caracteres.size());
        return this.caracteres.get(valorRandom);
    }
}
