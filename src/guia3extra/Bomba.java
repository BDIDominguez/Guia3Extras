/*
 La Bomba tiene un comportamiento regar que hace que el Motor consuma agua 
hasta que su tanque quede completamente vacío y otro comportamiento 
mostrarInfor que muestra por pantalla la carga inicial del tanque, 
la velocidad del motor.
 */
package guia3extra;

import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */
public class Bomba {
    protected Motor motor;
    
    
    public void regar(int metros){
        int i;
        for (i = 0; i<=metros;i++){
           motor.consumirAgua();
        }
        
    }
    
    public void mostrarInfo(){
        JOptionPane.showMessageDialog(null,"El estado actual es " + motor.toString());
    }

    public Bomba(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}