public class Producto {

    public Integer precio;
    public Integer numVentas;


    public Producto(Integer p, Integer v){
        this.precio = p;
        this.numVentas = v;
    };

    public Integer getPrecio() {
        return precio;
    }

    public Integer getNumVentas() {
        return numVentas;
    }
}
