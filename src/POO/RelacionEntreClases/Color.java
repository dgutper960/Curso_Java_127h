package POO.RelacionEntreClases;

public enum Color {
    VERDE("Verde"),
    ROJO("Rojo"),
    VIOLETA("Violeta"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    NEGRO("Negro"),
    BLANCO("Blanco"),
    GRIS("Gris"),
    ROSA("Rosa"),
    SILVER("Silver"),
    GOLD("Gold");

    private String color;

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
