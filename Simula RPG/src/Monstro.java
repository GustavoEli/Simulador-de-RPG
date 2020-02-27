public class Monstro implements Action{
    
    int vida;
    int atk;
    
    public Monstro(/*int vida, int atk*/){
        
    }
    
    @Override
    public boolean atacar(){
        return false;
    }
    
    @Override
    public boolean defender(){
        return false;
    }
    
    public int getVida(){
        return vida;
    }
}