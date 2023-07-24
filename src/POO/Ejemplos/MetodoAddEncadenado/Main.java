package POO.Ejemplos.MetodoAddEncadenado;

public class Main {
    public static void main(String[] args) {


        Coche coche1 = new Coche();

        Rueda[] rueda1 = new Rueda[4];
        for (int i =0; i< rueda1.length ; i++){
            coche1.addRuedas(new Rueda("Pirelli", 15));
        }

        System.out.println("coche1 = " + coche1.getRuedas());
    }
}
