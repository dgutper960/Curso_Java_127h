package API_Collection.HashSet;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetDuplicados {
    public static void main(String[] args) {

        /** Creamos un array de String */
        String[] peces = {"Corvina", "Merluza", "Lenguado", "Corvina", "Boquerón", "Bacalao"};
        // Corvina está repetido

        /**  Iteramos para rellenar una lista con los elementos del array
         * --> Cuando no lo añada por estar duplicado vamos a obtener el valor **/
        Set<String> listaPeces = new HashSet<>();
        for (String pez: peces){
            // Recordamos que el if evalúa una expresión booleana
            if (!listaPeces.add(pez)){ // EL método add retorna un booleano (negando la expresión, retorna true cuando no lo incluya)
                System.out.println("pezDuplicado = " + pez);
            }
        }
        System.out.println("Num de peces en el array --> "+peces.length+
                "\nNum de peces en la lista --> "+listaPeces.size()+
                "\nlistaPeces --> " + listaPeces);

        /** Siguiendo esta lógica como ejercicio de repaso, vamos a generar 100 números aleatorios y vamos a
         * rellenar un set con números que salen una vez y otro set con números que se han repetido **/
        Set<Byte> nuevos = new HashSet<>();
        Set<Byte> repetidos = new HashSet<>();
        byte[] numbers = new byte[100];
        for (byte num: numbers){
            num = (byte)(Math.random()*100);
            if (!nuevos.add(num)){
                repetidos.add(num);
            }
        }
        // podemos eliminar de nuevos los que hayan salido duplicados
        nuevos.removeAll(repetidos); // para obtener dos listas completamente diferentes
        System.out.println("nuevos = " + nuevos);
        System.out.println("repetidos = " + repetidos);
    }

}
