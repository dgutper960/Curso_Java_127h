package POO_Interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{

    private String persona;
    private String carrera;

    private List<String> experiencias;


    public Curriculum(String contenido, String persona, String carrera) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencia(String experiencia){
        experiencias.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ").append(persona)
                .append("\nProfesión: ").append(carrera)
                .append("\nExperiencia\n");
        int num = experiencias.size();
        for (String e: this.experiencias){
            sb.append(num)
                    .append(". ")
                    .append(e)
                    .append("\n");
            num--;
        }
        return sb.toString();
    }
}
