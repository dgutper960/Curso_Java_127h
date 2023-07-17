package Arrays;

/**
 * VAMOS A CREAR UN MÉTODO ESTÁTICO QUE NOS SIRVA PARA BUSCAR UN ELEMENTO DENTRO DE UN ARRAY
 * Como entrada un array del tipo que sea, un elemento a buscar
 * **/

/**
 * IMPLEMENTAR OTRO MÉTODO CON WHILE
 * PARA STRING CON IGNORE-CASE
 * QUE ADMITA CUALQUIER TIPO DE DATO COMO ENTRADA
 * QUE PARE DE BUSCAR POR LA CONDICIÓN DEL WHILE
 * **/

public class BuscarIndiceArray {
    public static void main(String[] args) {

        String[] palabras = {"fresa", "pero", "David", "Muñeca"};
        Integer[] numeros = {28,92,3,89,7,10,14,39,54,17,21};
        buscarElementoArray(numeros, 236);
        buscarElementoArray(palabras, "David");

    }

    public static void buscarElementoArray(Object[] array, Object buscado){
        int max = array.length;
        int control = 0;
        for (int i = 0; i< max; i++){
            if(array[i].equals(buscado)){
                System.out.println("El elemento "+buscado+" se encuentra en el índice "+i);
                control++;
                break;
            }
        }
        if (control == 0){
            System.out.println("El elemento buscado no se encuentra en el array");
        }
    }

}
