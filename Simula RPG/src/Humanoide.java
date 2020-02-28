public class Humanoide implements Action{
    
    int vida;
    String nome;
    int atk;
    int def;
    int xp;
    
    public Humanoide(/*int vida, int xp*/){
        //this.vida = vida;
        //this.xp = xp;
    }
    
    public void atacar(Humanoide humanos) {}
    
    public void atacar(Monstro criatura) {}
    
    public void defender(Humanoide humanos){}
    
    public void defender(Monstro criatura) {}
    
    /*@Override
    public boolean atacar(){
        return false;
    }
    
    @Override
    public boolean defender(){
        return false;
    }
    
    //Função que retorna o valor da vida
    //usada para ser testada na simulação
    public int getVida(){
        return vida;
    }*/
}
