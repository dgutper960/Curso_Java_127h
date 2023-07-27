package POO_Herencia;

public class Main {
    public static void main(String[] args) {
        /** CREAMOS ALUMNOS Y PROFESORES ACCEDIENDO DIRECTAMENTE A LOS GETTERS Y SETTERS HEREDADOS **/
        Alumno alumno1 = new Alumno();//en este momento constructor no sobreescrito
        alumno1.setNombre("Abelardo");
        alumno1.setApellidos("Ordóñez Fernandez");
        alumno1.setEdad(34);
        alumno1.setColegio("IES Las Cumbres");
        alumno1.setNotasLengua(7.8);
        alumno1.setNotasMatematicas(6.9);
        alumno1.setNotasHistoria(8.1);

        /** Cuando una clase hereda de otra se puede usar como el mismo tipo en el constructor **/
        Persona alumno2 = new Alumno();
        alumno2.setNombre("Adrián");
        /** Pero, en este caso, solo son accesibles los métodos y atributos de persona */
//      alumno2.setColegio("IES Los Remedios"); ERROR!!
        /** Para conseguir esto, necesitamos hacer un cast del tipo objeto **/
        ((Alumno)alumno2).setColegio("IES Los Remedios");
        //AUNQUE ESTÉ INICIALIZADO, PARA IMPRIMIR, LO MISMO HAY QUE HACER EL CAST
        System.out.println("El instituto de "+alumno2.getNombre()+" es el "+((Alumno) alumno2).getColegio());

        /** Podemos hacer lo mismo con los ancestros **/
        Object alumno3 = new Alumno();
        ((Alumno)alumno3).setNombre("Ana");

        Profesor profesor1 = new Profesor();
        profesor1.setNombre("Rocío");
        profesor1.setApellidos("Gutiérrez Aguilera");
        profesor1.setEmail("rocioHistoria@correo.es");
        //POR SUPUESTO TAMBIÉN ATRIBUTOS PROPIOS Y DE LA CLASE OBJECT
        profesor1.setAsignatura("Historia");
        Profesor profesor2 = new Profesor();
        System.out.println(profesor2.equals(profesor1)); //false
        System.out.println(profesor1.getNombre()+" "+profesor1.getApellidos()+", profesora de "+profesor1.getAsignatura());

        /** Ahora tenemos a AlumnoInternacional que hereda de Alumno **/
        AlumnoInternacional alumnoInt1 = new AlumnoInternacional();
        alumnoInt1.setNombre("Sonya");
        alumnoInt1.setApellidos("Martins");
        alumnoInt1.setEdad(28);
        alumnoInt1.setPais("Australia");
        alumnoInt1.setColegio("IES Las Cumbres");
        alumnoInt1.setNotasLengua(7.8);
        alumnoInt1.setNotasMatematicas(9.1);
        alumnoInt1.setNotasHistoria(5.9);
        alumnoInt1.setNotaIdiomas(7.7);
        System.out.println("alumnoInt1 = " + alumnoInt1);

        /** VAMOS A ITERAR CON UN WHILE PARA VER LA JERARQUÍA DE CLASES LA INSTANCIA AlumnoInt1 **/
        // Class es un objeto que toma los metadatos de una instancia
        Class clase = alumnoInt1.getClass(); // TOMAMOS LA CLASE CON EL MÉTODO DE OBJECT
        System.out.println("\nObteniendo jerarquía de clases de alumnoInt1\n");
        // ITERAMOS CON UN WHILE MIENTRAS LAS SUPERCLASS NO SEA NULL
        while (clase.getSuperclass() != null){
            System.out.println("Nombre Clase Actual = "+clase.getName()+
                    "\nNombre clase Padre = "+clase.getSuperclass()+
                    "\n--------------------------------\n");
            // PARA SEGUR ITERANDO, CAMBIAMOS EL VALOR DE CLASE A LA SUPERCLASE
            clase = clase.getSuperclass();
        }

    }
}
