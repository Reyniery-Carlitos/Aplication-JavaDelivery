package Utilerias;
import java.util.ArrayList;

public class JavaDelivery {
    int cat;
    ArrayList <Categorias> comercios = new ArrayList<Categorias>();    // Lista de comercios de donde la empresa javaDelivery realiza entregas a domicilio.

    // Constructor de la clase JavaDelivery
    public JavaDelivery(){
        this.comercios = new ArrayList<Categorias>();
    }

    // Asignar categorias
    public void JCategoria(Categorias nueva_categoria){
        nueva_categoria.miCom = this;
        this.comercios.add(nueva_categoria);
    }

    // Lista de los catalogos de negocio
    public void Buscar_categorias(String cat){
        int i = 0;

        for (Categorias c: this.comercios) {
            c.Mostrar_Catalogo(cat);
        }
    }
}
