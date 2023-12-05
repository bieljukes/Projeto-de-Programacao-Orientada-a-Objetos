package animais;

public class Gaviao extends Aves {
    public Gaviao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void voar() {
        System.out.println("O " + nome + " está voando sob a floresta\n");
    }
    
}

