package co.edu.udistrital.cine.compraventa;

public class ComprarBoletas implements Comprar {

    @Override
    public void comprar() {
        VerCatalogo();
        ElegirPelicula();
        ElegirSala();
        Pagar();
    }

    public void VerCatalogo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void ElegirPelicula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void ElegirSala() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void Pagar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
