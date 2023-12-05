package animais;

public class Cervo extends Mamiferos {
    public Cervo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void movimentar() {
        System.out.println("O " + nome + " está caminhado pela floresta procurando por comida\n");
    }
    
}
