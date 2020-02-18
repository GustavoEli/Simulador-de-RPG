public class Humanoide implements Action{
    
    int vida;
    int xp;
    int atk;
    boolean def;
    
    public Humanoide(int vida, int xp){
        this.vida = vida;
        this.xp = xp;
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
