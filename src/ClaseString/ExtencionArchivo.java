package ClaseString;

public class ExtencionArchivo {
    public static void main(String[] args) {

        /**
         * VAMOS A EXTRAER LA EXTENSIÓN DE CUALQUIER ARCHIVO
         * */

        //DECLARAMOS ARCHIVOS DE EJEMPLO
        String archivo1 = "Foto en el río.png";
        String archivo2 = "documento.renta.21.pdf";
        String archivo3 = "Tarea de FOL.docx";
        // anidamos .lastIndexOf() para obtener la posición del punto dentro de substring() que extraerá desde ahí hasta el final
        // destacamos que si no queremos extraer también el punto, debera sumarse +1 a lo qu devuelve lastIndexOf()
        System.out.println("archivo1.substring(archivo1.lastIndexOf(\".\")) = " + archivo1.substring(archivo1.lastIndexOf(".")+1)); //sin punto
        System.out.println("archivo2.substring(archivo1.lastIndexOf(\".\")) = " + archivo2.substring(archivo2.lastIndexOf("."))); // con punto
        System.out.println("archivo3.substring(archivo3.lastIndexOf('.')) = " + archivo3.substring(archivo3.lastIndexOf('.')));
        // sirve en todos los casos y podemos declarar variable con las funciones anidadas
        String extArchivo1 = archivo1.substring(archivo1.lastIndexOf(".")+1);
        System.out.println("extArchivo1 = " + extArchivo1);

        /** De esta forma nos toma el punto y la propuesta del profesor ha sido: */

        int i = archivo1.lastIndexOf('.');
        System.out.println("archivo1.substring(i+1) = " + archivo1.substring(i+1)); /** igualmente, se puede hacer con las funciones anidadas */

    }
}
