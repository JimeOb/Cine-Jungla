package co.edu.udistrital.cine.middleware;

import co.edu.udistrital.cine.handlers.RequestHandler;

public abstract class ChainHandlerBuilder {

    protected RequestHandler handler;
    
    public abstract RequestHandler build();
}
