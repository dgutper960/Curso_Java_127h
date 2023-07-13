package ClaseSystem;

public class ManejoDeErrores2 {
    public static void main(String[] args) {
        /**
         * EJEMPLO PARA CUANDO NUESTRO PROGRAMA CARGA MUCHO LA MEMORIA
         * --> Podemos invocar al recolector de basura de forma explícita
         * --> Usaremos el ejemplo del tests de .concat()
         * */
        //CREAMOS STRING
        String a = "a";
        String b = "b";
        String c = a;

        // CREAMOS LA INSTANCIA DE STRINGBULDIER
        StringBuilder sb = new StringBuilder();

        // Vamos a concatenar 500 veces y a medir los milisegundos que tarda

        //creamos variable para medir el CurrentTime del inicio
        long inicio = System.currentTimeMillis();

        // le damos caña al for para concatenar
        for (int i = 0; i <= 500; i++){
            //c = c.concat(a).concat(b).concat("\n")
            // c = c + a + b + "\n";
            sb.append(a).append(b).append("\n");
        }

        /** INVOCAMOS AL RECOLECTOR DE BASURA DE FORMA EXPLÍCITA */
        System.gc(); /** Agilizamos el proceso automático **/

        long fin = System.currentTimeMillis();
        System.out.println(sb.toString());
        System.out.println("Milisegundos invertidos --> "+(fin - inicio));


    }
}
