package POO_Sobrecarga;

public class PastorAleman extends Perro{

    String nombreAmo;

    @Override
    public String saludar() {
        return super.saludar()+ //APROVECHAMOS EL SALUDAR DE PERRO Y AÑADIMOS
                "\tSoy un Pastor Alemán y mi dueño se llama "+this.nombreAmo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNombreAmo " + nombreAmo;
    }

    /*** Usamos el toString de perro que a la vez contiene el de animal **/



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
