package POO.Ejemplos.ParametrizarValores;

public class Main {
    public static void main(String[] args) {

        CochesPSA peugeot205 = new CochesPSA(MarcasPSA.PEUGEOT, Color.CELESTE);
        CochesPSA opelCorsa = new CochesPSA(MarcasPSA.OPEL, Color.VIOLETA);

        CochesPSA ds = new CochesPSA();
        ds.setColor(Color.VERDE);
        ds.setMarca(MarcasPSA.DS);


        System.out.println(peugeot205);
        System.out.println();
        System.out.println(opelCorsa);
        System.out.println();
        System.out.println(ds);
    }
}
