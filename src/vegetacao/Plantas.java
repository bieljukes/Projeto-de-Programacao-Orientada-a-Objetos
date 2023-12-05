package vegetacao;

public class Plantas {
    public String nome;
    public int idade;

    public Plantas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void crescer() {
        System.out.println(nome + " está crescendo como uma planta.\n");
    }

    public void reproduzir() {
        System.out.println(nome + " está se reproduzindo como uma planta.\n");
    }

}
