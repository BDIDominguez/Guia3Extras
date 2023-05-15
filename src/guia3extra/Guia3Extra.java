/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extra;

import entidades.Cliente;
import entidades.Producto;
import entidades.Vendedor;
import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */
public class Guia3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String vResp = "";
        do {
            System.out.print("************ MENU ********** \n"
                    + " 1 --- Persona usando GPS  \n"
                    + " 2 --- Jugar Con los Dados \n"
                    + " 3 --- Vender 3 Productos \n"
                    + " 4 --- Ruleta Rusa con Agua!!! los rusos ya no son lo que eran \n"
                    + " 5 --- Regar el Jardin \n"
                    + " S --- Salir \n");
            vResp = JOptionPane.showInputDialog("Que Opcion Elije, con el S sales");
            switch (vResp) {
                case "1":
                    Posicion posicion = new Posicion(0, 0);
                    GPS gps = new GPS("Gadmin", "P13");
                    gps.setUltimaUbicacion(posicion);
                    Persona persona = new Persona("Dominguez", "Bernardo Dario Ismael");
                    persona.ubicarme(gps);
                    break;
                case "2":
                    /* Desde una clase TestJuego se pide:
a) Crear 3 Dados.
b) Crear un Jugador de nombre “Pocho” y pedirle que tire los 3 Dados.
c) Mostrar al final la clasificación del Jugador.
d) Ahora Crear otros 3 Dados más.
e) Crear un nuevo Jugador de nombre “Pepe” y pedirle que tire los 3 últimos dados creados.
f) Al finalizar mostrar de los 2 jugadores el nombre que obtuvo la mayor clasificación. */
                    Dado d1 = new Dado();
                    Dado d2 = new Dado();
                    Dado d3 = new Dado();
                    Jugador jugador = new Jugador("Poncho","");
                    jugador.tirarDado(d1);
                    jugador.tirarDado(d2);
                    jugador.tirarDado(d3);
                    JOptionPane.showMessageDialog(null,"Datos del Jugador  "+jugador.toString());
                    Dado d4 = new Dado();
                    Dado d5 = new Dado();
                    Dado d6 = new Dado();
                    Jugador jugador1 = new Jugador("Pepe","");
                    jugador1.tirarDado(d4);
                    jugador1.tirarDado(d5);
                    jugador1.tirarDado(d6);
                    JOptionPane.showMessageDialog(null,"Datos del jugador "+jugador1.toString());
                    if (Integer.parseInt(jugador.getClasificacion()) > Integer.parseInt(jugador1.getClasificacion()) ){
                        JOptionPane.showMessageDialog(null, "El JUgador con mejor puntuacion es "+jugador.toString());
                    }else{
                        JOptionPane.showMessageDialog(null, "El JUgador con mejor puntuacion es "+jugador1.toString());
                    }
                    break;
                case "3":
                    /* Desde el método main de una clase TestComercio se pide:
a) Crear 3 Productos.
b) Crear un Cliente y un Vendedor.
c) Crear una Venta del Vendedor creado en el punto b para el Cliente creado en el punto b y con los 3 productos del punto a.
d) Solicitar a la Venta que informe el total. */
                    Producto p1 = new Producto("Tybo Cremoso",20,50, "lacteo");
                    Producto p2 = new Producto("Trapo de Piso",50,50, "lacteo");
                    Producto p3 = new Producto("Chicle",10,50, "lacteo");
                    p1.calculaPrecioPublico();
                    p2.calculaPrecioPublico();
                    p3.calculaPrecioPublico();
                    //JOptionPane.showMessageDialog(null, "Se Creo el producto " + p1.toString());
                    //JOptionPane.showMessageDialog(null, "Se Creo el producto " + p2.toString());
                    //JOptionPane.showMessageDialog(null, "Se Creo el producto " + p3.toString());
                    Cliente cliente = new Cliente("Bernardo","Dominguez","San Luis");
                    Vendedor vendedor = new Vendedor("Dario","Dominguez");
                    Venta venta = new Venta(cliente,vendedor,p1,p2,p3);
                    venta.calculaTotal();
                    JOptionPane.showMessageDialog(null, "El importe de la venta es de " + venta.getImporte());
                    break;
                case "4": // Ruleta Rusa
                    System.out.println("Creando jugadores ...");
                    JugadorRuso ivan = new JugadorRuso(1);
                    JugadorRuso gregori = new JugadorRuso(2);
                    System.out.println("Creando Arma ...");
                    RevolverDeAgua piupiu = new RevolverDeAgua();
                    
                    JuegoRuso aquiVamos = new JuegoRuso();
                    piupiu.llenarRevolver();
                    aquiVamos.llenarJuego(ivan, gregori, piupiu);
                    aquiVamos.ronda();
                    break;
                case "5":
                    /* Se pide desde el método main de una clase TestRegar:
a) Crear un Tanque y llenarlo con 5000 litros de agua.
b) Crear un Motor con este Tanque y que trabaje a velocidad Media.
c) Crear una Bomba con el motor instanciado en el punto b.
d) Hacer que la Bomba riegue y al finalizar invocar al método mostrarInfo. */
                    
                    System.out.println("Creando Tanque de Agua ...");   
                    Tanque tanque = new Tanque();
                    tanque.cargar(5000);
                    Motor motor = new Motor(tanque);
                    motor.cambiarVelocidad(2);
                    Bomba bomba = new Bomba(motor);
                    bomba.regar(5); // se considero pasarle la cantidad de metros a regar ese es el parametro pasado.
                    bomba.mostrarInfo();
                    break;
            }
        } while (!vResp.toUpperCase().equals("S"));

    }
    
}
