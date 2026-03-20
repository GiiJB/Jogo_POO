public abstract class Criatura {
    private String nome;
    private int vida;

    public Criatura(String nome, int vida){
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome(){
        return nome;
    }

    public abstract void fazAtaque(Criatura alvo);
    public abstract void fraseApresentacao();
    public abstract void fraseMorte();

    //DÚVIDA: Eu poderia usar meu metodo get no lugar do this.nome?
    public void tomaDano(int dano){
        System.out.printf("%s toma %d de dano ", this.nome, dano);
        this.vida -= dano;
        if(this.vida<0){
            this.vida = 0;
        }
    }

    public boolean estaVivo(){
        //Aqui podemos retornar direto a condição verdadeira da nossa booleana, porque se não for já se entende como falsa
        return this.vida>0;
    }

    public void mostraVida(){
        System.out.printf("%s | Vida %d",getNome(), this.vida);
    }
}