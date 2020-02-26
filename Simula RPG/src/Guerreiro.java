import java.util.Random;

public class Guerreiro extends Humanoide implements Action{

    Random rand = new Random();
    
    public Guerreiro(/*int vida, int xp*/) {
        //super(vida, xp);
        vida = 100;
        atk = 10;
        xp = 0;
    }
    
    @Override
    public boolean atacar(){
        
        if(rand.nextBoolean()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public boolean defender(){
        
        if(rand.nextBoolean()){
            return true;
        }else{
            return false;
        }
    }
    
    public void causarDano(Humanoide humano){
        humano.vida = humano.vida - this.atk;
    }

    public void causarDano(Monstro monstro){
        
    }
}
