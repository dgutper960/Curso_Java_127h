package POO.Ejemplos.ParametrizarConEnum;
/**
 * UNA CLASE ENUM ES UNA COLECCIÓN DE VALORES CONSTANTES QUE PODEMOS USAR EN OTRA CLASE
 * */
public enum MarcasPSA {
    CITROEN("Citröen"),
    PEUGEOT("Peugeot"),
    OPEL("Opel"),
    FIAT("Fiat"),
    ALPHA_ROMEO("Alpha Romeo"),
    DS("DS"),
    JEEP("Jeep");

    private String marca;

    MarcasPSA(String marca){
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return marca;
    }
}
