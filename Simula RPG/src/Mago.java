public class Mago extends Humanoide implements Action{

    public Mago(/*int vida, int xp*/) {
        //super(vida, xp);
        vida = 100;
        atk = 10;
        xp = 0;
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
