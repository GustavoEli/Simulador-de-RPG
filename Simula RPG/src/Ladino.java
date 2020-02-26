public class Ladino extends Humanoide implements Action{

    public Ladino(/*int vida, int xp*/) {
        
        vida = 100;
        atk = 10;
        xp = 0;
        //super(vida, xp);
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
