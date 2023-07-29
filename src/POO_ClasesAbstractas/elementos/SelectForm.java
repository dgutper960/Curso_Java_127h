package POO_ClasesAbstractas.elementos;

import POO_ClasesAbstractas.elementos.select.Option;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

    List<Option> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList</*Asume el tipo auto*/>(); // INICIALIZAMOS EL ARRAYLIST
    }

    public SelectForm(String nombre, List<Option> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    //PARA AÑADIR DE FORMA ENCADENADA RETORNAMOS EL TIPO DE LA CLASE
    public SelectForm addOption(Option option){
        this.opciones.add(option); //método add() de List y tamaño dinámico
        return this; //Y RETORNAMOS this
    }

    //PARA ESTE MÉTODO VAMOS A USAR UN StringBuilder Y UN FOR PARA ITERAR EN EL List
    @Override
    public String dibujarHTML() {
        StringBuilder sb = new StringBuilder("<select ");//ABRIMOS SELECT
        sb.append("name='")
                .append(this.nombre)
                .append("'>");
        // ITERAMOS SOBRE EL ELEMENTO SELECT Y MOSTRAR LAS OPCIONES
        for (Option opcion: opciones){
            sb.append("\n<option value='") // ABRIMOS OPTION
                    .append(opcion.getId())
                    .append("'");
            if (opcion.isSelected()) {
                sb.append(" selected"); // BANDERA SI OPCIÓN SELECCIONADA
                this.valor = opcion.getId(); // PARA MOSTRAR EL VALOR DE LA OPCIÓN SELECCIONADA
            }
            sb.append(">").append(opcion.getNombre())
                    .append("</option>"); // CERRAMOS OPTION
        }
        sb.append("\n</select>"); //CERRAMOS SELECT
        return sb.toString(); // RETORNO sb.toString()
    }
}
