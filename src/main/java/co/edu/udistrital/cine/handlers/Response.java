package co.edu.udistrital.cine.handlers;

import java.util.Iterator;
import lombok.Data;

@Data
public class Response {

    private String mensaje;
    private Object data;
    private Iterator<Object> collection;       
    private boolean isError = false;
    
}
