package POO.AccesoDefecto;

import java.util.Locale;

public class Automovil {
    /**
     * --> En esta clase no ponemos método de entrada
     * --> La clase no se puede poner private, no tendría sentido
     * --> Al poner la clase public puede usarse desde cualquier parte de la aplicación
     * --> Pondremos algún atributo a esta clase, visibilidad por defecto = a nivel de paquete
     * --> Al no ser un atributo estático, significa que pertenece a la instancia y no afecta a la clase en general */

    String fabricante;
    String modelo;
    String color = "verde";
    double cilindrada;
    // una vez declarados los atributos nos vamos al main y creamos objetos de la clase

    int capacidadDeposito = 50;

    static String colorPatente = "Azul";


    /** Implementamos métodos --> _modfAcceso_,_retorno_,_nombre_,_entrada()_**/

    //MÉTODO QUE IMPRIME LOS DETALLES DEL AUTO
    public void detalles(){
        String color = "azul"; // como en la de abajo pone this esta variable no es usada (solo para el ejemplo)
        System.out.println("auto2.fabricante = " + this.fabricante);
        System.out.println("auto2.modelo = " + this.modelo);
        System.out.println("auto2.color = " + this.color);
        System.out.println("auto2.cilindrada = " + this.cilindrada);
        // this hace referencia a el de la clase y no al del método
        // en este caso no hace falta porque no hay ambigüedad, pero es buena práctica
        /** ESTO ES UN EJEMPLO PERO LOS DATOS DEBERÍAN IR EN UN RETURN Y NO SER IMPRESOS DIRECTAMENTE
         * vamos a corregirlo para que retorne un string y hacer el sout en el main */
    }

    public StringBuilder detallesMejorado(){
        // IMAGINEMOS QUE TENEMOS UNA GRAN CANTIDAD DE ARGUMENTOS
        // creamos objeto StringBuilder para concatenar tó en un String y concatenamos con append
        StringBuilder sb = new StringBuilder();
        sb.append("auto2.fabricante = " + this.fabricante);
        sb.append("\nauto2.modelo = " + this.modelo);
        sb.append("\nauto2.color = " + this.color);
        sb.append("\nauto2.cilindrada = " + this.cilindrada);

        // Retornamos el StringBuilder
        return sb;
    }

    // MÉTODO QUE RETORNA SOLO EL FABRICANTE Y EL MODELO
    public String marcaModelo(){
        // CUANDO TENEMOS UNA VARIABLE QUE SOLO LA USAMOS PARA EL RETURN, LA PODEMOS OMITIR
        //String datos = "\nLa marca del auto es "+this.fabricante+"\nEl modelo es "+this.modelo;
        return "\nLa marca del auto es "+this.fabricante+"\nEl modelo es "+this.modelo;
        //return datos;
    }

    /** VEAMOS UN EJEMPLO DE MÉTODO CON PARÁMETRO DE ENTRADA */
    public String acelerar(int rpm){
        return "\nEl "+this.fabricante+" "+this.modelo+" acelerando a "+rpm+"rpm";
    } // LA ENTRADA DE UN ENTERO SERÁ OBLIGATORIA EN LA LLAMADA

    /** COMO NO TENEMOS VARIABLES CON EL MISMO NOMBRE QUE EN LA CLASE
     * TAMBIÉN PODEMOS ACCEDER A LAS PROPIEDADES DE LA CLASE SIN THIS **/
    public String frenar(){
        return "\nEl "+fabricante+" "+modelo+" ha frenado";
    }

    /** PODEMOS TENER MÉTODOS QUE USEN OTROS MÉTODOS Y USAR EL THIS PARA REFERIRNOS AL MÉTODO DE LA CLASE */
    public String aceleraFerna(int rmp){
        String acelerar = this.acelerar(rmp);
        String frenar = frenar(); // si no hay posibilidad de ambigüedad, no hace falta el this
        return acelerar + frenar;
    }

    /**
     * VEAMOS UN PEQUEÑO EJEMPLO DE SOBRECARGA
     * --> Dos métodos con el mismo nombre
     * --> Según el argumento de entrada se usa uno u otro
     * */

    // CALCULA EL CONSUMO SEGÚN LA DISTANCIA RECORRIDA Y EL PORCENTAJE DE DEPÓSITO GASTADO
    public float mediaConsumo(int km, float porcentaje){ // requiere entrada en float ej.- 0.60f
        return km/(this.capacidadDeposito*porcentaje);
    }


    public float mediaConsumo(int km, int porcentaje){ // requiere entrada en int ej.- 60
        return km/(this.capacidadDeposito*(porcentaje/100f));
    }
    /** SEGÚN EL PARÁMETRO DE ENTRADA ELEGIDO SE USARÁ UN MÉTODO O EL OTRO */


    public Automovil() {
    }
}
