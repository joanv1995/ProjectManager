import java.util.ArrayList;
import java.util.List;

public class Pedido {


    Integer numProductos;
    List<Producto> listadoProductos;

    public Pedido(List<Producto> p){
        this.listadoProductos =p;


    }


    public List<Producto> getListadoProductos() {
        return listadoProductos;
    }

    public Integer getNumProductos() {
        return numProductos;
    }
}
