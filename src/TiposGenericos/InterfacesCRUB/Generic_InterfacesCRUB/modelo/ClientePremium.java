package TiposGenericos.InterfacesCRUB.Generic_InterfacesCRUB.modelo;

public class ClientePremium extends Cliente implements Comparable<ClientePremium>{

    public ClientePremium() {
        super();
    }

    public ClientePremium(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    @Override
    public int compareTo(ClientePremium o) {
        return 0;
    }
}
