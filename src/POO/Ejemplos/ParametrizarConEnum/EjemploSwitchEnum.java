package POO.Ejemplos.ParametrizarConEnum;

public class EjemploSwitchEnum {
    public static void main(String[] args) {

        /** Creamos un Coche */
        CochesPSA citroen = new CochesPSA(MarcasPSA.CITROEN, Colores.NEGRO);

        /** preguntamos sobre un elemento tipo enum del coche (el color) **/
        Colores coloresCoche = citroen.getColor();

        switch (coloresCoche){
            case AZUL -> System.out.println("El coche es de color del mar");
            case ROJO -> System.out.println("EL color de la pasión");
            case ROSA -> System.out.println("Infravalorado por los MachoMan de mierda");
            case NEGRO -> System.out.println("El más elegante de todos");
            case VERDE -> System.out.println("Asociado con la esperanza y lo natural");
            case BLANCO -> System.out.println("EL seguro antes era más barato con este color");
            case CELESTE -> System.out.println("Inspira lo divino y celestial");
            case VIOLETA -> System.out.println("Un color muy original y moderno");
        }
    }
}
