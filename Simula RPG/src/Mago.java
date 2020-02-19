public class Mago extends Humanoide{

    public Mago(int vida, int xp) {
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
