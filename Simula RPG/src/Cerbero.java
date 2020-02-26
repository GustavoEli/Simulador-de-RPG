public class Cerbero extends Monstro implements Action{

    public Cerbero(int vida, int atk) {
        super(vida, atk);
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
