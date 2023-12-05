package animais;

public class Coelho extends Mamiferos {
    public Coelho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void movimentar() {
        System.out.println("O " + nome + " está se movimentando floresta\n");
    }
    
}
