package POO.Ejemplos.ParametrizarConEnum;

public class Main {
    public static void main(String[] args) {

        CochesPSA peugeot205 = new CochesPSA(MarcasPSA.PEUGEOT, Color.CELESTE);
        CochesPSA opelCorsa = new CochesPSA(MarcasPSA.OPEL, Color.VIOLETA);
        opelCorsa.setTipo(TipoVehiculo.CUPE);

        CochesPSA ds = new CochesPSA();
        ds.setColor(Color.VERDE);
        ds.setMarca(MarcasPSA.DS);
        ds.setTipo(TipoVehiculo.FAMILIAR);
        

        CochesPSA partner = new CochesPSA(MarcasPSA.PEUGEOT, Color.ROSA);
        partner.setTipo(TipoVehiculo.FURGON);

        CochesPSA alpha = new CochesPSA();
        alpha.setColor(Color.ROJO);



        System.out.println(peugeot205);
        System.out.println();
        System.out.println(opelCorsa);
        System.out.println();
        System.out.println(ds);
        System.out.println("partner.getTipo() = " + partner.getTipo());
        System.out.println("ds.getTipo().numPlazas = " + ds.getTipo().numPlazas);
        System.out.println("opelCorsa.getTipo().descripcion = " + opelCorsa.getTipo().descripcion);

        System.out.println("\n============================================\nIMPLEMENTAMOS UN SWITCH CON ENUM");

        TipoVehiculo tipo = partner.getTipo();
        switch (tipo){
            case CUPE -> System.out.println("Es la caña");
            case FURGON -> System.out.println("Para el curro");
            case FAMILIAR -> System.out.println("Cargao de niños");
            default -> System.out.println("Tipo de vehículo no definido");
        }

    }
}
