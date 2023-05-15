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
public class Posicion {
    private double latitud;
    private double longitud;

    @Override
    public String toString() {
        return "Posicion{" + "latitud=" + latitud + ", longitud=" + longitud + '}';
    }

    public Posicion(double latitud, double longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    
}
