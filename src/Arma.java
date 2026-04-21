import java.util.Random;

public abstract class Arma {
    private int ataque;
    private int chance;
    private String nome;

    public Arma(String nome, int ataque, int chance){
        this.nome = nome;
        this.ataque = ataque;
        this.chance = chance;
    }

    public void Descricao(){
        System.out.printf("%s \nDano = %d\nChance de acerto = %d%", this.nome, this.ataque, this.chance);
    }

    public void golpe (Criatura alvo){
        Random rd = new Random();

        int sorteio = rd.nextInt(100);
        if(sorteio < this.chance){
            alvo.tomaDano(this.ataque);
        }
        else{
            System.out.println("Ataque falhou");
        }
    }
}