public class Enguia extends Monstro implements Action{

    public Enguia() {
        vida = 100;
        nome = "Enguia";
        atk = 10;
    }
    
    public void atacar(Humanoide humano){
        humano.vida = humano.vida - this.atk;
    }

    public void atacar(Monstro monstro){
       monstro.vida = monstro.vida - this.atk; 
    }
    
    public void defender(Humanoide humano){
    
    }
    
    public void defender(Monstro monstro){
    
    }
}