public class Cerbero extends Monstro implements Action{

    public Cerbero(/*int vida, int atk*/) {
        //super(vida, atk);
        vida = 100;
        atk = 10;
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
