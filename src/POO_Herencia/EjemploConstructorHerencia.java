package POO_Herencia;

public class EjemploConstructorHerencia {
    public static void main(String[] args) {

        /** CUANDO INVOCAMOS EL CONSTRUCTOR DE UNA CLASE EXTENDS,
         * POR DETRÁS SE INVOCAN LOS CONSTRUCTORES DE LAS CLASES SUPER
         *
         * --> Si tó está por defecto, se invocan en la jerarquía de forma automática
         * --> Si personalizamos los constructores y hay uno en la cadena que no esté vacío,
         *     este deberá ser llamado de forma explícita por el siguiente **/

        /** Si creamos un alumnoInternacional se van a lanzar los constructores previos **/
        System.out.println("Creando alumno con constructor sin parámetros");
        AlumnoInternacional frank = new AlumnoInternacional();
        frank.setNombre("Frank");
        frank.setApellidos("Sezan");
        frank.setPais("Cameron");
        frank.setEdad(41);
        System.out.println("Datos de Frank = " + frank);

        System.out.println("Creando Persona con constructor con parámetros");
        Persona persona1 = new Persona("Paco", "Gonzalez");
        persona1.setEdad(43);
        persona1.setEmail("paco@paco.com");


        System.out.println("Creando Alumno constructor con parámetros");
        Alumno alumno1 = new Alumno("Lucía", "Pérez", 23, "luciaper@correo.es", "IES Almunia");
        alumno1.setNotasHistoria(7.8);
        alumno1.setNotasMatematicas(5.9);
        alumno1.setNotasLengua(8);

        System.out.println("Creando AlumnoInternacional con parámetros");
        AlumnoInternacional alumInt1 = new AlumnoInternacional("Delia", "Jackson", "IES Los Linares", "Filipinas");
        System.out.println("alumInt1 = " + alumInt1);
        alumInt1.setEdad(30);
        alumInt1.setNotaIdiomas(8.7);
        alumInt1.setNotasLengua(6.4);
        alumInt1.setNotasMatematicas(9.6);
        alumInt1.setNotasHistoria(7.4);

        Profesor prof1 = new Profesor("David", "Gutiérrez Pérez", 42, "LMSGI/PROG");

        System.out.println("================================");
        imprimirDetalles(persona1);
        System.out.println("================================");
        imprimirDetalles(alumno1);
        System.out.println("================================");
        imprimirDetalles(alumInt1);
        System.out.println("================================");
        imprimirDetalles(prof1);
        System.out.println("================================");



    }

    /*** CREAMOS UN MÉTODO DE PRUEBA QUE SEA COMO UNA ESPECIE DE toString GENÉRICO PARA TODA LA FAMILIA **/
    public static void imprimirDetalles(Persona persona){
        double media;
        double mediaInt;
        System.out.println("> Datos relacionados con la persona <\n" +
                persona.getNombre()+" "+persona.getApellidos()+
                "\nEdad "+ persona.getEdad()+
                "\nCorreo "+persona.getEmail());
        if (persona instanceof Alumno){
            media = (((Alumno) persona).getNotasLengua()+ ((Alumno) persona).getNotasMatematicas()+ ((Alumno) persona).getNotasHistoria())/3;
            System.out.println("> Datos de Alumno <" +
                    "\nNota Media "+media);
            if (persona instanceof AlumnoInternacional) {
                mediaInt = (((AlumnoInternacional) persona).getNotasMatematicas()+
                        ((AlumnoInternacional) persona).getNotasLengua()+
                        ((AlumnoInternacional) persona).getNotasHistoria()+
                        ((AlumnoInternacional) persona).getNotaIdiomas())/4;
                System.out.println("> Datos de AlumnoInternacional <" +
                        "\nPais "+ ((AlumnoInternacional) persona).getPais()+
                        "\nNota Idiomas "+ ((AlumnoInternacional) persona).getNotaIdiomas()+
                        "\nNota Media "+mediaInt);
            }
        }
        if (persona instanceof Profesor){
            System.out.println("-> Datos de Profesor" +
                    "\nAsignatura "+ ((Profesor) persona).getAsignatura());
        }
    }
}
