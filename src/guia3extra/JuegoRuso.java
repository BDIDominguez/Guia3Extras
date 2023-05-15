/*
 Clase Juego: esta clase posee los siguientes atributos: 2 Jugadores y Revolver
Métodos:
• llenarJuego(Jugador jugador1,Jugador jugador2, Revolver r): este método 
recibe los 2 jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver 
de agua y aprieta el gatillo. Sí el revolver tira el agua el jugador se moja 
y se termina el juego, sino se moja, se pasa al siguiente jugador hasta que 
uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se debe 
mostrar que jugador se mojó. Pensar la lógica necesaria para realizar esto,
usando los atributos de la clase Juego
 */
package guia3extra;

import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */
public class JuegoRuso {
    private JugadorRuso jugador1, jugador2;
    private RevolverDeAgua revolver;

    public JuegoRuso() {
    }
    
    public void llenarJuego(JugadorRuso jugador1,JugadorRuso jugador2,RevolverDeAgua revolver){
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.revolver = revolver;
    }
    
    public void ronda(){
        boolean vSalir = false;
        do{
            jugador1.disparo(revolver);
            if (jugador1.isMojado()){
                vSalir = true;
                JOptionPane.showMessageDialog(null, "El Desafortunado Mojado es " + jugador1.toString());
            }else{
                jugador2.disparo(revolver);
                if (jugador2.isMojado()){
                    vSalir = true;
                    JOptionPane.showMessageDialog(null, "El Desafortunado Mojado es " + jugador2.toString());
                }
            }
        }while(!vSalir);
        JOptionPane.showMessageDialog(null, "Se a terminado el Juego");
    }

    public JugadorRuso getJugador1() {
        return jugador1;
    }

    public void setJugador1(JugadorRuso jugador1) {
        this.jugador1 = jugador1;
    }

    public JugadorRuso getJugador2() {
        return jugador2;
    }

    public void setJugador2(JugadorRuso jugador2) {
        this.jugador2 = jugador2;
    }

    public RevolverDeAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }
    
}
