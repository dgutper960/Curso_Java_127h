package POO_Sobrecarga;

public class Main {
    public static void main(String[] args) {

        /** Creamos un animal, un perro, un gato, un pastor aleman y saludamos **/
        Animal animal = new Animal();
        Perro perro = new Perro("Perro", 4, true, true, "Bobby");
        Gato gato = new Gato();
        PastorAleman pastor = new PastorAleman("Richard");

        System.out.println("animal.saludar() = " + animal.saludar());

        System.out.println("gato.saludar() = " + gato.saludar());

        String saludoPerro = perro.saludar();
        System.out.println("saludoPerro = " + saludoPerro);

        System.out.println("pastor.saludar() = " + pastor.saludar());


    }
}
