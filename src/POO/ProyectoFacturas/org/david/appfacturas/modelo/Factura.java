package POO.ProyectoFacturas.org.david.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Factura {

    private  int id;
    private static int ultimo_id;
    private  String descripcion;
    private Date fecha;

    private Cilente cliente;
    private LineasFactura[] linea;
    private int indiceLinea;
    private static final int MAX_LINEAS = 12;


    public Factura() {
        this.id = ++ultimo_id; //comienza en uno
        this.linea = new LineasFactura[MAX_LINEAS];
        this.fecha = new Date();
    }

    public Factura(String descripcion, Cilente cliente) {
        this();
        this.descripcion = descripcion;
        this.cliente = cliente;
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

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cilente getCliente() {
        return cliente;
    }

    public void setCliente(Cilente cliente) {
        this.cliente = cliente;
    }

    public LineasFactura[] getLinea() {
        return linea;
    }


    public void addLineaFactura(LineasFactura linea){
        if (indiceLinea<MAX_LINEAS){
            this.linea[indiceLinea++] = linea;
        }
    }

    public float calcularPrecioTotal(){
        float total = 0.0f;
        for (LineasFactura linea: this.linea){
            if(this.linea != null){
                continue;
            }
            total += linea.calcularImporte();
        }
        return total;
    }

    public String generarDetallesFactura() {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yy");
        StringBuilder sb = new StringBuilder("Factura con id ");
        sb.append(id)
                .append("\nFecha ")
                .append(df.format(this.fecha))
                .append("\nCliente ")
                .append(cliente.getNombre())
                .append("\nNIF Cliente ")
                .append(cliente.getNif())
                .append("\nDescripción ")
                .append(this.descripcion)
                .append("\n");
        //IMPRIMIMOS LOS DETALLES DE CADA LÍNEA
        for (LineasFactura linea : this.linea) {
            if (linea != null) {
                sb.append(linea);
            }
        }
        sb.append("Total Importe Factura\n")
                .append("\t")
                .append(calcularPrecioTotal())
                .append("€");
        return sb.toString();
    }
}
