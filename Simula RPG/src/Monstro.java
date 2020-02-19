public class Monstro implements Action{
    
    int vida;
    int atk;
    
    public Monstro(int vida, int atk){
        this.vida = vida;
        this.atk = atk;
    }
    
    @Override
    public boolean atacar(){
        return false;
    }
    
    @Override
    public boolean defender(){
        return false;
    }
}
