import java.util.ArrayList;
import java.util.Random;

class EcossistemaFloresta {
    public static void main(String[] args) {
        Floresta floresta = new Floresta();
        floresta.simularCicloDiurno(10); // Simule o ciclo diurno por 10 dias
    }
}

class SerVivo {
    private String nome;
    private int idade;
    private boolean vivo;

    public SerVivo(String nome) {
        this.nome = nome;
        this.idade = 0;
        this.vivo = true;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean estaVivo() {
        return vivo;
    }

    public void envelhecer() {
        idade++;
        if (idade > 10) { // Exemplo de vida curta para fins de demonstração
            vivo = false;
        }
    }

    public void mover() {
        System.out.println(nome + " está se movendo.");
    }
}

class Planta extends SerVivo {
    public Planta(String nome) {
        super(nome);
    }

    public void crescer() {
        System.out.println(getNome() + " está crescendo.");
    }
}

class Animal extends SerVivo {
    private char sexo;

    public Animal(String nome, char sexo) {
        super(nome);
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public void comer() {
        System.out.println(getNome() + " está se alimentando.");
    }

    public void reproduzir(Animal parceiro) {
        if (getIdade() > 1 && parceiro.getIdade() > 1 && this.getSexo() != parceiro.getSexo() && this.getClass() == parceiro.getClass()) {
            System.out.println(getNome() + " e " + parceiro.getNome() + " estão se reproduzindo.");
        }
    }
}

class Mamifero extends Animal {
    public Mamifero(String nome, char sexo) {
        super(nome, sexo);
    }
}

class Lobo extends Mamifero {
    public Lobo(String nome, char sexo) {
        super(nome, sexo);
    }
}

class Coelho extends Mamifero {
    public Coelho(String nome, char sexo) {
        super(nome, sexo);
    }
}

class Arvore extends Planta {
    public Arvore(String nome) {
        super(nome);
    }
}

class Arbusto extends Planta {
    public Arbusto(String nome) {
        super(nome);
    }
}

class Clima {
    private String descricao;

    public Clima(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

class Floresta {
    private ArrayList<SerVivo> seresVivos;
    private Clima clima;

    public Floresta() {
        seresVivos = new ArrayList<>();
        seresVivos.add(new Lobo("Lobo Alfa", 'M'));
        seresVivos.add(new Lobo("Loba Beta", 'F'));
        seresVivos.add(new Coelho("Coelho 1", 'M'));
        seresVivos.add(new Coelho("Coelha 2", 'F'));
        seresVivos.add(new Arvore("Carvalho"));
        seresVivos.add(new Arbusto("Espinheiro"));
        clima = new Clima("Ensolarado");
    }

    public void simularCicloDiurno(int dias) {
        for (int dia = 1; dia <= dias; dia++) {
            System.out.println("Dia " + dia + " - Clima: " + clima.getDescricao());

            for (SerVivo serVivo : seresVivos) {
                serVivo.mover();
                serVivo.envelhecer();

                if (serVivo instanceof Animal) {
                    Animal animal = (Animal) serVivo;
                    animal.comer();
                    if (animal.estaVivo() && animal.getIdade() > 1) {
                        for (SerVivo parceiro : seresVivos) {
                            if (parceiro instanceof Animal && parceiro.estaVivo()) {
                                Animal outroAnimal = (Animal) parceiro;
                                animal.reproduzir(outroAnimal);
                            }
                        }
                    }
                }

                if (serVivo instanceof Planta) {
                    Planta planta = (Planta) serVivo;
                    planta.crescer();
                }

                System.out.println();
            }

            atualizarClima(); // Simulação de mudanças climáticas
        }
    }

    private void atualizarClima() {
        Random random = new Random();
        int chanceChuva = random.nextInt(100);
        if (chanceChuva < 20) {
            clima = new Clima("Chuvoso");
        } else {
            clima = new Clima("Ensolarado");
        }
    }
}
