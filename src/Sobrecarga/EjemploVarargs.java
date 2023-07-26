package Sobrecarga;

public class EjemploVarargs {
    public static void main(String[] args) {
        /***
         * VISTA LA SOBRECARGA SE NOS PUEDE OCURRIR QUE
         * MUCHAS VECES VAMOS A QUERER HACER OPERACIONES
         * PERO NO SABEMOS QUE NÚMERO DE ARGUMENTOS VAMOS A TENER
         * EN ESTE CASO USAREMOS LOS MÉTODOS CON NÚMERO DE ARGUMENTOS VARIABLE
         * PODEMOS USAR VARARGS JUNTO A OTROS ARGUMENTOS DE ENTRADA
         * **/
        //EL COMPILADOR SELECCIONA EL 1er MÉTODO
        System.out.println("Sumamos tres enteros con el 1er método "+suma(13, 19, 12));

        //EL COMPILADOR SELECCIONA EL MÉTODO CON ENTRADA VARIABLE
        System.out.println("Sumamos un número de enteros distinto a 3 y selecciona el 2º método "+suma(2, 2));
        System.out.println("Sumamos un número de enteros distinto a 3 y selecciona el 2º método "+suma(21, 22, 57,5));

        //CALCULAMOS EL PRECIO CON IVA INCLUIDO DE VARIOS PRODUCTOS
        System.out.println("Importe con IVA incluido "+sumaIVA(0.10f, 50, 50));
    }

    /** Si sabemos previamente que vamos a sumar 3 enteros definimos este método **/
    public static int suma(int a, int b, int c){
        return a+b+c;
    }

    /** Definiendo este método tenemos que pensar en que la entrada es un array **/
    public static int suma(int... argumentos){
        int resultado = 0;
        for (int i:argumentos){
            resultado += i;
        }
        return resultado;
    }

    /** PODEMOS USAR VARARGS JUNTO A OTROS ARGUMENTOS DE ENTRADA
     * Un ejemplo de uso podría ser calcular el importe con IVA de n productos
     * (1er argumento IVA, varargs precios n productos) **/
    public static float sumaIVA(float iva, float... precios){
        float precioTotal;
        float total = 0;
        for (float i: precios){
             total += i;
        }
        precioTotal = total + (total * iva);
        return precioTotal;
    }
}
