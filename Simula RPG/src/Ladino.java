public class Ladino extends Humanoide{

    public Ladino(int vida, int xp) {
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
