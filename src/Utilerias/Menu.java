package Utilerias;
import java.util.ArrayList;

public class Menu{
    public Comercios listaM;
    ArrayList <Productos> menuProductos = new ArrayList<Productos>();


    // Contructor de la clase Menu
    public Menu (){
        this.menuProductos = new ArrayList<Productos>();
    }

    // Agregar productos
    public void Productos_Menu(Productos nuevo_Producto){
        nuevo_Producto.listaMP = this;
        this.menuProductos.add(nuevo_Producto);
    }

    // Mostrar lista de productos del comercio
    public void Mostrar_Productos_Comercio(){
        int i = 0;
        for (Productos c: this.menuProductos) {
            System.out.println("Productos: " + c.nProducto);
            i++;
        }
    }
}
