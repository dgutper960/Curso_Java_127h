package TiposGenericos.InterfacesCRUB.Generic_InterfacesCRUB.modelo;

import java.util.Objects;

/**
 * ESTA CLASE REPRESENTARÁ LA TABLE CLIENTE
 * ***/
public class Cliente {

    private static int ultimoId;
    private Integer id;
    private String nombre;
    private String apellidos;

    public Cliente() {
        this.id = ++ultimoId;
    }

    public Cliente(String nombre, String apellidos) {
        this();
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\nCliente id=" + id +
                "\n" + nombre + " " + apellidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
