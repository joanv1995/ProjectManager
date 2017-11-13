import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class ProductManagerImpl implements ProductManager {

    Logger log = Logger.getLogger(getClass().getName());


    static ProductManagerImpl instance;
    public Logger Log = Logger.getLogger(getClass().getName());

    public static ProductManagerImpl getInstance() {
        if(instance == null){
            instance = new ProductManagerImpl();
        }

        return instance;
    }
    public List<Producto> ordenarProductosAscPrecio(List<Producto> lista){
       //Ordenar lista iterando y ordenando por precio ascendente

        Log.info("Lista ordenada por precio y devuelta");

    return null;
    }
    public void realizarPedido(Usuario usu, List<Producto> listProductos)
    {
        Pedido p = new Pedido(listProductos);
        usu.listaPedidos.add(p);
        Log.info("Pedido realizado");

    }
    public void servirPedido(List<Pedido> listaPedidos){
            //pedido servido
        log.info("Pedido servido correctamente");

    }
   public List<Pedido> pedidosRealizados (Usuario u){
        List<Pedido> p = u.getListaPedidos();
        Log.info("Pedido realizado por el usuario "+u.getNombre());
        return p;

    }
    public  List<Producto> ordenarProductosDescNumVentas(List<Producto> listaP){
      //Ordenar lista iterando  por numero de ventas descendente

        Log.info("Lista ordenada y devuelta");
       return null;

    }
}
