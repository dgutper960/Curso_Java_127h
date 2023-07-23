package POO.Ejemplos.ParametrizarConEnum;

public class IterandoEnum {
    public static void main(String[] args) {
        /**
         * LOS OBJETOS ENUM SE PUEDEN ITERAR A MODO DE ARRAY
         * */

        /** Creamos un array de los colores en la clase enum Colores
         * --> Con el método values accedemos a los valores del Enum Colores **/
        Colores[] colores = Colores.values();

        int contador = 0;
        String colorBuscado = "violeta";

        for (Colores color: colores){
            System.out.println(color);
            contador++;
            if (color.getColor().equalsIgnoreCase(colorBuscado)){
                System.out.println("EL color se ha encontrado");
                break;
            }
        }
        System.out.println("contador de vueltas = " + contador);

    }
}
