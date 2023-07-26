package POO.ProyectoFacturas.org.david.appfacturas.modelo;

public class LineasFactura {

    private int cantidad;
    private Producto producto;

    public LineasFactura(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float calcularImporte(){
        return (float) this.cantidad * this.producto.getPrecio();
    }

    @Override
    public String toString() {
        return  "\n"+producto.toString() +
                "\nCantidad "+cantidad +
                "\nImporte total "+ calcularImporte();
    }
}
