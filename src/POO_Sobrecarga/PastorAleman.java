package POO_Sobrecarga;

public class PastorAleman extends Perro{

    String nombreAmo;

    @Override
    public String saludar() {
        return super.saludar()+ //APROVECHAMOS EL SALUDAR DE PERRO Y AÑADIMOS
                "\tSoy un Pastor Alemán y mi dueño se llama "+this.nombreAmo;
    }

    public PastorAleman(String nombreAmo) {
        this.nombreAmo = nombreAmo;
    }

    public String getNombreAmo() {
        return nombreAmo;
    }

    public void setNombreAmo(String nombreAmo) {
        this.nombreAmo = nombreAmo;
    }
}
