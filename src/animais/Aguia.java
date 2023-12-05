package animais;

public class Aguia extends Aves {
    public String nome;

    public Aguia(String nome, int idade) {
        super(nome, idade);
        this.nome = nome;
    }

    public void voar() {
        System.out.println(nome + " está voando pela floresta\n");
    }

}
