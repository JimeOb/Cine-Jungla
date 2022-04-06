package co.edu.udistrital.cine.handlers;

public interface RequestHandler {
    
    public void setNext(RequestHandler next);
    
    public void process(String request, Object requestData);
    
}
