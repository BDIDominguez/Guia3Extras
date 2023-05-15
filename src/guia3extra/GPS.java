/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extra;

/**
 *
 * @author Dario
 */
public class GPS {
    private String marca;
    private String modelo;
    private Posicion ultimaUbicacion;

    public GPS(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public Posicion obtenerUltimaPosicion(){
        return ultimaUbicacion;
    }
    public void mover(){
        ultimaUbicacion.setLatitud(Math.random());
        ultimaUbicacion.setLongitud(Math.random());
       
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Posicion getUltimaUbicacion() {
        return ultimaUbicacion;
    }

    public void setUltimaUbicacion(Posicion ultimaUbicacion) {
        this.ultimaUbicacion = ultimaUbicacion;
    }
}
