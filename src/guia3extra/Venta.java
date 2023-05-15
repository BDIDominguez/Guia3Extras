/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3extra;

import entidades.Cliente;
import entidades.Vendedor;
import entidades.Producto;

/**
 *
 * @author Dario
 */

public class Venta {
    private Cliente cliente;
    private Vendedor vendedor;
    private Producto prod1;
    private Producto prod2;
    private Producto prod3;
    private double importe=0;

    public Venta(Cliente cliente, Vendedor vendedor, Producto prod1, Producto prod2, Producto prod3) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.prod1 = prod1;
        this.prod2 = prod2;
        this.prod3 = prod3;
    }

    @Override
    public String toString() {
        return "Venta{" + "cliente=" + cliente + ", vendedor=" + vendedor + ", prod1=" + prod1 + ", prod2=" + prod2 + ", prod3=" + prod3 + ", importe=" + importe + '}';
    }


    public void calculaTotal(){
        
        if (prod1 != null){
           this.importe = this.importe + prod1.getPrecio();
       }
        if (prod2 != null){
           this.importe = this.importe + prod2.getPrecio();
       }
        if (prod3 != null){
           this.importe = this.importe + prod3.getPrecio();
       }
        if ("San Luis".equals(cliente.getCiudad())){
            this.importe = this.importe - (this.importe*10/100);
        }else{
            this.importe = this.importe - (this.importe*15/100);
        }
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Producto getProd1() {
        return prod1;
    }

    public void setProd1(Producto prod1) {
        this.prod1 = prod1;
    }

    public Producto getProd2() {
        return prod2;
    }

    public void setProd2(Producto prod2) {
        this.prod2 = prod2;
    }

    public Producto getProd3() {
        return prod3;
    }

    public void setProd3(Producto prod3) {
        this.prod3 = prod3;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    
    
    
    
}
