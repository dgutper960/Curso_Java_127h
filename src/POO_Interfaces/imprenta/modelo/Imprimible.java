package POO_Interfaces.imprenta.modelo;
/**
 * UNA CLASE SI PUEDE IMPLEMENTAR VARIAS INTERFACES
 * **/
public interface Imprimible {

   /** En las interfaces podemos tener atributos constantes que sean accesibles por las clases que las implementan
    * Por defecto, public static final */
   String TEXTO_POR_DEFECTO = "Este texto es inmutable";


   /** Las interfaces obligan a las clases que las implementan a usar todos sus métodos sin cuerpo **/
   String imprimir(); // MODIFICADOR PUBLIC POR DEFECTO

   /** PODRÍA DARSE UN CASO EN QUE QUISIÉSEMOS IMPLEMENTAR MÉTODOS OPCIONALES
    *
    * Podemos tener métodos implementados por defecto por defecto
    * y estos métodos no deberá ser usado de forma obligatoria **/
   default String imprimirPorDefecto(){
      return "ESO ES UN USO DE LA CLASE POR DEFECTO DE IMPRIMIBLE "  ;
   }
   /** Es posible implementar métodos estáticos que pertenezcan a la interfaz e invocarlos directamente en el main **/
   static void imprimirStatic(Imprimible imprimible){
      System.out.println(imprimible.imprimir()); // IMPRIME DIRECTAMENTE PARA EL EJEMPLO
   }
}
