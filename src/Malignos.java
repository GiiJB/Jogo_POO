public class Malignos extends Inimigo{
    public Malignos(){
        super("Maligno",1000,50);
    }

    @Override
    public void fraseApresentacao(){
        System.out.println("Eu vou te mataaaaar!!!");
    }

    @Override
    public void fraseMorte(){
        System.out.println("NÃOOOOOOOOOOOOOOOOOOOOO");
    }

}
