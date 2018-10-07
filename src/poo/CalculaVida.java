
package poo;


public class CalculaVida {
    
    private int vidaTotal;
    
    public void calcularVida(Vida vidaSerVivo){
    
        vidaTotal = vidaSerVivo.anioMuerte()- vidaSerVivo.anioNacimiento();
    }

    public int getVidaTotal() {
        return vidaTotal;
    }
    
    
    
}
