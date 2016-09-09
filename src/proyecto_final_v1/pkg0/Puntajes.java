package proyecto_final_v1.pkg0;

/**
 *
 * @author Christian, Tatiana, Gabriel
 * @version 1.0 05 de Agosto de 2016
 */

public class Puntajes implements Comparable<Puntajes> { //para que ordene la lista
    
    private String nombre;
    private int puntuacion;
    
     
    /**
    * Constructor de clase Puntajes que recibe el nombre y puntuacion 
    * de cada jugador.
    * @param i String que es el nombre del jugador.
    * @param a int que es la puntuacion del jugador al terminar el juego.
    */
    public Puntajes(String i, int a)
    {
        this.nombre=i;
        this.puntuacion=a;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    
    /**
    * Metodo compareTo int que recibe al puntaje y lo va comparando para
    * pode diferenciar que jugador obtuvo mas puntaje y colocarlo primero.
    * @param t Puntajes que es el puntaje obtenido.
    */
    @Override
    public int compareTo(Puntajes t) {
        if (this.puntuacion < t.getPuntuacion()) {
            return 1;
        }
        if (this.puntuacion > t.getPuntuacion()) {
            return -1;
        }
        return 0;
    }
    
}
