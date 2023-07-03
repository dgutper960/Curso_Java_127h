package Operadores;

public class OperadoresAsignacion {
    public static void main(String[] args) {

        /** El más básico de todos es el =  */
        int a = 1; // asignamos 1 como valor de a

        /** Operadores compuestos
         *   +=, -=; *=, /=, %=
         * son simplificaciones */
         a = a + 1; // 2
         a = a - 1; // 1

         a += 1; // 2
         a -= 1; // 1
        // comprobamos
        System.out.println("a = " + a);

        a *= 10; // 10

        a /= 2; // 5

        a %= 2; // 1
        System.out.println("a = " + a);

        /** El operador compuesto += lo podemos usar también con String */
        String sqlQuery = "SELECT * FROM clientes ";
        sqlQuery += "WHERE primerApellido LIKE \"%Gonzalez%\" ";
        sqlQuery += "ORDER BY nombre desc; ";
        System.out.println("sqlQuery = " + sqlQuery);

        /**
         * OPERADORES UNARIOS (invierten el valor positivo/negativo de un número)
         * */




    }
}
