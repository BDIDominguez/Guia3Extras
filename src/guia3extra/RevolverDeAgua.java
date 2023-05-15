/*
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor.
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package guia3extra;

import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */
public class RevolverDeAgua {
    private int actual;
    private int posicion;
    
    public void llenarRevolver(){
        JOptionPane.showMessageDialog(null,"Se esta cargando el Arma!!!!");
        this.actual=(int) ((Math.random()*6)+1);
        this.posicion=(int) ((Math.random()*6)+1);
    }
    public boolean mojar(){
        return this.actual == this.posicion;
    }
    public void siguienteChorro(){
        // por costumbre se utiliza un revolver de tambor por ende el avanze es 
        // circular de 1 a 6 tiros 
        if (this.actual == 6){
            this.actual = 1;
        }else{
            this.actual ++;   
        }
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "actual=" + actual + ", posicion=" + posicion + '}';
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    
}
