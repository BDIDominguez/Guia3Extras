/*
Por otro lado, tenemos la clase Dado que posee como atributo: 
número que es un valor entero y los métodos:
generarNro(): Que genera un número al azar entre 1 y 6 que se 
lo asigna a su variable atributo numero, si el atributo tiene 
un valor mayor a 0, significa que ese dado ya generó un valor y lo mantendrá.
verNro(): Retornará el valor guardado en la variable numero
 */
package guia3extra;

import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */

public class Dado {
    private int numero=0;
    
    public void generaNro(){
        if (this.numero == 0){
            this.numero =(int)(Math.random()*6 + 1);
        }else{
            JOptionPane.showMessageDialog(null,"El dado ya tiene un, numero");
        }
    }
    
    public int verNro(){
        return this.numero;
    }
    
}
