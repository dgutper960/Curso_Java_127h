package POO.RelacionEntreClases;

public class Motor {

    private double potencia;
    private TipoMotor tipo;

    public Motor() {
    }

    public Motor(double potencia, TipoMotor tipo) {
        this();
        this.potencia = potencia;
        this.tipo = tipo;
    }


    public double getPotencia() {
        return potencia;
    }


    public TipoMotor getTipo() {
        return tipo;
    }



}
