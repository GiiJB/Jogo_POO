import java.util.Random;

public class Esquiva extends Defesa{
    private int chanceEsquivar;

    public Esquiva(chance){
        this.chanceEsquivar = chance;
    }

    @Override
    public int danoReduzido(int danoOriginal){
        Random rd = new Random();

        int sorteio = rd.nextInt(100);
        if(sorteio<this.chanceEsquivar){
            return 0;
        }
        else{
            return danoOriginal
        }
    }
}