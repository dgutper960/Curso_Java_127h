package Matrices;

public class BuscarElementos {
    public static void main(String[] args) {

        /** INICIALIZAMOS MATRIZ DE UNA FORMA MÁS VISUAL **/
        int[][] matriz = {
                {16,98,12,784},
                {59,95,784,14},
                {97,5,741,16}
        };

        /** Declaramos número a buscar */
        int buscado = 95;
        /** Booleano para poner a true si lo encuentra */
        boolean encontrado = false;
        int contador = 0;

        /** buscamos con for */
        buscar: for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                contador++;
                if (matriz[i][j] == buscado){
                    encontrado = true;
                    break buscar; //USAMOS ETIQUETE PARA QUE SE SALGA DE LOS DOS FOR
                }
            }
        }
        System.out.println("contador1 = " + contador);
        System.out.println("encontrado = " + encontrado);

        /**
         * SI QUEREMOS USAR LAS COORDENADAS i j DEBEMOS INICIALIZARLAS FUERA DE LOS FOR
         * **/

        String[][] nombres = {
                {"Maria", "Josefina", "Antonio Jesus"},
                {"Luis Alberto", "Francisco"}
        };

        String nombreBuscado = "maria";
        contador = 0;
        buscar: for (String[] fila:nombres) {
            for (String nombre : fila){
                contador++;
                if (nombre.equalsIgnoreCase(nombreBuscado)){
                    encontrado = true;
                    break buscar;
                }
            }
        }
        System.out.println("contador2 = " + contador);
        System.out.println("encontrado = " + encontrado);


    }
}
