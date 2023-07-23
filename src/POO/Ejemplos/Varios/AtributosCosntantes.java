package POO.Ejemplos.Varios;

public class AtributosCosntantes {

    /**
     * USAMOS ATRIBUTOS CONSTANTES
     * CUANDO NO QUEREMOS QUE UN VALOR CAMBIE EN NINGUNA PARTE DE LA APLICACIÓN
     * SON VALORES QUE NO CAMBIAN POR LO QUE SUELEN SER ESTÁTICOS
     * ESTOS VALORES SON SOLO DE LECTURA POR LO QUE SUELEN SER PÚBLICOS
     * LA NOMENCLATURA ES --> public static final _tipoDato_ NOMBRE_COMPUESTO = _valor_;
     *
     * **/

    public static final long VELOCIDAD_LUZ = 299792458;
    public static final int VELOCIDAD_SONIDO_AIRE = 343;


}

class Main{
    public static void main(String[] args) {

        /** Los valores estáticos solo son legibles **/
        System.out.println(AtributosCosntantes.VELOCIDAD_LUZ+"m/s");
        System.out.println(AtributosCosntantes.VELOCIDAD_SONIDO_AIRE +"m/s");

    }
}