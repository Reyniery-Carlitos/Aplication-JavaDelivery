package Utilerias;

public class Productos {
    String nProducto;
    String descripcion;
    float precio;
    public Menu listaMP;
    public Comercios listaP;
    public Cliente compra;

    // Constructor de la clase Productos
    public Productos(String nProducto, String descripcion, float precio){
        this.nProducto = nProducto;
        this.descripcion = descripcion;
        this.precio = precio;
    }
}
