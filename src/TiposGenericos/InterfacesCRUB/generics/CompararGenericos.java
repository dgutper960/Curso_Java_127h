package TiposGenericos.InterfacesCRUB.generics;

import POO_INTERFACES_CRUD.modelo.Cliente;
import TiposGenericos.InterfacesCRUB.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompararGenericos {
    public static void main(String[] args) {

        /** Creamos Objetos **/
        Cliente paco = new Cliente("Paco", "Martinez");
        Cliente david = new Cliente("David", "Jimenez");
        Cliente paca = new Cliente("Paca", "Zamorano");

        ClientePremium lucia = new ClientePremium("Lucía", "Pérez");
        ClientePremium marta = new ClientePremium("Marta", "García");
        ClientePremium lex = new ClientePremium("Lex", "Amstrong");

        String s1 = "En un lugar de la mancha de cuyo nombre no quiero acordarme";
        String s2 = "Hola";
        String s3 = "Z bienaventurados los valientes";

        /** Usamos el método con cada uno de los tipo de dato **/
        System.out.println("\n El mayor de tres numéricos "+mayorDeTres(13, 33, 71)+"\n");
        System.out.println("\n El mayor de tres ClientesPremium "+mayorDeTres(lucia, marta, lex)+"\n");
        System.out.println("\n El mayor de tres String "+mayorDeTres(s1, s2, s3)+"\n");
        /** Con Cliente no podemos porque Cliente no implementa comparable **/
//      System.out.println("\n El mayor de tres numéricos "+mayorDeTres(paco, david, paca)+"\n");



    }

    public static <T extends Comparable<T>> T mayorDeTres(T a, T b, T c){
        T max = a;
        if (b.compareTo(max) > 0){
            max = b;
        }
        if (c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
