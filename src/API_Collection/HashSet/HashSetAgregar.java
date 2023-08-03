package API_Collection.HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class HashSetAgregar {
    public static void main(String[] args) {


        /** Vamos a crear una colección HashSet de String */
        HashSet<String> hashSet = new HashSet<>();
        // AGREGAMOS UN ELEMENTO
        hashSet.add("1. Manolito el Egipcio");
        hashSet.add("2. Pepe García");
        hashSet.add("3. Rocía Muñoz");
        hashSet.add("4. Ruiz Castro");
        hashSet.add("5. Federico Milan");
        // IMPRIMIMOS EL HashSet directamente
        System.out.println(hashSet);
        /** VEMOS QUE EL SET NO ES ORDENADO
         * --> TAMPOCO SE PUEDE ORDENAR DE FORMA EXPLÍCITA **/
        // Collections.sort(hashSet);//ERROR!!
        /** Para ordenar debe ser convertido a List */
        List<String> stringList = new ArrayList<>(hashSet);
        stringList.add("2. Pepe García"); //Lista permite Duplicados
        Collections.sort(stringList); // Lista permite ordenar
        System.out.println(stringList);

        hashSet.add("2. Pepe García");
        System.out.println(hashSet);
        /** NO ADMITE ELEMENTOS DUPLICADOS **/


    }
}
