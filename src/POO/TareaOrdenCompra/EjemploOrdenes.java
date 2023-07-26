package POO.TareaOrdenCompra;

import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        

        /*** Creamos las órdenes **/
        OrdenCompra orden1 = new OrdenCompra("El cliente quiere el pedido para mañana");
        orden1.setFecha(new Date());
        orden1.setCliente(new Cliente("Victor", "Ordoñez"));
        orden1.addProducto(new Producto("Carioca", "Rotulador Verde", 0.75));
        orden1.addProducto(new Producto("Carioca", "Rotulador Rojo", 0.75));
        orden1.addProducto(new Producto("Carioca", "Rotulador Naranja", 0.75));
        orden1.addProducto(new Producto("Carioca", "Rotulador Rosa", 0.75));
        
        OrdenCompra orden2 = new OrdenCompra("Pedido a domicilio");
        orden2.setFecha(new Date());
        orden2.addProducto(new Producto("Alpine", "Color Marrón", 0.90));
        orden2.addProducto(new Producto("Alpine", "Color Verde", 0.90));
        orden2.addProducto(new Producto("Alpine", "Color Amarillo", 0.90));
        orden2.addProducto(new Producto("Alpine", "Color Violeta", 0.90));

        OrdenCompra orden3 = new OrdenCompra("Envuelto para regalo");
        orden3.setFecha(new Date());
        orden3.addProducto(new Producto("Pilot", "Color Negro", 1.95));
        orden3.addProducto(new Producto("Pilot", "Color Verde", 1.95));
        orden3.addProducto(new Producto("Pilot", "Color Azul", 1.95));
        orden3.addProducto(new Producto("Pilot", "Color Rojo", 1.95));

        /** HACEMOS UN ARRAY DE OrdenCompra y metemos las compras **/
        OrdenCompra[] ordenes = {orden1, orden2, orden3};
        for (OrdenCompra orden: ordenes) {
            System.out.println("Orden id " + orden.getId());
            System.out.println("Cliente " + orden.getCliente());
            System.out.println("Descripción " + orden.getDescripcion());
            System.out.println("Fecha " + orden.getFecha());


            int i = 1;
            for (Producto p : orden.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " precio " + p.getPrecio()+"€");
                i++;
            }
            System.out.println("Precio total venta " + orden.granTotal());
            System.out.println("---------------------------------- siguiente --------------------------------------");
        }
    }
}
