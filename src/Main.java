public class Main {
    public static void main(String[] args) {
        Criatura jogador = new Jogador("Ravena");
        Criatura inimigo = new Malignos();

        jogador.fraseApresentacao();
        inimigo.fraseApresentacao();

        int rodada = 0;
        while(true){
            rodada++;
            System.out.println("**************************");
            System.out.printf("\n Rodada %d", rodada);
            System.out.println();
            jogador.mostraVida();
            inimigo.mostraVida();

            jogador.fazAtaque(inimigo);
            if(inimigo.estaVivo()){
               inimigo.fazAtaque(jogador);
            }

            if(!jogador.estaVivo()){
                jogador.fraseMorte();
                System.out.printf(inimigo.getNome() + " venceu!");
                break;
            }
            if(!inimigo.estaVivo()){
                inimigo.fraseMorte();
                System.out.println(jogador.getNome() + " venceu!");
                break;
            }
        }

    }
}