package ModificadorAccesoPackage.Jardin;

import ModificadorAccesoPackage.Hogar.Persona;

import static ModificadorAccesoPackage.Hogar.Persona.*;

public class Main {
    public static void main(String[] args) {


        Perro pluto = new Perro();
        pluto.nombrePerro = "Pluto";
        pluto.razaPerro = "Podenco";

        Persona martin = new Persona();
        martin.setNombre("Martin");

        Persona maria = new Persona();
        maria.setNombre("María");

        //MARÍA VE AL PERRO DESDE FUERA DEL JARDÍN
        System.out.println(maria+" ha visto que el perro "+pluto.nombrePerro+" es de la raza "+pluto.razaPerro);

        //MARTÍN VA AL JARDÍN A JUGAR CON PLUTO
        System.out.println("martin.jugarConPero() = " + martin.jugarConPero());
        System.out.println("pluto.jugarConPersona(martin) = " + pluto.jugarConPersona(martin));
        System.out.println("pluto.entrarPorLluvia() = " + pluto.entrarPorLluvia());

        //SI LO HACEMOS ASÍ, SERÍA COMO IMPORTAR LA CLASE
        System.out.println(Persona.saludar());
        //PERO AL IMPORTAR EL STATIC LO USAMOS COMO SI FUESE DE LA PROPIA CLASE
        System.out.println(saludar());
        //TAMBIÉN CON UNA VARIABLE
        String saludoPersona = saludar();
        System.out.println("saludoPersona = " + saludoPersona);
        /** LO MISMO SI IMPORTAMOS ATRIBUTOS ESTÁTICOS **/
        String hombre = GENERO_MASCULINO;
        String mujer = GENERO_FEMENINO;
        System.out.println("hombre = " + hombre);
        System.out.println("mujer = " + mujer);



    }
}
