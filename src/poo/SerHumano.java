
package poo;


public class SerHumano implements Vida  {
    
    private String colorPiel;

    public SerHumano(String colorPiel) {
        this.colorPiel = colorPiel;
    }
    
     public String getAlimento(){
        return "Proteínas, vitaminas y minerales.";
    }
     
    @Override
    public void tiempoVida(int tiempo) {
        
    }

    @Override
    public int anioNacimiento() {
       return 1999;
    }

    @Override
    public int anioMuerte() {
        return 2015;
    }
    
}
