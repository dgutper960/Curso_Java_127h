package POO.AccesoPrivado;

public class ContextoStatic {
    public static void main(String[] args) {

        /**
         * CREAMOS VARIOS COCHES Y CAMBIAMOS EL ATRIBUTO ESTÁTICO EN UN DE ELLOS
         * COMPROBAMOS QUE CAMBIA EN TODOS LOS DEMÁS
         * **/

        Automovil coche1 = new Automovil();
        Automovil coche2 = new Automovil();
        Automovil coche3 = new Automovil();

        System.out.println("coche1.getColorPatente() = " + coche1.getColorPatente()); // Azul
        System.out.println("coche2.getColorPatente() = " + coche2.getColorPatente()); // Azul
        System.out.println("coche3.getColorPatente() = " + coche3.getColorPatente()); // Azul

        //NO RECOMENDADO ES CAMBIAR MEDIANTE UNA INSTANCIA
        coche3.setColorPatente("Violeta");
        System.out.println("coche2.getColorPatente() = " + coche2.getColorPatente()); // Violeta

        // RECOMENDADO HACERLO MEDIANTE LA CLASE
        Automovil.setColorPatente("Púrpura");
        System.out.println("coche2.getColorPatente() = " + coche2.getColorPatente()); // Púrpura
        
        /** Usamos el método estático de la clase */
        System.out.println("Automovil.mediaConsumoStatic --> " +Automovil.mediaConsumoStatic(100, 60));
        // LOS MÉTODOS ESTÁTICOS ESTÁN DISEÑADOS PARA SER USADOS DESDE LA CLASE Y NO DESDE LAS INSTANCIAS, PERO SE PUEDE
        System.out.println("coche1.mediaConsumoStatic -->" + coche1.mediaConsumoStatic(100, 89));
        
        



    }
}
