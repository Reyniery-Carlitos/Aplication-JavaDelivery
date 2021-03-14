import Utilerias.*;

public class App {
    public static void main(String[] args){
//        PARTE 1
        // Creacion del objeto JavaDelivery
        JavaDelivery javaDelivery1 = new JavaDelivery();
        JavaDelivery javaDelivery2 = new JavaDelivery();

        // Creacion de los clientes
        Cliente clienteA = new Cliente(100, "Robert Jr.");
        Cliente clienteB = new Cliente(101, "Chris Evans");

//      PARTE 2.1
        // Creacion de los negocios
        Comercios neg1 = new Comercios("Bigos", "comida rapida");
        Comercios neg2 = new Comercios("Fit Gourmet", "gourmet");
        Comercios neg3 = new Comercios("Pizza Hut", "Comida Rapida");
        Comercios neg4 = new Comercios("Island's Buffet", "buffet");
        Comercios neg5 = new Comercios("Super Baleadas HN", "tradicional");
        Comercios neg6 = new Comercios("Golden Grill Buffet", "buffet");
        Comercios neg7 = new Comercios("Comidas Tipicas Hn", "tradicional");
        Comercios neg8 = new Comercios("Hacienda Real", "gourmet");
        Comercios neg9 = new Comercios("Denny's", "Comida Rapida");
        Comercios neg10 = new Comercios("Pollo Campero", "Comida Rapida");


        // Crear Catalogos
        Categorias categoria1 = new Categorias();
        Categorias categoria2 = new Categorias();

//      PARTE 2.2
        // Asignar Comercios al catalogo
        categoria1.Catalogo(neg1);
        categoria1.Catalogo(neg2);
        categoria1.Catalogo(neg3);
        categoria1.Catalogo(neg4);
        categoria1.Catalogo(neg5);
        categoria1.Catalogo(neg6);
        categoria1.Catalogo(neg7);
        categoria1.Catalogo(neg8);
        categoria1.Catalogo(neg9);
        categoria1.Catalogo(neg10);

        categoria2.Catalogo(neg1);
        categoria2.Catalogo(neg2);
        categoria2.Catalogo(neg3);
        categoria2.Catalogo(neg4);
        categoria2.Catalogo(neg5);
        categoria2.Catalogo(neg6);
        categoria2.Catalogo(neg7);
        categoria2.Catalogo(neg8);
        categoria2.Catalogo(neg9);
        categoria2.Catalogo(neg10);
//
//        // Mostrar datos de la categpria
//        categoria1.Mostrar_Catalogo("buffet");
//        categoria2.Mostrar_Catalogo("Dietetica");

//        PARTE 3
        // Creacion de Productos
        Productos prod1 = new Productos("Tacos mexicanos", "Descripcion producto 1", 40);
        Productos prod2 = new Productos("Pollo al horno con patatas", "Descripcion producto 2", 140);
        Productos prod3 = new Productos("Mega Hamburguesa delux", "Descripcion producto 3", 130);
        Productos prod4 = new Productos("Super torta delux", "Descripcion producto 4", 90);
        Productos prod5 = new Productos("Pizza peperoni", "Descripcion producto 5", 100);
        Productos prod6 = new Productos("Pizza con orilla de queso", "Descripcion producto 6", 120);
        Productos prod7 = new Productos("Pizza con vegetales", "Descripcion producto 7", 120);
        Productos prod8 = new Productos("Pizza de 3 quesos", "Descripcion producto 8", 150);
        Productos prod9 = new Productos("Mega Hamburger", "Descripcion producto 9", 110);
        Productos prod10 = new Productos("Tortas mexicanas", "Descripcion producto 10", 80);
        Productos prod11 = new Productos("Tortas cubanas", "Descripcion producto 11", 60);
        Productos prod12 = new Productos("Alitas de pollo", "Descripcion producto 12", 110);
        Productos prod13 = new Productos("Papitas", "Descripcion producto 13", 50);
        Productos prod14 = new Productos("Pollo al horno con verduras", "Descripcion producto 14", 170);
        Productos prod15 = new Productos("Pollo frito crujiente", "Descripcion producto 15", 160);
        Productos prod16 = new Productos("Tortilla de patata rellena de queso", "Descripcion producto 16", 180);
        Productos prod17 = new Productos("Palitos de queso", "Descripcion producto 17", 40);
        Productos prod18 = new Productos("Pollo Asado", "Descripcion producto 18", 120);
        Productos prod19 = new Productos("Pollo frito", "Descripcion producto 19", 100);
        Productos prod20 = new Productos("Hamburguesa", "Descripcion producto 20", 100);
        Productos prod21= new Productos("Pollo Frito con chilaquiles", "Descripcion producto 21", 150);
        Productos prod22 = new Productos("Pollo Asado con tajaditas", "Descripcion producto 22", 150);

        Productos prod23 = new Productos("Baleadas", "Descripcion producto 23", 50);
        Productos prod24 = new Productos("Tortas Hondurenias", "Descripcion producto 24", 70);
        Productos prod25 = new Productos("Tamalitos de elote", "Descripcion producto 25", 5);
        Productos prod26 = new Productos("Pozol", "Descripcion producto 26", 10);
        Productos prod27 = new Productos("Atol de elote", "Descripcion producto 27", 15);
        Productos prod28 = new Productos("Tamalitos de frijoles", "Descripcion producto 28", 5);
        Productos prod29 = new Productos("Sopa de capirotadas", "Descripcion producto 29", 40);
        Productos prod30 = new Productos("Tamales de cerdo", "Descripcion producto 30", 25);
        Productos prod31= new Productos("Tamales de pollo", "Descripcion producto 31", 25);
        Productos prod32= new Productos("Sopa de caracol", "Descripcion producto 32", 50);
        Productos prod33= new Productos("Sopa de canecho", "Descripcion producto 33", 100);
        Productos prod34= new Productos("Tapado olanchano", "Descripcion producto 34", 100);
        Productos prod35= new Productos("Montucas", "Descripcion producto 35", 30);
        Productos prod36= new Productos("Sopa de pescadp", "Descripcion producto 36", 80);
        Productos prod37= new Productos("Pescado frito con tajaditas", "Descripcion producto 37", 130);
        Productos prod38= new Productos("Fresco natural", "Descripcion producto 38", 10);

        Productos prod39 = new Productos("Pastas", "Descripcion producto 39", 80);
        Productos prod40 = new Productos("Spaguetti a la boloniesa", "Descripcion producto 40", 100);
        Productos prod41 = new Productos("Platos Fuertes", "Descripcion producto 41", 170);
        Productos prod42 = new Productos("Lomo Baniado en salsa barbacoa", "Descripcion producto 42", 200);
        Productos prod43 = new Productos("Buffet mexicano", "Descripcion producto 43", 120);
        Productos prod44 = new Productos("Cremas y sopas", "Descripcion producto 44", 100);
        Productos prod45 = new Productos("Buffet italiano", "Descripcion producto 45", 130);
        Productos prod46 = new Productos("Ensalada cesar", "Descripcion producto 46", 130);
        Productos prod47 = new Productos("Lasagna", "Descripcion producto 47", 70);
        Productos prod48 = new Productos("Spaguetti a la poblana", "Descripcion producto 48", 90);
        Productos prod49 = new Productos("Spaguetti a los 3 quesos", "Descripcion producto 49", 90);
        Productos prod50 = new Productos("Arroz Blanco con granitos de elote", "Descripcion producto 50", 60);
        Productos prod51= new Productos("Spaguetti a la crema", "Descripcion producto 51", 50);
        Productos prod52 = new Productos("Champiniones", "Descripcion producto 52", 80);
        Productos prod53 = new Productos("Salsa de chipotle", "Descripcion producto 53", 75);

        Productos prod54 = new Productos("Paella", "Descripcion producto 54", 200);
        Productos prod55 = new Productos("Arroz con pollo", "Descripcion producto 55", 150);
        Productos prod56 = new Productos("Cabiar", "Descripcion producto 56", 250);
        Productos prod57 = new Productos("Poutine", "Descripcion producto 57", 280);
        Productos prod58 = new Productos("Masala dosa", "Descripcion producto 58", 250);
        Productos prod59 = new Productos("Som tam", "Descripcion producto 59", 240);
        Productos prod60 = new Productos("Palomitas con mantequilla", "Descripcion producto 60", 190);
        Productos prod61 = new Productos("pan tostado con mantequilla", "Descripcion producto 61", 200);
        Productos prod62 = new Productos("Tofu apestoso", "Descripcion producto 62", 210);
        Productos prod63 = new Productos("Mazapan", "Descripcion producto 63", 120);
        Productos prod64 = new Productos("Catsup", "Descripcion producto 64", 240);
        Productos prod65 = new Productos("Pan Frances", "Descripcion producto 65", 260);
        Productos prod66 = new Productos("Pollo a la parmesana", "Descripcion producto 66", 260);
        Productos prod67 = new Productos("Miel de maple", "Descripcion producto 67", 270);
        Productos prod68 = new Productos("Cangrejo a la parmesana", "Descripcion producto 68", 400);
        Productos prod69 = new Productos("Pescado con papas", "Descripcion producto 69", 300);
        Productos prod70= new Productos("Ankimo", "Descripcion producto 70", 350);

        // Crear menus
        Menu m1 = new Menu();
        Menu m2 = new Menu();
        Menu m3 = new Menu();
        Menu m4 = new Menu();
        Menu m5 = new Menu();
        Menu m6 = new Menu();
        Menu m7 = new Menu();
        Menu m8 = new Menu();
        Menu m9 = new Menu();
        Menu m10 = new Menu();

        // Asignar productos al menu
        m1.Productos_Menu(prod1);
        m1.Productos_Menu(prod3);
        m1.Productos_Menu(prod5);
        m1.Productos_Menu(prod7);
        m1.Productos_Menu(prod9);
        m1.Productos_Menu(prod11);
        m1.Productos_Menu(prod13);
        m1.Productos_Menu(prod15);
        m1.Productos_Menu(prod17);
        m1.Productos_Menu(prod19);
        m1.Productos_Menu(prod21);

        m2.Productos_Menu(prod2);
        m2.Productos_Menu(prod4);
        m2.Productos_Menu(prod6);
        m2.Productos_Menu(prod8);
        m2.Productos_Menu(prod10);
        m2.Productos_Menu(prod12);
        m2.Productos_Menu(prod14);
        m2.Productos_Menu(prod16);
        m2.Productos_Menu(prod18);
        m2.Productos_Menu(prod20);
        m2.Productos_Menu(prod22);

        m9.Productos_Menu(prod16);
        m9.Productos_Menu(prod15);
        m9.Productos_Menu(prod13);
        m9.Productos_Menu(prod14);
        m9.Productos_Menu(prod17);
        m9.Productos_Menu(prod7);
        m9.Productos_Menu(prod8);

        m10.Productos_Menu(prod18);
        m10.Productos_Menu(prod22);
        m10.Productos_Menu(prod1);
        m10.Productos_Menu(prod20);
        m10.Productos_Menu(prod18);
        m10.Productos_Menu(prod12);
        m10.Productos_Menu(prod11);
        m10.Productos_Menu(prod9);

        m3.Productos_Menu(prod24);
        m3.Productos_Menu(prod26);
        m3.Productos_Menu(prod28);
        m3.Productos_Menu(prod30);
        m3.Productos_Menu(prod32);
        m3.Productos_Menu(prod34);
        m3.Productos_Menu(prod36);
        m3.Productos_Menu(prod38);

        m4.Productos_Menu(prod23);
        m4.Productos_Menu(prod25);
        m4.Productos_Menu(prod27);
        m4.Productos_Menu(prod29);
        m4.Productos_Menu(prod31);
        m4.Productos_Menu(prod33);
        m4.Productos_Menu(prod35);
        m4.Productos_Menu(prod37);

        m5.Productos_Menu(prod39);
        m5.Productos_Menu(prod41);
        m5.Productos_Menu(prod43);
        m5.Productos_Menu(prod45);
        m5.Productos_Menu(prod47);
        m5.Productos_Menu(prod49);
        m5.Productos_Menu(prod51);
        m5.Productos_Menu(prod53);

        m6.Productos_Menu(prod40);
        m6.Productos_Menu(prod42);
        m6.Productos_Menu(prod44);
        m6.Productos_Menu(prod46);
        m6.Productos_Menu(prod48);
        m6.Productos_Menu(prod50);
        m6.Productos_Menu(prod52);

        m7.Productos_Menu(prod52);
        m7.Productos_Menu(prod54);
        m7.Productos_Menu(prod56);
        m7.Productos_Menu(prod58);
        m7.Productos_Menu(prod60);
        m7.Productos_Menu(prod62);
        m7.Productos_Menu(prod64);
        m7.Productos_Menu(prod66);
        m7.Productos_Menu(prod68);
        m7.Productos_Menu(prod70);

        m8.Productos_Menu(prod53);
        m8.Productos_Menu(prod55);
        m8.Productos_Menu(prod57);
        m8.Productos_Menu(prod59);
        m8.Productos_Menu(prod61);
        m8.Productos_Menu(prod63);
        m8.Productos_Menu(prod65);
        m8.Productos_Menu(prod67);
        m8.Productos_Menu(prod69);

        // Asignar menus al comercio
        neg1.Menu_Comercio(m1);
        neg3.Menu_Comercio(m2);
        neg9.Menu_Comercio(m9);
        neg10.Menu_Comercio(m10);
        neg8.Menu_Comercio(m8);
        neg2.Menu_Comercio(m7);
        neg4.Menu_Comercio(m5);
        neg6.Menu_Comercio(m6);
        neg5.Menu_Comercio(m3);
        neg7.Menu_Comercio(m4);

//        PARTE 4 y 5
        // Asignando datos del negocio al cliente
        clienteA.Asignar_Comercio_Cliente(neg1);

        clienteB.Asignar_Comercio_Cliente(neg4);
        clienteB.Asignar_Comercio_Cliente(neg5);

        // Asignando productos del negocio al cliente
        clienteA.Carrito(prod3);
        clienteA.Carrito(prod13);
        clienteA.Carrito(prod19);
        clienteA.Carrito(prod11);
        clienteA.Carrito(prod21);
        clienteA.Carrito(prod7);
        clienteA.Carrito(prod1);
        clienteA.Carrito(prod9);

        clienteB.Carrito(prod53);
        clienteB.Carrito(prod43);
        clienteB.Carrito(prod39);
        clienteB.Carrito(prod41);

        clienteB.Carrito(prod28);
        clienteB.Carrito(prod34);
        clienteB.Carrito(prod32);
        clienteB.Carrito(prod24);
        clienteB.Carrito(prod26);

        // Mostrar datos del cliente A y B
        clienteA.Mostrar_Carrito();
        clienteB.Mostrar_Carrito();

//      PARTE 6
        // Asignar Categoria a javaDeliver
        javaDelivery1.JCategoria(categoria1);
        javaDelivery2.JCategoria(categoria2);

        // Mostrar Busqueda
        javaDelivery1.Buscar_categorias("buffet"); // Categoria que existe
        javaDelivery2.Buscar_categorias("Dietetico"); // Categoria que no existe
    }
}
