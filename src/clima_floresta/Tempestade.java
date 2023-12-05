package clima_floresta;

public class Tempestade extends Eventos_naturais {
    public Tempestade(String tipo) {
        super(tipo);
    }

    public void iniciarTempestade() {
        System.out.println("Um evento natual  do tipo " + super.tipo + " está chegando à floresta.\n");
    }

}
