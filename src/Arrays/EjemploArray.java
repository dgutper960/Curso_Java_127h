package Arrays;

public class EjemploArray {
    public static void main(String[] args) {
        /**
         * LOS ARRAY NOS PERMITEN ALMACENAR VARIOS ELEMENTOS EN UNA VARIABLE
         * PUEDEN SER DE CUALQUIER TIPO O INSTANCIA DE OBJETO
         * TODOS LOS ELEMENTOS DE UN ARRAY DEBEN SER DEL MISMO TIPO
         * **/
        
        /* Declaramos con operador new, hay que decir el tamaño **/
        int[] numbers = new int[8]; 
        /* los índices no inicializados serán null o 0 
         * para acceder, o inicializar es mediante el índice */
        numbers[2] = 34;
        System.out.println("numbers[2] = " + numbers[2]);
        System.out.println("numbers[1] = " + numbers[1]);
        
        /* Declaramos mediante llaves, se introducen los valores directamente */
        String[] nombres = {"Juan", "Paco", "Pedro", "Roberto", "Monica", "Luisa", "Angela"};
        System.out.println("nombres[3] = " + nombres[3]);
        System.out.println("nombres[nombres.length] = " + nombres[nombres.length-1]);
        // Si actualizamos un valor, el anterior se machaca para siempre
        nombres[0] = "David";
        
        /* Podemos recorrer un array con un for */
        int maxNombres = nombres.length;
        for (int i=0; i < maxNombres; i++ ){
            System.out.println("indice nombres "+i+" valor  = " + nombres[i]);
        }
        
        /* Con un foreach */
        for (String n:nombres) {
            if(n.equalsIgnoreCase("Luisa")){
                n = "Lucía";
            }
            System.out.println("n = " + n);
            }
        }
}
