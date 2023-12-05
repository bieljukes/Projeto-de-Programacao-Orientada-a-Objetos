
import animais.*;
import vegetacao.*;
import clima_floresta.*;

public class ecossistema {
    public static void main(String[] args) {
        // Criando animais
        Lobo lobo = new Lobo("Lobo Cinzento", 5);
        Cervo cervo = new Cervo("Cervo", 3);
        Gaviao gaviao = new Gaviao("Gavião", 4);
        Aguia aguia = new Aguia("Águia", 2);
        Esquilo esquilo = new Esquilo("Esquilo", 1);
        Coelho coelho = new Coelho("Coelho Saltitante", 2);

        // Criando plantas
        Arvores carvalho = new Arvores("Carvalhos", 10);
        Cogumelos cogumelos = new Cogumelos("Cogumelos", 1);
        Arbustos framboesa = new Arbustos("Arbustos", 1);

        // Criando fenômenos naturais
        Tempestade tempestade = new Tempestade("Tempestade de Inverno");

        // Simulação de interações
        System.out.println("\n\n ----------------- Começou o dia na floresta! --------------------\n\n");
        System.out.println("Todos os animais despertaram \n");
        lobo.movimentar();
        lobo.fazer_som();
        cervo.movimentar();
        gaviao.voar();
        aguia.voar();
        esquilo.movimentar();
        coelho.movimentar();
        lobo.comer();
        cervo.comer();
        esquilo.comer();
        coelho.comer();
        carvalho.crescer();
        cogumelos.crescer();
        carvalho.balancar();
        framboesa.crescer();
        tempestade.iniciarTempestade();
        System.out.println("Os animais se abrigaram em lugares seguros na floresta\n");
        System.out.println("\n\n----------------- O simulador chegou ao fim! --------------------\n\n");
    }
}
