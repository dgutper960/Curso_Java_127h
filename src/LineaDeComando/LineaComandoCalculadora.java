package LineaDeComando;

public class LineaComandoCalculadora {
    public static void main(String[] args) {

        String op = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.0;

        if(args.length != 3){
            System.out.println("Ingrese el símbolo de operación y dos números");
        }
        switch (op){
            case "+":
                resultado = a+b;
                break;
            case "-":
                resultado = a-b;
                break;
            case "*":
                resultado = a*b;
                break;
            case "/":
                if (a == 0 || b == 0){
                    System.out.println("No se puede dividir entre 0");
                    main(args);
                }
                resultado = a/(double)b;
                break;
            case "%":
                resultado =a%(double)b;
                break;
            default:
                System.out.println("Introduzca el símbolo de la operación seguido de los números");
                main(args);
        }
        System.out.println("El resultado de la operación es "+resultado);

    }
}
