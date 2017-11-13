import java.util.HashMap;
import java.util.List;

public interface ProductManager {


    List<Producto> ordenarProductosAscPrecio(List<Producto> lista);

    void realizarPedido(Usuario u, List<Producto> listProductos);

    void servirPedido(List<Pedido> listaPedidos);

    List<Pedido> pedidosRealizados (Usuario u);

    List<Producto> ordenarProductosDescNumVentas(List<Producto> listaP);
}
