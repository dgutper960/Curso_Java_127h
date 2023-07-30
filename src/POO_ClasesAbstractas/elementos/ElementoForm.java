package POO_ClasesAbstractas.elementos;

import POO_ClasesAbstractas.form.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    // añadiremos un método addValidador()
    private List<Validador> validadores; // lista de validadores
    private  List<String> errores; // lista para almacenar posibles errores


    //el nombre solo entra por constructor
    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }
    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }
    //el valor solo entra por set
    public void setValor(String valor) {
        this.valor = valor;
    }
    //métodos abstractos solo se pueden implementar en clases abstractas

    // Método para añadir validadores encadenados
    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    // get errores
    public List<String> getErrores() {
        return errores;
    }

    // Pasamos el valor por la Lista ve Validadores con un foreach
    public boolean esValido() {
        for (Validador v : this.validadores) {
            if (!v.esValido(valor)) { // si uno no se cumple, se añade el respectivo mensaje a la lista de errores
                this.errores.add(v.getMensaje());
                return false;
            }
        }
        return errores.isEmpty(); // si la lista esta vacía retorna true, todos los validadores han resuelto true
    }

        /** Por convención los métodos abstractos van al final **/
        abstract public String dibujarHTML ();

}
