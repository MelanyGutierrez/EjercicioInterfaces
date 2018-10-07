
package poo;

public class Planta extends SerHumano implements Vida {
    
    private int largo;

    public Planta(int largo, String colorPiel) {
        super(colorPiel);
        this.largo = largo;
    }
    
     public String getAlimento(){
        return "Sustancias del suelo y del aire.";
    }
    
    @Override
    public void tiempoVida(int tiempo) {
        
    }

    @Override
    public int anioNacimiento() {
       return 2017;
    }

    @Override
    public int anioMuerte() {
        return 2018;
    }
}
