/*
 El Tanque de Agua tiene una capacidad máxima es de 10.000 litros y los 
comportamientos para saber si su capacidad está al límite o vacía y otro 
cargar que cada vez que se lo invoca carga 500 litros.
 */
package guia3extra;

import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */
public class Tanque {
    private int capasidad;
    
    public int estado(){
        return this.capasidad;
    }
    public void cargar(int litros){
        if (this.capasidad <9500){
            this.capasidad += litros;
            JOptionPane.showMessageDialog(null, "Cargando Agua, capasidad al " + this.capasidad);
        }else{
            JOptionPane.showMessageDialog(null, "No se puede Cargar mas agua en el Tanque");
        }
    }
    public void vaciar(int cantidad){
        if (this.capasidad > cantidad){
            this.capasidad -= cantidad;
            System.out.println("Descargando el tanque....." );
        }else{
            System.out.println("No queda agua suficiente...");
        }
    }

    @Override
    public String toString() {
        return "Tanque{" + "capasidad=" + capasidad + '}';
    }
    
   
}
