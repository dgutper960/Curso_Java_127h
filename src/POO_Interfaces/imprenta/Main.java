package POO_Interfaces.imprenta;

import POO_Interfaces.imprenta.modelo.*;

import static POO_Interfaces.imprenta.modelo.Genero.*;

public class Main {
    public static void main(String[] args) {

        /** creamos un curriculum **/
        Curriculum cv = new Curriculum("CV developer", "David Gutiérrez", "Desarrollo Aplicaciones Web");
        cv.addExperiencia("HTML")
                .addExperiencia("CSS")
                .addExperiencia("Bases de Datos Relacionales")
                .addExperiencia("SQL")
                .addExperiencia("Java")
                .addExperiencia("Bases de Datos no relacionales")
                .addExperiencia("PHP")
                .addExperiencia("JavaScript")
                .addExperiencia("TypeScript");


        imprimir(cv);

        System.out.println("\n================================================\n");

        /** Creamos un informe */
        Informe informe = new Informe("David y Daniel", "JCRomero",
                "Estudio sobre el funcionamiento de John the Ripper");

        imprimir(informe);

        System.out.println("\n================================================\n");

        /** Creamos libro y añadimos páginas */
        Libro poemario = new Libro("Autores Generación del 27", "Escribir en tiempos revueltos", POESIA);
        poemario.addPagina(new Pagina("Poema 1"))
        .addPagina(new Pagina("Poema 2"))
        .addPagina(new Pagina("Poema 3"))
        .addPagina(new Pagina("Poema 4"))
        .addPagina(new Pagina("Poema 5"));

        /** AL USAR EL MÉTODO IMPRIMIR NOS DA ERROR
         * PORQUE LIBRO NO HEREDA DE LA CLASE ABSTRACTA Y POR LO TANTO NO CUMPLE EL CONTRATO
         * DEBEMOS IMPLEMENTAR LA INTERFACE IMPRIMIBLE Y HACER QUE TODOS LOS ELEMENTOS LA IMPLEMENTEN
         * --> Una vez hecho lo anterior, ya podemos usar imprimir() con un objeto Libro **/
        imprimir(poemario);

        System.out.println("===============================================");

        /** Usamos el método estático de la interfaz */
        Imprimible.imprimirStatic(informe);

        /** Imprimimos lo constante de Imprimible **/
        System.out.println(Imprimible.TEXTO_POR_DEFECTO);

        /** Implementamos clase anónima de Imprimible al vuelo **/
        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Texto implementado para clase anónima";
            }
        });
        // LO DE ARRIBA EN EXPRESIÓN LAMBDA QUEDA ASÍ:
        imprimir(() -> "Texto implementado para clase anónima");
    }

    /** Cambiamos la entrada del método para que todos los elementos sean del tipo Imprimible **/
    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    } /** PODRÍAMOS HABER DEFINIDO ESTE MÉTODO COMO ESTÁTICO EN IMPRIMIBLE
     Y NOS AHORRAMOS ESTE PASO EN LOS MAIN DE CADA IMPLEMENTACIÓN **/
}
