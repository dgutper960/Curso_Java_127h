package TiposGenericos.InterfacesCRUB.Clase_NoGenerica;

public class Main {
    public static void main(String[] args) {

        /*** A TENER EN CUENTA QUE Camion  NO ES UNA LISTA NI UN ARRAY
         * PERO LOS PODEMOS ITERAR PORQUE IMPLEMENTA Iterable**/

        /** Creamos la instancia de 1 Camión **/
        Camion camionCaballos = new Camion(5);
        camionCaballos.addObjeto(new Animal("Pegaso", "Caballo"));
        camionCaballos.addObjeto(new Animal("WillyWonka", "Caballo"));
        camionCaballos.addObjeto(new Animal("Cometa", "Caballo"));
        camionCaballos.addObjeto(new Animal("Pancho", "Caballo"));
        camionCaballos.addObjeto(new Animal("Epona", "Caballo"));
        camionCaballos.addObjeto(new Animal("Sicario", "Caballo"));

        /** Mostramos el nombre de los caballos */
        int num = 1;
        for (Object objeto: camionCaballos){
            Animal a = (Animal) objeto; // DEBEMOS HACER EL CAST PARA OBTENER EL GET DEL OBJETO
            System.out.println(a.getFamilia()+" "+num+".-> "+a.getNombre());
            num++;
        }

        /** Creamos la instancia de otro Camión **/
        Camion camionMaquinas = new Camion(3); // Admite 4 objetos
        camionMaquinas.addObjeto(new Maquinaria("Tuneladora"));
        camionMaquinas.addObjeto(new Maquinaria("Retro"));
        camionMaquinas.addObjeto(new Maquinaria("Bob Cat"));
        camionMaquinas.addObjeto(new Maquinaria("Carretilla Elevadora"));

        System.out.println("\n==============\n");

        /** Mostramos las máquinas */
        for (Object object: camionMaquinas ){
            Maquinaria maquina = (Maquinaria) object;
            System.out.println("maquina = " + maquina.getTipo());
        }

        /** Creamos la instancia de otro Camión **/
        Camion camionCohes = new Camion(4); // Admite 5 objetos
        camionCohes.addObjeto(new Automovil("Ford"));
        camionCohes.addObjeto(new Automovil("Toyota"));
        camionCohes.addObjeto(new Automovil("Dacia"));
        camionCohes.addObjeto(new Automovil("Cupra"));
        camionCohes.addObjeto(new Automovil("Tata"));


        System.out.println("\n==============\n");

        /** Mostramos las máquinas */
        for (Object object: camionCohes ){
            Automovil coche = (Automovil) object;
            System.out.println("coche = " + coche.getMarca());
        }

        /** IMPLEMENTANDO DE ESTA FORMA, DEBEMOS HACER EL CAST Y TENEMOS MUCHAS POSIBILIDADES DE ERROR
         * UNA SOLUCIÓN PASARÍA POR IMPLEMENTAR CON TIPOS GENÉRICOS  */
    }
}
