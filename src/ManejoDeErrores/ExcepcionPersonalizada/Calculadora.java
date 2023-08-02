package ManejoDeErrores.ExcepcionPersonalizada;

public class Calculadora {
    // Para que en un método se lance una Exception,
    // debe indicarse antes del cuerpo con 'Throws' y las excepciones qu se van a lanzar
    public double division(int numerador, int divisor) throws CustomDivPorCeroException{
        // una vez indicado con throws, podemos lanzar la excepción en el código
        if (divisor == 0){
            throw new CustomDivPorCeroException("No se puede dividir entre 0");
        }
        return numerador / (double)divisor;
    } /** SI USAMOS ESTE MÉTODO, EL COMPILADOR, NOS VA A OBLIGAR A MANEJARLA CON UN TRY/CATCH
     --> Ver Main1 y Main2 **/
}
