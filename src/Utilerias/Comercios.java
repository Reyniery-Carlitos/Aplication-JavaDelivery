package Utilerias;
import java.util.ArrayList;

public class Comercios {
    String nComercio;
    String categoria;
    ArrayList<Productos> productos = new ArrayList<Productos>();
    ArrayList<Menu> menuC = new ArrayList<Menu>();
    public Cliente miComercio;
    public Categorias miCategoria;
    public JavaDelivery miCom;

    // Constructor de la clase comercios
    public Comercios(String nComercio, String categoria){
        this.nComercio = nComercio;
        this.categoria = categoria;

        this.productos = new ArrayList<Productos>();
        this.menuC = new ArrayList<Menu>();
    }

    // Asignar menus a los comercios
    public void  Menu_Comercio(Menu nuevo_Menu){
        nuevo_Menu.listaM = this;
        this.menuC.add(nuevo_Menu);
    }
}
