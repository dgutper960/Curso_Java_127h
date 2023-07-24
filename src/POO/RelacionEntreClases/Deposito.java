package POO.RelacionEntreClases;

public class Deposito {

    private double capacidad;

    // PARA EL DEPÓSITO VAMOS A INICIALIZAR EL VALOR MEDIANTE EL CONSTRUCTOR
    public Deposito(){
        this.capacidad = 40;
    }

    public Deposito(double capacidad){
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }



    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }
}
