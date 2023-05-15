/*
 El Motor puede trabajar con 3 velocidades distintas (ALTA, MEDIA y BAJA) y un
comportamiento consumirAgua que cada vez que se lo invoca consume 10 litros si
trabaja a velocidad ALTA, 5 litros si trabaja a velocidad MEDIA y 1 litro si 
trabaja a velocidad BAJA; otro comportamiento cambiarVelocidad que cada vez 
que se lo usa, cambia la velocidad de Alta a Media y de Media a Baja y 
vuelve a empezar.
 */

package guia3extra;

/**
 *
 * @author Dario
 */

public class Motor {
    private Tanque tanque;
    private int velocidad = 1;
    
    public void consumirAgua() {
        
        switch (this.velocidad) {
            case 1:
                this.tanque.vaciar(10);
                break;
            case 2:
                this.tanque.vaciar(5);
                break;
            case 3:
                this.tanque.vaciar(1);
                break;
        }

    }
    public void cambiarVelocidad(int cambio){
        this.velocidad = cambio;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Motor(Tanque tanque) {
        this.tanque = tanque;
    }

    @Override
    public String toString() {
        return "Motor{" + "tanque=" + tanque.toString() + ", velocidad=" + velocidad + '}';
    }
    
}
