package API_Collection.Set.EjemploTreeSetComparable;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private Double nota;

    public Alumno() {
    }

    public Alumno(String nombre, Double nota) {
        this();
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + " " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(nota, alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }

    @Override
    public int compareTo(Alumno o) {
        // Si el campo pudiese ser null, hay que evitar el NullPointException
        if (this.nota == null){
            return 0;
        }
        // Si nota es de tipo primitivo hay que pasarlo a Referencia de alguna forma
        return this.nota.compareTo(o.nota);
    }


}
