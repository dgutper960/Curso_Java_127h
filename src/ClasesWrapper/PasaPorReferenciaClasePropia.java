package ClasesWrapper;

/** CREAMOS LA CLASE PERSONA PARA ESTE EJEMPLO */
class Persona {
    /** atributos de persona privados (visibilidad de clase) */
    private String nombre;

    /** Añadimos un método público para que pueda ser manipulado desde fuera del objeto */
    public void alterNombre(String nuevoNombre){
        this.nombre = nuevoNombre; // this se refiere al nombre de esta clase, en caso de ambigüedad
    }

    public String mostrarNombre(){

        return this.nombre; // al hacer esto la variable de la clase se activa
    }
}

public class PasaPorReferenciaClasePropia {
    public static void main(String[] args) {

    /**
     * PARA ESTE EJEMPLO SE HA CREADO UNA CLASE EN ESTE MISMO ARCHIVO
     * POR LO GENERAL SE HARÍA EN UN ARCHIVO APARTE PERO ASÍ ES MÁS VISIBLE
     * */

    /** Creamos ina instancia de Persona */
    Persona persona1 = new Persona();

    /** Usamos el método de persona para darle nombre */
    persona1.alterNombre("David");

    /** Imprimimos el nombre para saber como se llama, pero no podemos porque la variable es privada
     * necesitamos un método que nos lo muestre, lo creamos en la clase persona y ya podemos  */
        System.out.println("La persona1 inicialmente se llama "+persona1.mostrarNombre());

        /** DEFINIMOS UN MÉTODO QUE MODIFICA EL NOMBRE
         * lo llamamos y usamos el nombre de persona como entrada */
        cambioNombre(persona1);

        /** IMPRIMIMOS EL NOMBRE CUANDO ACABA EL MAIN */
        System.out.println("La persona1 finalmente se llama "+persona1.mostrarNombre());


    }

    /** Debemos pensar en que persona1 es del tipo Persona  */
    public static void cambioNombre(Persona persona1){
        System.out.println("El nombre inicial al test es " + persona1.mostrarNombre());
        persona1.alterNombre("Don David");
        System.out.println("El nombre final al test es "+persona1.mostrarNombre());
    }
}
