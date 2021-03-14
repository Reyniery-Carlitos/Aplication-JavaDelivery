package Utilerias;
import java.util.ArrayList;
import java.util.Scanner;

public class Categorias {
    Scanner entrada = new Scanner(System.in);
    String cat;
    String cat2;
    ArrayList <Comercios> categorias = new ArrayList<Comercios>();
    public JavaDelivery miCom;

    // Constructor de la clase Catalogo
    public Categorias(){
        this.categorias = new ArrayList<Comercios>();
    }

    // Asignar Catalogo
    public void Catalogo(Comercios nueva_categoria){
        nueva_categoria.miCategoria = this;
        this.categorias.add(nueva_categoria);
    }

    // Mostrar Catalogo
    public void Mostrar_Catalogo(String cat){
        int i = 0;
        System.out.println("*** BUSCANDO CATEGORIAS ***");
        for (Comercios c: this.categorias) {
            if (cat == c.categoria){
                System.out.println("Nombre del comercio: " + c.nComercio + " Categoria: " + c.categoria);
                System.out.println("-------------------------------------------------");
                cat2 = cat;
            }
            i++;
        }
        if (cat2 != cat){
            System.out.println("LA CATEGORIA: " + cat + " NO EXISTE!!!");
        }
    }
}


