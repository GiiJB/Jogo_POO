import java.util.Scanner;
import java.util.Random;

public class Jogador extends Criatura{
    private int ataquePerto = 40;
    private int ataqueLonge = 150;

    Scanner leitor = new Scanner(System.in);

    public Jogador(String nome) {
        super(nome, 900);
    }

    public void mostrarMenu(){
        System.out.println("ESCOLHA SUA ARMA:");
        System.out.println("1) Faca | Chance de acerto = 100% | Dano = " + ataquePerto);
        System.out.println("2) Pistola | Chance de acerto = 50% | Dano = " + ataqueLonge);
    }

    @Override
    public void fazAtaque(Criatura alvo){
        mostrarMenu();
        int escolha = leitor.nextInt();

        while(escolha < 1 || escolha > 2){
            System.out.println("Escolha inválida, digite novamente.");
            escolha = leitor.nextInt();
        }

        if(escolha == 1){
            alvo.tomaDano(ataquePerto);
        }
        else{
            Random rd = new Random();

            int sorte = rd.nextInt(100);
            if(sorte>=50){
                alvo.tomaDano(ataqueLonge);
            }
            else{
                System.out.println("Ataque falhou...");
            }
        }
    }

    @Override
    public void fraseApresentacao(){
        System.out.println("Não contavam com minha astúcia!");
    }

    @Override
    public void fraseMorte(){
        System.out.println("Eu voltarei para me vingar!!!");
    }
}
