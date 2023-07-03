package ClaseString;

public class RendimientoConcatenacion {
    public static void main(String[] args) {
        /**
         * VAMOS A COMPARAR EL RENDIMIENTO ENTRE
         * --> LA FUNCIÓN CONCAT
         * --> EL OPERADOR +
         * --> LA CLASE STRINGBUILDIER
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

        long fin = System.currentTimeMillis();
        System.out.println(sb.toString());
        System.out.println("Milisegundos invertidos --> "+(fin - inicio));

        /**
         * CONCAT()   --> LA MEDIA ES DE  2 MILISEGUNDOS (a mayor cantidad menos eficiente)
         * OPERADOR + --> LA MEDIA ES DE 13 MILISEGUNDOS (a mayor cantidad más eficiente)
         * STRINGBUILDIER() --> 0 ms (siempre es muy eficiente)
         * */

    }
}
