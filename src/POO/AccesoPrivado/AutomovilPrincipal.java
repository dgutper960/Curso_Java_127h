package POO.AccesoPrivado;

public class AutomovilPrincipal {
    public static void main(String[] args) {

        /**
         * PREVIAMENTE, HEMOS DEFINIDO ALGUNOS ATRIBUTOS EN AUTOMOVIL CON VISIBILIDAD POR DEFECTO
         * CAMBIAMOS SUS ATRIBUTOS A PRIVATE QUE ES LO RECOMENDADO
         * --> Ya no podemos acceder de forma directa, necesitamos getters y setters (los definimos en Automovil)
         * --> Para acceder hacerlo mediante estos métodos (get = leer y set = cambiar)
         * */

        /** DEBEMOS ACCEDER CON SET PARA MODIFICAR */
        Automovil auto1 = new Automovil(); /** Este constructor es por defecto solo crea la instancia **/
        // en este momento, los datos no están inicializados en la clase Automovil
        System.out.println("Auto 1");
        auto1.setFabricante("Renault");
        auto1.setModelo("Laguna");
        auto1.setColor("Naranja");
        auto1.setCilindrada(1.900);
        /** DEBEMOS ACCEDER CON GET PARA LEER **/
        System.out.println("auto1.fabricante. = " + auto1.getFabricante()); // null
        System.out.println("auto1.modelo = " + auto1.getModelo()); // null
        System.out.println("auto1.color = " + auto1.getColor()); // en la clase Automovil lo hemos puesto verde
        System.out.println("auto1.cilindrada = " + auto1.getCilindrada()); // null

        System.out.println("\nAuto 2");
        Automovil auto2 = new Automovil();
        System.out.println("auto2.fabricante = " + auto2.getFabricante());
        System.out.println("auto2.modelo = " + auto2.getModelo());
        System.out.println("auto2.color = " + auto2.getColor());
        System.out.println("auto2.cilindrada = " + auto2.getCilindrada());

        System.out.println("\nAuto 3");
        Automovil auto3 = new Automovil();
        auto3.setFabricante("Toyota");
        auto3.setModelo("Prius +");
        auto3.setColor("Negro");
        auto3.setCilindrada(2.0);
        System.out.println("auto2.fabricante = " + auto3.getFabricante());
        System.out.println("auto2.modelo = " + auto3.getModelo());
        System.out.println("auto2.color = " + auto3.getColor());
        System.out.println("auto2.cilindrada = " + auto3.getCilindrada());


        Automovil auto4 = new Automovil();
        auto4.setFabricante("Audi");
        auto4.setModelo("A5");
        auto4.setColor("Blanco");
        auto4.setCilindrada(2.5);


        System.out.println("\nAuto 4");
        auto4.detalles(); // muestra los detallas de este auto

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
        System.out.println("\nEl consumo del "+auto1.getModelo()+" es de "+ auto1.mediaConsumo(500, 0.60f)+"km/l");

        /** Llamamos a sobrecarga 2 (int como entrada) */
        System.out.println("\nEl consumo del "+auto4.getModelo()+" es de "+ auto1.mediaConsumo(500, 85)+"km/l");

        /**
         * UNA VEZ MODIFICADAS LAS LLAMADAS A LOS MÉTODOS YA ACCEDEMOS A TÓ SIN PROBLEMA
         * Y LOS MÉTODOS FUNCIONAN CORRECTAMENTE
         * **/

        /**
         * USAMOS EL CONSTRUCTOR PERSONALIZADO PARA CREAR UN OBJETO
         * **/
        Automovil toyota2 = new Automovil("Toyota", "Raw4");
        System.out.println("\nEL nuevo "+toyota2.getFabricante()+" "+toyota2.getModelo()+" ha llegado"+toyota2.aceleraFerna(2500));
        /** le damos al toyota2 otras propiedades **/
        toyota2.setColor("Turquesa");
        toyota2.setCapacidadDeposito(150);

        /** SI USO EL CONSTRUCTOR QUE CON TODOS LOS ARGUMENTOS DEBERÉ PONERLOS TODOS OBLIGATORIAMENTE **/
        Automovil trafic = new Automovil(
                "Renault", "Trafic", "Blanco", 2500, 75);


    }
}
