package vegetacao;

public class Arbustos extends Plantas {
    public String nome;

    public Arbustos(String nome, int idade) {
        super(nome, idade);
        this.nome = nome;
    }

    @Override
    public void crescer() {
        System.out.println(nome + " estão crescendo pela floresta.\n");
    }
}
