package co.edu.udistrital.cine.logica.clientes;

public class ClientBuilder {

    private Cliente client;

    public ClientBuilder() {
        this.client = new Cliente();
    }
    
    public ClientBuilder addNombre(String nombre) {
        client.setNombre(nombre);
        return this;
    }
        
    public ClientBuilder addCredentials(Credentials credentials) {
        client.setCredentials(credentials);
        return this;
    }
    
    public ClientBuilder addPuntos(Integer puntos) {
        client.setPuntos(puntos);
        return this;
    }
    
    public ClientBuilder addId(Integer id) {
        client.setId(id);
        return this;
    }
    
    public Cliente build() {
        
        Cliente clientConstruction = client;
        client = new Cliente();
        
        return clientConstruction;
    }
}
