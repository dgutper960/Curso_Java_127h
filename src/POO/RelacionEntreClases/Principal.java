package POO.RelacionEntreClases;

public class Principal {
    public static void main(String[] args) {

        /**
         * EN ESTA CLASE TENEMOS QUE CREAR INSTANCIAS DE TODAS LAS CLASES Y RELACIONARLAS
         * DE MODO QUE TODOS LOS COCHES TENGAN VALORES EN SUS ATRIBUTOS
         * Y VALORES EN LOS ATRIBUTOS DE:
         * --> Conductor (Persona)
         * --> Depósito
         * --> Color
         * --> TipoMotor (Combustible)
         * --> Ruedas
         * --> TipoCoche
         * **/



        /** Creamos conductores **/
        Persona pacoGarcia = new Persona("Paco", "García", "Rodriguez");
        Persona claraSmith = new Persona("Clara", "Smith");
        Persona daGutPer = new Persona("David", "Gutiérrez", "Pérez");

        /** Creamos motores */
        Motor gasolina250 = new Motor(250, TipoMotor.GASOLINA);
        Motor gasolina375 = new Motor(375.99, TipoMotor.GASOLINA);
        Motor diesel220 = new Motor(220, TipoMotor.DIESEL);
        Motor diesel450 = new Motor(450.80, TipoMotor.DIESEL);
        Motor hybridToyota = new Motor(220, TipoMotor.HIBRIDO);
        Motor teslaBig = new Motor(350.75, TipoMotor.ELECTRICO);

        /** Creamos depósitos **/
        Deposito depositoSmall = new Deposito(30);
        Deposito depositoStandar = new Deposito(50.0);
        Deposito depositoBig = new Deposito(80);

        /** Creamos ruedas, rellenamos arrays de tres formas diferentes **/
        Rueda[] ruedaMichelBig = new Rueda[4];
        ruedaMichelBig[0] = new Rueda("Michelin", 20.2, 45.78);
        ruedaMichelBig[1] = new Rueda("Michelin", 20.2, 45.78);
        ruedaMichelBig[2] = new Rueda("Michelin", 20.2, 45.78);
        ruedaMichelBig[3] = new Rueda("Michelin", 20.2, 45.78);

        Rueda[] ruedaContNormal = new Rueda[4];
        for (int i = 0; i< ruedaMichelBig.length; i++){
            ruedaContNormal[i] = new Rueda(
                    "Continental", 15.79, 30);
        }


        Rueda[] ruedaTesla = {
                new Rueda("Continental", 15.55, 35.3),
                new Rueda("Continental", 15.55, 35.3),
                new Rueda("Continental", 15.55, 35.3),
                new Rueda("Continental", 15.55, 35.3)
        };

        /** Creamos coches y asignamos todos los elementos **/
        Coche mercedesG = new Coche("Mercedes", "Clase G-350", Color.AMARILLO);
        mercedesG.setConductor(pacoGarcia);
        mercedesG.setDeposito(depositoBig);
        mercedesG.setMotor(diesel450);
        mercedesG.setRuedas(ruedaMichelBig);
        System.out.println("mercedesG.getConductor() = " + mercedesG.getConductor());
        System.out.println(mercedesG.detallesRueda());



        System.out.println("\n=============================\n");

        Coche subaruImpreza = new Coche("Subaru", "Impreza", Color.AZUL);
        subaruImpreza.setMotor(gasolina375);
        subaruImpreza.setDeposito(depositoStandar);
        subaruImpreza.setRuedas(ruedaContNormal);
        subaruImpreza.setConductor(claraSmith);
        System.out.println("subaruImpreza = " + subaruImpreza);
        System.out.println("subaruImpreza.detallesRueda() = " + subaruImpreza.detallesRueda());

        System.out.println("\n=============================\n");

        Coche audiA5 = new Coche("Audi", "A5", gasolina250, depositoStandar, Color.NEGRO, pacoGarcia, ruedaContNormal);
        System.out.println("audiA5 = " + audiA5);
        System.out.println(audiA5.aceleraFerna(4000));

        System.out.println("\n=============================\n");

        Coche toyotaCorolla = new Coche("Toyota", "Corolla", Color.NEGRO);
        toyotaCorolla.setMotor(hybridToyota);
        toyotaCorolla.setDeposito(depositoStandar);
        toyotaCorolla.setRuedas(ruedaContNormal);
        toyotaCorolla.setConductor(daGutPer);
        System.out.println("toyotaCorolla = " + toyotaCorolla);

        System.out.println("\n=============================\n");

        Coche teslaS = new Coche("Tesla", "Model S", teslaBig, null, Color.VIOLETA, daGutPer, ruedaTesla);
        System.out.println(teslaS.aceleraFerna(3000));
        System.out.println("teslaS.getConductor() = " + teslaS.getConductor());
        System.out.println("teslaS.getId() = " + teslaS.getId());

        System.out.println("\n=============================\n");



    }

}
