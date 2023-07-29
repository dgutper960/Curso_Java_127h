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
        poemario.addPagina(new Pagina("Poema 1"));
        poemario.addPagina(new Pagina("Poema 2"));
        poemario.addPagina(new Pagina("Poema 3"));
        poemario.addPagina(new Pagina("Poema 4"));
        poemario.addPagina(new Pagina("Poema 5"));

        /** AL USAR EL MÉTODO IMPRIMIR NOS DA ERROR
         * PORQUE LIBRO NO HEREDA DE LA CLASE ABSTRACTA Y POR LO TANTO NO CUMPLE EL CONTRATO
         * DEBEMOS IMPLEMENTAR LA INTERFACE IMPRIMIBLE Y HACER QUE TODOS LOS ELEMENTOS LA IMPLEMENTEN
         * --> Una vez hecho lo anterior, ya podemos usar imprimir() con un objeto Libro **/
        imprimir(poemario);

    }

    /** Cambiamos la entrada del método para que todos los elementos sean del tipo Imprimible **/
    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
