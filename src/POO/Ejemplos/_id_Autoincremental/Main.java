package POO.Ejemplos._id_Autoincremental;

public class Main {
    public static void main(String[] args) {

        /***
         * EN ESTE EJEMPLO VAMOS A VER COMO IMPLEMENTAR UN id_autoincrement
         * MEDIANTE UN MÉTODO ESTÁTICO EN LA CLASE COCHE
         * --> Creamos atributos estáticos id ; ultimo_id
         * --> Creamos el método para que id se inicialice con ++ultimo_id
         * --> Añadimos el atributo id al primer constructor y toString
         * --> si la visibilidad es private, getters, setters
         * ***/

        /** Creamos diferentes instancias de coches **/
        Coche clio = new Coche("Renault", "Clio");
        Coche ibiza = new Coche("Seat", "Ibiza", "Rojo", 3);
        Coche corolla = new Coche();
        corolla.setColor("negro");
        corolla.setNumPuertas(5);
        Coche c4 = new Coche();


        /** Vemos el toString de cada coche **/
        System.out.println("clio = " + clio);
        System.out.println("\nibiza = " + ibiza);
        System.out.println("\ncorolla = " + corolla);
        System.out.println("\nc4 = " + c4);


    }
}
