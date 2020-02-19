public class Enguia extends Monstro{

    public Enguia(int vida, int atk) {
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
