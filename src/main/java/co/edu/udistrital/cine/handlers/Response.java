package co.edu.udistrital.cine.handlers;

import java.util.Iterator;
import lombok.Data;

@Data
public class Response {

    String mensaje;
    Object data;
    Iterator<Object> collection;       
    boolean isError;
    
}
