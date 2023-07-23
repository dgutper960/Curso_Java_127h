package POO.AccesoDefecto;

public class ContextoStatic {
    public static void main(String[] args) {

        /**
         * VAMOS A CREAR VARIOS COCHES PARA VER LO QUE OCURRE
         * CON LOS ELEMENTOS ESTÁTICOS DE LAS CLASES Y MÉTODOS
         *
         * --> Los atributos estáticos no pertenecen a la instancia, sino que pertenecen a toda la clase
         * --> Si una instancia de la clase cambia un atributo estático, este cambiará para todos los objetos de la clase
         * --> Si tenemos un método estático, este solo podrá trabajar con elementos estáticos
         * **/

        /** CREAMOS EN LA CLASE UN ATRIBUTO ESTÁTICO
         * ACEDEMOS A ESE VALOR DESDE DIFERENTES INSTANCIAS
         * Y VEMOS QUE SON EL MISMO VELOR
         * SI CAMBIAMOS EL VALOR DE UNA INSTANCIA, CAMBIA EL VALOR DE LAS DEMÁS **/
        Automovil coche1 = new Automovil();
        System.out.println("coche1.colorPatente = " + coche1.colorPatente); // Azul

        Automovil coche2 = new Automovil();
        System.out.println("coche1.colorPatente = " + coche2.colorPatente); // Azul

        Automovil coche3 = new Automovil();
        System.out.println("coche1.colorPatente = " + coche2.colorPatente); // Azul

        /** Cambiamos el colorPatente de coche dos a naranja
         * y vemos que el color ha cambiado para el resto de los objetos  **/
        coche2.colorPatente = "Naranja";
        System.out.println("coche1.colorPatente = " + coche1.colorPatente); // Naranja
        //LA BUENA PRÁCTICA PARA ESTO ES HACERLO NO CON LA INSTANCIA, SINO CON LA CLASE
        Automovil.colorPatente = "Rosa";
        System.out.println("coche2.colorPatente = " + coche2.colorPatente); // Rosa

        /***
         * Aunque si hablamos de Buenas Prácticas lo ideal es trabajar con visibilidad privada
         * por eso vamos a seguir en el paquete de acceso privado
         * **/



    }
}
