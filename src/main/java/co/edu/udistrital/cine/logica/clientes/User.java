package co.edu.udistrital.cine.logica.clientes;

public abstract class User {
    
    private Credentials credentials;    
    
    public String getEmail() {
        return credentials.getEmail();
    }
    
    public String getPassword() {
        return credentials.getPassword();
    }
    
}
