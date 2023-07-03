package Primitivos;

public class SistemasNumericos {
    public static void main(String[] args) {

        /**
         * VAMOS A VER LO SISTEMAS NUMÉRICOS
         * --> DECIMAL
         * --> BINARIO
         * --> OCTAL
         * --> HEXADECIMAL
         * Y SUS CONVERSIONES
         * */
        
        int numericoDecimal = 500;
        System.out.println("numericoDecimal = " + numericoDecimal);

        // LO CONVERTIMOS A BINARIO
        // usamos la clase Integer y su método toBinaryString()
        System.out.println("Pasamos "+numericoDecimal+" a binario --> "+Integer.toBinaryString(numericoDecimal));
        /** no olvidemos que el valor de esta operación, es un String*/

        // PRUEBA //
        Integer num = 56576;
        Integer.toBinaryString(num); // se debe pasar como entrada obligatoriamente
        // No podemos hacer directamente num.toBinaryString

        /** vamos a inicializar una variable int con un valor binario (500)  */
        int numBinario = 0b111110100; // es necesario el prefijo 0b para que lo tome como binario
        // si lo imprimimos se va a interpretar como 500 y así lo imprime
        System.out.println(numBinario); // lo muestra como decimal, ya que es por defecto

        /** vamos a pasar el numBinario a octal */
        System.out.println("El binario '"+numBinario+"' a octal es --> "+Integer.toOctalString(numBinario)); // valor octal 764

        /** Entonces vamos a declarar un Octal y lo vamos a imprimir a decimal */
        int numOctal = 0764; // el prefijo para octal es 0
        System.out.println(numOctal);

        /** Vamos a pasar 500 a hexadecimal */
        System.out.println("El exadecimal de '"+numericoDecimal+"' es --> "+Integer.toHexString(numericoDecimal));

        /** Para declarar un hexadecimal:  */
        int numHexadecimal = 0x1f4; // prefijo 0x
        System.out.println(numHexadecimal);

    }
}
