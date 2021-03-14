package Utilerias;
import java.util.ArrayList;

public class Cliente{
    int id;
    int envio;
    float total = 0;
    String nombre;
    ArrayList<Productos> carrito;
    ArrayList<Comercios> cComercios = new ArrayList<Comercios>();

    // Inicio del contructor de la clase
    public Cliente(int id, String nombre){
        this.id = id;
        this.nombre = nombre;

        this.cComercios = new ArrayList<Comercios>();
        this.carrito = new ArrayList<Productos>();
    }

    // Asignar comercios al cliente
    public void Asignar_Comercio_Cliente(Comercios nuevo_comercio){
        nuevo_comercio.miComercio = this;
        this.cComercios.add(nuevo_comercio);
    }

    // Mostrar Comercios cliente
    public void Mostrar_Comercio_Cliente(){
        int i = 0;
        for (Comercios c: this.cComercios) {
            System.out.println("Nombre del negocio: " + c.nComercio + " / categoria: " + c.categoria);
            i++;
        }
    }

    // Crear Carrito de compras
    public void Carrito(Productos nuevo_carrito){
        nuevo_carrito.compra = this;
        this.carrito.add(nuevo_carrito);
    }

    // Mostrar Carrito de compras
    public void Mostrar_Carrito(){
        System.out.println("Carrito de compras del cliente: " + id + " : " + nombre);
        System.out.println("*** Produtos *** \t\t\t\t\t *** Descripcion *** \t\t\t\t\t *** Precio ***");

        int i = 1;
        for (Productos c: this.carrito) {
            System.out.println(i + ") " + c.nProducto + " \t\t\t\t" + c.descripcion + " \t\t\t\t" + c.precio + " lps");
            envio = 70 * cComercios.size();
            total += c.precio;
            i++;
        }
        System.out.println("-------------------------------------------");
        System.out.println("Cantidad de comercios donde compro: " + cComercios.size());
        Mostrar_Comercio_Cliente();
//        System.out.println("Total a pagar de la compra: " + total + " lps");
        System.out.println("Total a pagar de envio: " + envio + " lps");
//        System.out.println("Total a pagar: " + (total + envio) + " lps");
        System.out.println("-------------------------------------------");
    }
}
