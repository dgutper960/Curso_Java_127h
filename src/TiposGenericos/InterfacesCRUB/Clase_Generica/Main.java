package TiposGenericos.InterfacesCRUB.Clase_Generica;

import java.util.List;

/**
 * HEMOS COPIADO EL PROYECTO DE Clase_NoGenerica
 * Y LA HEMOS COPIADO A ESTE PACKAGE PARA TORNAR A CLASES GENÉRICAS
 * **/

public class Main {
    public static void main(String[] args) {

        /*** A TENER EN CUENTA QUE Camion  NO ES UNA LISTA NI UN ARRAY
         * PERO LOS PODEMOS ITERAR PORQUE IMPLEMENTA Iterable
         *
         * AHORA DEBEMOS INDICAR EL TIPO DE OBJETO QUE VA EN CADA CAMIÓN
         * EVITANDO DE ESTA MANERA EL CAST **/

        /** Creamos la instancia de 1 Camión **/
        Camion<Animal> camionCaballos = new Camion<>(5);
        camionCaballos.addObjeto(new Animal("Pegaso", "Caballo"));
        camionCaballos.addObjeto(new Animal("WillyWonka", "Caballo"));
        camionCaballos.addObjeto(new Animal("Cometa", "Caballo"));
        camionCaballos.addObjeto(new Animal("Pancho", "Caballo"));
        camionCaballos.addObjeto(new Animal("Epona", "Caballo"));
        camionCaballos.addObjeto(new Animal("Sicario", "Caballo"));

        /** Mostramos el nombre de los caballos */
        int num = 1;
        for (Animal caballo: camionCaballos){// NO DEBEMOS HACER EL CAST PARA OBTENER EL GET DEL OBJETO
            System.out.println(caballo.getFamilia()+" "+num+".-> "+caballo.getNombre());
            num++;
        }

        /** Creamos la instancia de otro Camión **/
        Camion<Maquinaria> camionMaquinas = new Camion<>(3); // Admite 4 objetos
        camionMaquinas.addObjeto(new Maquinaria("Tuneladora"));
        camionMaquinas.addObjeto(new Maquinaria("Retro"));
        camionMaquinas.addObjeto(new Maquinaria("Bob Cat"));
        camionMaquinas.addObjeto(new Maquinaria("Carretilla Elevadora"));

        System.out.println("\n==============\n");

        /** Mostramos las máquinas */
        for (Maquinaria maquina: camionMaquinas ){
            System.out.println("maquina = " + maquina.getTipo());
        }

        /** Creamos la instancia de otro Camión **/
        Camion<Automovil> camionCohes = new Camion<>(4); // Admite 5 objetos
        camionCohes.addObjeto(new Automovil("Ford"));
        camionCohes.addObjeto(new Automovil("Toyota"));
        camionCohes.addObjeto(new Automovil("Dacia"));
        camionCohes.addObjeto(new Automovil("Cupra"));
        camionCohes.addObjeto(new Automovil("Tata"));


        System.out.println("\n==============\n");

        /** Mostramos las máquinas */
        for (Automovil coche: camionCohes ){
            System.out.println("coche = " + coche.getMarca());
        }

        /** AL IMPLEMENTAR CAMIÓN COMO GENÉRICO, HEMOS PODIDO METER COSAS DE DIFERENTES TIPOS
         * Y TRABAJAR SIN MAYORES PROBLEMAS  */
        imprimirCamion(camionCaballos);
        imprimirCamion(camionMaquinas);
        imprimirCamion(camionCohes);

    }

    /** SI QUISIÉRAMOS CREAR UN MÉTODO ESTÁTICO QUE TRABAJASE CON LOS OBJETOS DEL CAMIÓN
     * --> Debemos referenciar al Camión como genérico
     * --> Debemos hacer el cast con los objetos que transporta **/
    public static <T> void imprimirCamion(Camion<T> camion){
        System.out.println("\n==============\n");
        for (T objeto: camion){
            if (objeto instanceof Animal){
                System.out.println(((Animal)objeto).getFamilia()+" "+((Animal)objeto).getNombre());
            }
            if (objeto instanceof Maquinaria){
                System.out.println(((Maquinaria)objeto).getTipo());
            }
            if (objeto instanceof Automovil){
                System.out.println(((Automovil)objeto).getMarca());
            }
        }
        System.out.println("\n==============\n");
    }
}
