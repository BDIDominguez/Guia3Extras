/*
Los Productos tienen como atributos: descripción, precio de lista, stock y 
tipo de producto; además de un método especial calcularPrecioPublico que 
retornará el precio de lista más un 25% si el producto es de tipo “Lácteo”, 
un 35% si el producto es de tipo “Limpieza” y un 45% para cualquier otro 
tipo de producto.
 */
package entidades;

/**
 *
 * @author Dario
 */

public class Producto {
    private String descripcion;
    private double listaPrecio;
    private double stock;
    private String tipoProducto;
    private double precio;

    @Override
    public String toString() {
        return "Producto{" + "descripcion=" + descripcion + ", listaPrecio=" + listaPrecio + ", stock=" + stock + ", tipoProducto=" + tipoProducto + ", precio=" + precio + '}';
    }
    
    
    public void calculaPrecioPublico(){
        if (this.tipoProducto.toUpperCase().equals("LACTEO")){
            this.precio = this.listaPrecio + (this.listaPrecio*25/100);
            System.out.println("Se detecto que es un lacteo");
            System.out.println(toString());
        }else if (this.tipoProducto.toUpperCase().equals("LIMPIEZA")){
            this.precio = this.listaPrecio + (this.listaPrecio*35/100);
            System.out.println("Se detecto que es un Limpieza");
            System.out.println(toString());
        }else{
            this.precio = this.listaPrecio + (this.listaPrecio*45/100);
            System.out.println("Se detecto que No es ni Lacto ni limpieza");
            System.out.println(toString());
        }
        
        /*
        switch (this.descripcion) {
            case "Lacteo":
                this.precio = this.listaPrecio + (this.listaPrecio*25/100);
                break;
            case "Limpieza":
                this.precio = this.listaPrecio + (this.listaPrecio*35/100);
                break;
            default:
                this.precio = this.listaPrecio + (this.listaPrecio*45/100);
                break;
        } */
    }

    public Producto(String descripcion, double listaPrecio, double stock, String tipoProducto) {
        this.descripcion = descripcion;
        this.listaPrecio = listaPrecio;
        this.stock = stock;
        this.tipoProducto = tipoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getListaPrecio() {
        return listaPrecio;
    }

    public void setListaPrecio(double listaPrecio) {
        this.listaPrecio = listaPrecio;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    
    
}
