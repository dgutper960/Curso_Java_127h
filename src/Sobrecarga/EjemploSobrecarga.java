package Sobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        /**
         * HABLAMOS DE SOBRECARGA CUANDO
         * USAMOS UN MISMO NOMBRE DE MÉTODO PARA DIFERENTES IMPLEMENTACIONES
         * PUEDE VARIAR EL NÚMERO DE ARGUMENTOS
         * PUEDEN VARIAR LOS TIPOS DE DATOS DEL ARGUMENTO
         * EL COMPILADOR SABE QUE MÉTODO USAR RESPECTO A LA ENTRADA
         * NO PUEDE HABER DOS MÉTODOS CON LOS MISMOS TIPOS Y NÚMERO DE ARGUMENTOS (El nombre de las variables no importa)
         * SI CAMBIAMOS EL ORDEN DE LOS TIPOS SI PUEDE HABER SI PODEMOS TENER MISMOS TIPOS Y NÚMERO DE ARGUMENTOS
         * EL TIPO DE RETORNO NO IMPORTA, SOLO LOS ARGUMENTOS
         * **/
        System.out.println("Sumamos con el 1er método "+suma(2, 2.5f)); // int+float
        System.out.println("Sumamos con el 2º método "+suma(2.5f, 3.7f)); // float+float
        System.out.println("Sumamos con el 3er método "+suma(1.5f, 2.5f, 3.3f)); // float+float+float
        System.out.println("Usamos el método con retorno String (suma a y b) ".concat(suma(5, 15)));
        System.out.println("Sumamos con el 2º método "+suma(2.5f, 3)); // EN ESTE CASO TOMA EL 2º PORQUE UN INTEGER CABE EN UN FLOAT
        System.out.println("Sumamos con el 1er método "+suma('@', 3)); // EN ESTE CASO TOMA EL UNICODE @ = 64
    }

    public static float suma(int a, float b){
        return a + b;
    }

    public static float suma(float a, float b){
        return a + b;
    }

    public static float suma(float a, float b, float c){
        return a + b + c;
    }

    public static String suma(int a, int b){
        return String.valueOf(a+b);
    }
}
