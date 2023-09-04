package Recursividad.ejemplo;

import Recursividad.ejemplo.models.Componente;

public class EjemploRecursividad {
    public static void main(String[] args) {

        /** Vamos a construir un PC
         * --> Un PC está compuesto de componentes que a su vez están compuestos de otros componentes **/

        // CREAMOS DIFERENTES COMPONENTES
        Componente pc = new Componente("PC todoterreno");
        Componente caja = new Componente("Caja PC ATX");
        Componente fuente = new Componente("Fuente 700w");
        Componente placa = new Componente("Asus TUF AMD");
        Componente cpu = new Componente("AMD Rayzen 5 2800");
        Componente ventilador = new Componente("ventilador CPU");
        Componente disipador = new Componente("Disipador");
        Componente videoCard = new Componente("Nvidia TRX 4070 12GB");
        Componente gpu = new Componente("Nvidia GPU TRX");
        Componente gpuRam1 = new Componente("6GB Ram");
        Componente gpuRam2 = new Componente("6GB Ram");
        Componente gpuVentiladores = new Componente("Ventiladores");
        Componente ram = new Componente("Memoria RAM 32GB");
        Componente ddrSlot1 = new Componente("Tarjeta RAM DDR5 16GB");
        Componente ddrSlot2 = new Componente("Tarjeta RAM DDR5 16GB");
        Componente ssd = new Componente("NVMe SAMSUNG 2TB PCIe 3.0");

        /** Vamos a ir montando el PC añadiendo unas piezas a otras */

        // MONTAMOS EL CPU CON SUS DISTINTOS COMPONENTES
        cpu.addComponente(ventilador)
                .addComponente(disipador);

        // MONTAMOS LA GPU CON SUS DISTINTOS COMPONENTES
        videoCard.addComponente(gpu)
                .addComponente(gpuRam1)
                .addComponente(gpuRam2)
                .addComponente(gpuVentiladores);

        // MONTAMOS LA RAM CON SUS DISTINTOS COMPONENTES
        ram.addComponente(ddrSlot1).addComponente(ddrSlot2);

        // MONTAMOS LA PLACA CON SUS DISTINTOS COMPONENTES
        placa.addComponente(cpu)
                .addComponente(videoCard)
                .addComponente(ssd);

        // MONTAMOS TODOS LOS COMPONENTES EN LA CAJA
        caja.addComponente(placa)
                .addComponente(fuente);

        // CONECTAMOS LA CAJA A LOS PERIFÉRICOS
        pc.addComponente(caja)
                .addComponente(new Componente("Monitor 144Hz LG UltraGear 2k 27"))
                .addComponente(new Componente("Combo teclado + ratón Logitech"));;

                metodoRecursivo(pc, 0); // el método es estático, el nivel inicia en 0

    }

    /** Vamos a crear un método recursivo que recorra este árbol **/
    public static void metodoRecursivo(Componente c, int nivel){ /** con los niveles lo vemos en jerarquía **/
        System.out.println("\t".repeat(nivel)+c.getNombre()); // nombre del nodo padre (PC)
        // si el nodo tiene hijos los vamos a iterar
        if(c.tieneHijos()){
            for (Componente hijo: c.getHijos()){ // tomamos los hijos de cada componente (si los hay)
                /** Para ver el árbol completo volvemos a llamar al método de forma recursiva */
                metodoRecursivo(hijo, nivel+1); // IMPORTANTE NO PONER ++
            } /** Es importante que la primera llamada al método la haga el nodo principal */
        }
    }


}
