package vegetacao;

public class Arvores extends Plantas {
    public Arvores(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void crescer() {
        System.out.println("Os " + nome + " estão crescendo \n");
    }

    public void balancar(){
        System.out.println("Os " + nome + " estão balançando por causa do vento forte.\n");
    }

   
}
