package ManejoDeErrores.ExcepcionPersonalizada;
/** En este ejemplo vamos a implementar una Excepción Personalizada
 * Luego un método division2 que llama al division y en el mismo
 * un bloque try/catch que maneja una excepción personalizada
 * que a su vez convierte una Exception UnChecked en un Checked **/
public class Calculadora2 {
    /**
     * MÉTODO PARA DIVIDIR
     **/
    public static double division(int numerador, int divisor) throws CustomDivPorCeroException {
        // una vez indicado con throws, podemos lanzar la excepción en el código
        if (divisor == 0) {
            throw new CustomDivPorCeroException("No se puede dividir entre 0");
        }
        return numerador / (double) divisor;
    }

    /**
     * CONSTRUCTOR ARRIBA EXPLICADO
     **/
    public static double division2(String numerador, String divisor) throws CustomDivPorCeroException, FormatoNumeroException {
        try {
            int num = Integer.parseInt(numerador);
            int div = Integer.parseInt(divisor);

            //Llamamos al método
            return division(num, div); // este método maneja el error de div / 0
        } catch (NumberFormatException e) {
            throw new FormatoNumeroException("Debe ingresar dos enteros");
            // Si se produce un error NumberFormatException se lanza el personalizado
        }
    }
    /** PARA PROBAR CREAMOS UN MAIN EN ESTA CLASE
     * --> Lo hacemos aquí para verlo más claro **/
}

class prueba{
    public static void main(String[] args) throws FormatoNumeroException, CustomDivPorCeroException {

        System.out.println(Calculadora2.division2("5", "2"));

    }
}
