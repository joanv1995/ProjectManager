
import java.util.List;
import java.util.ArrayList;


public class Test {
    ProductManagerImpl a;

    @org.junit.Before
    public void setUp() throws Exception {
        a=ProductManagerImpl.getInstance();
        Usuario u=new Usuario("Pepe");
        a.pedidosRealizados(u);
        Producto p1 = new Producto(3,5);
        Producto p2 = new Producto(3,5);
        Producto p3 = new Producto(3,5);
        Producto p4 = new Producto(3,5);

    }

    @org.junit.After
    public void tearDown() throws Exception {

        a = null;

    }
    @org.junit.Test
    public void servirPedido() throws Exception {

    }

    @org.junit.Test
    public void realizarPedido() throws Exception {
        ArrayList<Producto> lista = new ArrayList<Producto>();
        Producto p1 = new Producto(3,5);
        Producto p2 = new Producto(3,5);
        Producto p3 = new Producto(3,5);
        Producto p4 = new Producto(3,5);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        Usuario u = new Usuario("Juan");
        a.realizarPedido(u,lista);






    }

    }


