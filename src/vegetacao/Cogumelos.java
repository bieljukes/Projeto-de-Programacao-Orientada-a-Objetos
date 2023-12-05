package vegetacao;

public class Cogumelos extends Plantas {
    public Cogumelos(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void crescer() {
        System.out.println(nome + " estão crescendo muito pela floresta. \n");
    }

}
