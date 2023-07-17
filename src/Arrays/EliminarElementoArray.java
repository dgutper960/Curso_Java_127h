package Arrays;

public class EliminarElementoArray {
    public static void main(String[] args) {
        /**
         * SE REQUIERE ELIMINAR UN ELEMENTO DADO DE UN ARRAY SIN DEJAR EL HUECO OPORTUNO
         * **/
        int[] numeros = {1,2,3,4,5,6,7,8};
        int[] newNumeros = new int[numeros.length-1];
        int delete = 4;
        int pos = 0;
        int max1 = numeros.length;
        int max2 = newNumeros.length;

        for (int i =0; i<max1; i++){
            if (numeros[i] == delete){
                pos = i;
                break;
            }
        }
        for (int i =0; i < pos; i++){
            newNumeros[i] = numeros[i];
        }

        for (int i = pos; i<max2; i++){
            newNumeros[i] = numeros[i+1];
        }

        for (int n:
             newNumeros) {
            System.out.println("n = " + n);

        }

        /*** VEAMOS COMO LO HA HECHO EL PROFESOR **/

    }
}
