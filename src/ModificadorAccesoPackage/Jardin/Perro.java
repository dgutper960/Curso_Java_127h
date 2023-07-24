package ModificadorAccesoPackage.Jardin;

import ModificadorAccesoPackage.Hogar.Persona;

class Perro {
    /** El perro, con modificador por defecto, NUNCA puede salir del jardín **/

    /** Si tiene atributos públicos, podrán ser vistos desde fuera del jardín aunque la clase no sea pública **/
    public String colorPerro;
    public String razaPerro;

    /** Si tiene atributos protected, solo visibles en el paquete, pero afectan a la herencia */
    protected String nombrePerro;
    protected float largoPerroCm;
    protected float altoPerroCm;

    /** y si no quiero que el perro salga del jardín, sus métodos deberán ser por defecto **/
    String jugarConPersona(Persona persona){
        return "El perro "+this.nombrePerro+ " juega con la persona "+persona;
    }

    /** Si queremos que el perro pueda entrar a la casa los días de lluvia, podemos definir un método público **/
    public String entrarPorLluvia(){
        return "El perro "+nombrePerro+" puede entrar a casa cuando llueve";
    }

}
