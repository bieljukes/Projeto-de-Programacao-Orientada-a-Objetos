package animais;

public class Aves {
    public String nome;
    public int idade;
    
    public Aves(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void comer() {
        System.out.println("A "+ nome + " está se alimentando.\n");
    }

    public void reproduzir() {
        System.out.println("A " + nome + " está se reproduzindo.\n");
    }

    public void voar() {
        System.out.println("A" + nome + " está voando pela floresta.\n");
    }
    
}
