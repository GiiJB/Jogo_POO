public class Zumbi extends Inimigo{
    public Zumbi(){
        super("Zumbi", 40);
    }

    @Override
    public void fraseApresentacao(){
        System.out.println("Acharam que eu estava derrotado...\nQUEM ACHOU ESTAVA ERRADO!!!");
    }

    @Override
    public void fraseMorte(){
        System.out.println("AAAAA você venceu, mas quando menos esperar volto como o oitavo anjo do apocalipse");
    }
}