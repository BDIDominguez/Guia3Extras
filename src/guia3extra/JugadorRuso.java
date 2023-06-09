/*
 Clase Jugador: esta clase posee los siguientes atributos: id (representa el 
número del jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por 
ejemplo) y mojado (indica si está mojado o no el jugador).
Métodos:
disparo(Revolver r): el método, recibe el revolver de agua y llama a los 
métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta,
aprieta el gatillo y si el revolver tira el agua, el jugador se moja; por
lo tanto el atributo mojado pasa a true, sino false.
*/

package guia3extra;

/**
 *
 * @author Dario
 */

public class JugadorRuso {
    private int id;
    private String nombre;
    private boolean mojado=false;

    @Override
    public String toString() {
        return "JugadorRuso{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    public JugadorRuso(int id) {
        this.id = id;
        this.nombre = "Jugador " + this.id;
    }
    
    public void disparo(RevolverDeAgua revolver){
        revolver.siguienteChorro();
        this.mojado = revolver.mojar();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
}
