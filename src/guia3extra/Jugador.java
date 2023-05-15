/*
 En el siguiente modelo, tenemos una clase Jugador con los atributos: nombre y
clasificación; un constructor que inicializa su atributo nombre y los métodos:
tirarDado(): Que recibe por parámetro un Dado, lo que hará este método es 
invocar el método generarNro del dado y acumulará el valor del Dado en su 
atributo clasificación.
verClasificación(): Retornará la clasificación del jugador.
 */
package guia3extra;

/**
 *
 * @author Dario
 */
public class Jugador {
    private String nombre;
    private String clasificacion;

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", clasificacion=" + clasificacion + '}';
    }

    public Jugador(String nombre, String clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }
    
    public void tirarDado(Dado dado){
        dado.generaNro();
        this.clasificacion = this.clasificacion + dado.verNro() ;
    }
    
    public String verClasificacion(){
        return this.clasificacion;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    
}
