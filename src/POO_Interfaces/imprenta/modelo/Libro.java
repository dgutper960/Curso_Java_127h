package POO_Interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Nuestro modelo se complica si queremos imprimir un libro
 * --> No podemos hacer que Libro herede de hoja porque no es Hoja, sino que tiene hojas
 * --> Podemos hacer que el libro tenga páginas que a su vex hereden de Hoja
 * --> El libro tendrá una lista de páginas que son del tipo Hoja
 * **/
public class Libro implements Imprimible {

    private List<Imprimible> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible pagina){
        paginas.add(pagina);
        return this;
    }

    /** Nos falta el método imprimir pero libro no hereda de hoja **/

    @Override
    public String imprimir(){
        StringBuilder sb = new StringBuilder("Título ")
                .append(this.titulo)
                .append("\nAutor ")
                .append(this.autor)
                .append("\nGenero ")
                .append(this.genero)
                .append("\nNum Páginas ")
                .append(paginas.size());
        for (Imprimible pagina: paginas){
            sb.append(pagina.imprimir()) /** Ahora en página si tenemos el método imprimir */
                    .append("\n");
        }
        return sb.toString();
    }
    /**
     * HASTA AQUÍ BIEN PERO SI VAMOS A MAIN Y USAMOS EL MÉTODO ESTÁTICO imprimir(libro)
     * A DIFERENCIA DE CV E INFORME NOS VA A DAR ERROR
     * NO ESTAMOS CUMPLIENDO EL CONTRATO DE LA CLASE ABSTRACTA, YA QUE LIBRO NO HEREDA DE HOJA
     * --> LA SOLUCIÓN SERÍA CREAR UNA INTERFAZ IMPRIMIBLE
     * -> Creamos la interfaz Imprimible
     * -> Creamos el método imprimir()
     * -> Hacemos que todos los elementos de nuestro modelo implementen la interfaz
     * -> En el caso de Página, debemos cambiar el tipo Hoja al más genérico (Imprimible)
     * -> Ahora podemos imprimir libro, porque todos los elementos involucrados del modelo implementan la interfaz
     * **/
}
