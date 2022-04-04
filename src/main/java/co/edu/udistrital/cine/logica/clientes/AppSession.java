package co.edu.udistrital.cine.logica.clientes;

public class AppSession {

    private final int DEFAULT_EXPIRATION_TIM = 5;    

    private static AppSession session;
    private User user;
    private int expiration;
    
    private AppSession() {
        this.expiration = DEFAULT_EXPIRATION_TIM;
    }
    
    public static AppSession getSession() {
        if(session == null)
            session = new AppSession();
        return session;
    }
    
    public void login() {
        
    }
    
    public void logout() {
        
    }
    
    private void extendSession(int minutes) {
        
    }
    
    public void validateSession() {
        
        if(expiration == 0)
            logout();
        
        int minutes = 5;  
        extendSession(minutes);
    }
    
}
