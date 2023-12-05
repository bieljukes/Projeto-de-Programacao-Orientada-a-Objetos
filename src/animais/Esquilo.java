package animais;

public class Esquilo extends Mamiferos {
    public Esquilo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void movimentar() {
        System.out.println(nome + " está se movimentando pela floresta\n");
    }
    
}
