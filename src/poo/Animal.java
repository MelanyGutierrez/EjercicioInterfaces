
package poo;


public class Animal extends SerVivo implements Vida {

    private int peso;

    public Animal(int peso, String nombre) {
        super(nombre);
        this.peso = peso;
    }
    
    public String getAlimento(){
        return "Carnívoros, hervíboros y omnívoros.";
    }

    @Override
    public void tiempoVida(int tiempo) {
        
    }

    @Override
    public int anioNacimiento() {
       return 2015;
    }

    @Override
    public int anioMuerte() {
        return 2018;
    }
}
