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


    }
}
