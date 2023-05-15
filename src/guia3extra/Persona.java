/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extra;

import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */
public class Persona {
    private String apellido;
    private String nombre;

    public Persona(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    public void ubicarme(GPS gps){
        gps.mover();
        //Posicion vActual = new Posicion(0, 0);
        Posicion vActual = gps.obtenerUltimaPosicion();
        JOptionPane.showMessageDialog(null,vActual.toString());
    }
    
}
