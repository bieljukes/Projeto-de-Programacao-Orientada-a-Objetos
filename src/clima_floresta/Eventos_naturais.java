package clima_floresta;

public class Eventos_naturais {
    public String tipo;

    public Eventos_naturais(String tipo) {
        this.tipo = tipo;
    }

    public void alterarClima() {
        System.out.println("\n está acontecendo um eveno natural do tipo" + tipo);
    }
}
