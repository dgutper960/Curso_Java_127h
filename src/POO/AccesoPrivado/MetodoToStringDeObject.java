package POO.AccesoPrivado;

public class MetodoToStringDeObject {
    public static void main(String[] args) {

        /**
         * Creamos un objeto de la clase Automovil
         * Si lo imprimimos directamente se llama de forma automática al método toString
         * **/
        Automovil peugeotTraveller = new Automovil("Peugeot", "Traveller");
        System.out.println(peugeotTraveller); // _directorio_Automovil@6d03e736
        System.out.println("peugeotTraveller.toString() = " + peugeotTraveller.toString()); // _directorio_Automovil@6d03e736
        /** Obtenemos el mismo resultado
         * --> Lo que hace toString es que convierte el hashcode a un hexadecimal */
        System.out.println("peugeotTraveller.hashCode() = " + peugeotTraveller.hashCode()); // 1828972342

        /**
         * Como toString es un método de Object,
         * podemos sobreescribirlo en la clase Automovil para personalizarlo a nuestro antojo
         * --> Hemos definido uno con "generate" y ahora muestra todos los atributos del objeto
         * --> Podremos personalizar esta sobrecarga como queramos, pero solo podemos tener una
         * */
        System.out.println("peugeotTraveller = " + peugeotTraveller);
        // resultado: Automovil{fabricante='Peugeot', modelo='Traveller', color='verde', cilindrada=0.0, capacidadDeposito=50}
        /** Observamos que el resto de valores están por defecto de la Clase Automovil
         * */

        /** --> Si deseamos otros toString en la clase
         * deberán llamarse de forma distinta y llamarlos explícitamente */
        System.out.println("peugeotTraveller.toString2() = " + peugeotTraveller.toString2());
        // resultado: peugeotTraveller.toString2() = Peugeot Traveller

    }
}
