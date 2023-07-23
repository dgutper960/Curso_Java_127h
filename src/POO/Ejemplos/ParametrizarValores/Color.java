package POO.Ejemplos.ParametrizarValores;

/** PODEMOS DAR VALORES PERSONALIZADOS A LAS CONSTANTES **/

public enum Color {
    BLANCO("Blanco"),
    VERDE("Verde"),
    AZUL("Azul"),
    VIOLETA("Violeta"),
    ROJO("Rojo"),
    ROSA("Rosa"),
    CELESTE("Celeste"),
    NEGRO("Negro");

    private final String color;

    Color(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
