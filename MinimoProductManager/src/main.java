import java.util.ArrayList;
import java.util.List;

public class main {


    public static void main(String[] args){

        ArrayList<Producto> list = new ArrayList<>();

       Usuario u = new Usuario("Pepe");
        Producto p1 = new Producto(3,5);
        Producto p2 = new Producto(3,5);
        Producto p3 = new Producto(3,5);
        Producto p4 = new Producto(3,5);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        ProductManagerImpl.getInstance().realizarPedido(u,list);
        List<Pedido> listaPedisos;
        listaPedisos = ProductManagerImpl.getInstance().pedidosRealizados(u);


    }



}
