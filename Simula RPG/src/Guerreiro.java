public class Guerreiro extends Humanoide{

    public Guerreiro(int vida, int xp) {
        super(vida, xp);
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
