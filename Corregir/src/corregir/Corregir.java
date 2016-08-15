/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corregir;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Corregir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Archi=null;
        File archivoDePalabras=new File ("Palabras.txt");
        //this.archivoDeCaracteres=new File("Caracteres.txt");
        //LinkedList caracteres=new LinkedList<String>();
        LinkedList<String> palabras=new LinkedList<String>();
        try {
            Archi = new Scanner(new FileReader(archivoDePalabras));
            while (Archi.hasNext()) {
                ///reviewScore = Archi.nextInt();
                palabras.add(Archi.nextLine());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error Al Abrir Archivo De Palabras");
        }
        Archi.close();
        
        try {
            File a = new File("Palabras_Corregidas.txt");
            FileWriter salida = new FileWriter(a, true);
            for(int i=0;i<palabras.size();i++){
                
                if(palabras.get(i).length()<=9){
                    salida.write(palabras.get(i));
                    salida.write("\r\n");
                    
                }
            }
            salida.close();

        } catch (Exception e) {
            System.out.println("Error tipo" + e);
        }
    }
    
    
}
