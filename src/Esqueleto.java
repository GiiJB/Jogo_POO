public class Esqueleto extends Inimigo{
    public Esqueleto(){
        super("Esqueleto", 20);
    }

    @Override
    public void fraseApresentacao(){
        System.out.println("Quando o relógio bate às 01h00...");
    }

    @Override
    public void fraseMorte(){
        System.out.println("Das minhas cinzas voltarei como uma Fênix");
    }
}