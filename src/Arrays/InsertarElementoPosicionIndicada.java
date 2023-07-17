package Arrays;

public class InsertarElementoPosicionIndicada {
    public static void main(String[] args) {

        int[] arrayNumeros = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,0};
        insertarEnPosicionIndicada(arrayNumeros, 245, 10);
    }

    public static void insertarEnPosicionIndicada(int[] original, int elemento, int posicion){

        int[] nuevo = new int[original.length];

        for(int i = 0 ; i< posicion; i++){
            nuevo[i] = original[i];
        }
        nuevo[posicion] = elemento;
        int nuevoI = posicion;
        for (int i = posicion+1; i< nuevo.length; i++){
            nuevo[i] = original[nuevoI++];
        }

        for (int n:
                nuevo) {
            System.out.println("n = " + n);

        }
    }
}
