package animais;

public class Mamiferos {
    public String nome;
    public int idade;
    
    public Mamiferos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void comer() {
        System.out.println("O " + nome + " Achou alimento e está comendo.\n");
    }

    public void reproduzir() {
        System.out.println("O "+nome + " está se reproduzindo.\n");
    }

    public void movimentar() {
        System.out.println("O "+nome + " está se andando pela floresta. /n");
    }
    
}
