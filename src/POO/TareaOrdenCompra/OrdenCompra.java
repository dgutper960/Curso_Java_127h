package POO.TareaOrdenCompra;

import java.util.Date;

public class OrdenCompra {

    private int id;
    private static int ultimo_id;

    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private int indiceProducto;

    public OrdenCompra(String descripcion) {
        this.id = ultimo_id++;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public static int getUltimo_id() {
        return ultimo_id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha(Date date) {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addProducto(Producto productos) {
        if (indiceProducto < this.productos.length) {
            this.productos[indiceProducto++] = productos;
        }
    }

    public double granTotal(Producto[] productos) {
        double precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal += producto.getPrecio();
        }
        return precioTotal;
    }
}
