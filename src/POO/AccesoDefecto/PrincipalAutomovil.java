package POO.AccesoDefecto;

public class PrincipalAutomovil {
    public static void main(String[] args) {

        /**
         * PREVIAMENTE, HEMOS DEFINIDO ALGUNOS ATRIBUTOS EN AUTOMOVIL
         * */

        Automovil auto1 = new Automovil();
        // en este momento, los datos no están inicializados en la clase Coche
        /** Como la visibilidad es por defecto, podemos acceder a los atributos de forma directa */
        System.out.println("Auto 1");
        auto1.fabricante = "Renault";
        auto1.modelo = "Laguna";
        auto1.color = "Naranja";
        auto1.cilindrada = 1.900;
        System.out.println("auto1.fabricante. = " + auto1.fabricante); // null
        System.out.println("auto1.modelo = " + auto1.modelo); // null
        System.out.println("auto1.color = " + auto1.color); // en la clase Coche lo hemos puesto verde
        System.out.println("auto1.cilindrada = " + auto1.cilindrada); // null

        System.out.println("\nAuto 2");
        /** Si creamos otra instancia vamos a ver si hay atributos inicializados o no */
        Automovil auto2 = new Automovil();
        //VEMOS QUE TIENE LOS VALORES QUE HEMOS DEJADO EN LA CLASE AUTOMOVIL
        System.out.println("auto2.fabricante = " + auto2.fabricante);
        System.out.println("auto2.modelo = " + auto2.modelo);
        System.out.println("auto2.color = " + auto2.color);
        System.out.println("auto2.cilindrada = " + auto2.cilindrada);

        System.out.println("\nAuto 3");
        /** Podemos crear tantos objetos como queramos y todos tendrán los valores y métodos del original */
        Automovil auto3 = new Automovil();
        auto3.fabricante = "Toyota";
        auto3.modelo = "Prius +";
        auto3.color = "Negro";
        auto3.cilindrada = 2.0;
        System.out.println("auto2.fabricante = " + auto3.fabricante);
        System.out.println("auto2.modelo = " + auto3.modelo);
        System.out.println("auto2.color = " + auto3.color);
        System.out.println("auto2.cilindrada = " + auto3.cilindrada);

        /**
         * NOS VAMOS A AUTOMOVIL Y DEFINIMOS ALGUNOS MÉTODOS
         * --> detalles() --> Muestra los valores de los atributos por consola
         * **/

        Automovil auto4 = new Automovil();
        auto4.fabricante = "Audi";
        auto4.modelo = "A5";
        auto4.color = "Blanco";
        auto4.cilindrada = 2.5;

        /** Accedemos al método para ver los detalles del auto4 */
        System.out.println("\nAuto 4");
        auto4.detalles(); // muestra los detallas de este auto
        /** Este método imprime directamente y la buena práctica es que tenga un return
         * lo conservamos como ejemplo de lo visto pero
         *
         * por lo que usamos mejor el detallesMejorado() */

        System.out.println("\nAuto 3");
        System.out.println(auto3.detallesMejorado());

        System.out.println("\nAuto 1\n"+auto1.detallesMejorado());

        /** llamamos al método marcaModelo() */
        System.out.println(auto3.marcaModelo());

        /** LLAMAMOS A acelerar QUE TIENE COMO ARGUMENTO DE ENTRADA UN  int */
        System.out.println(auto3.acelerar(3000)); // Si no hay argumento, da error

        /** frenamos */
        System.out.println(auto4.frenar());

        /** acelera y frena */
        System.out.println(auto1.aceleraFerna(2500));

        /** Llamamos a sobrecarga 1 (float como entrada) */
        System.out.println("\nEl consumo del "+auto1.modelo+" es de "+ auto1.mediaConsumo(500, 0.60f)+"km/l");

        /** Llamamos a sobrecarga 2 (int como entrada) */
        System.out.println("\nEl consumo del "+auto4.modelo+" es de "+ auto1.mediaConsumo(500, 85)+"km/l");





    }
}
