package Matrices;

public class MarcoAsteriscos {
    public static void main(String[] args) {
        /**
         *  VAMOS A PINTAR EL MARCO DE LA MATRIZ CON ASTERISCOS
         * **/

        String[][] marco = new String[10][17];

        /** Jugaremos con los índices o y length de las filas y columnas */
        for (int i =0; i< marco.length; i++){
            for (int j = 0; j < marco[i].length; j++){
                if (i == 0 || i == marco.length -1 ||
                        j == 0 || j == marco[i].length -1){
                    marco[i][j] = "*";
                } else {
                    marco[i][j] = " ";
                }
            }
        }

        for (String[] fila: marco){
            for (String pos : fila){
                System.out.print(pos+"\t");
            }
            System.out.println();
        }


    }
}
