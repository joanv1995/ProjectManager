import java.util.ArrayList;
import java.util.List;

public class Usuario {

    public String nombre;
    public List<Pedido> listaPedidos;

    public Usuario (String nom){
        this.nombre = nom;


    }

    public String getNombre() {
        return nombre;
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }
}
