public class Mago extends Humanoide implements Action{

    public Mago() {
        vida = 100;
        nome = "Mago";
        atk = 10;
        xp = 0;
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
    
    /*@Override
    public boolean atacar(){
        
       Random rand = new Random();
       
        if(rand.nextBoolean()){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    public boolean defender(){
        
        Random rand = new Random();
        //int verifica = rand.nextInt();
        //if(verifica % 2 == 0) verficando atraves de numeros pares e impares
        
        if(rand.nextBoolean()){
            return true;
        }else{
            return false;
        }
    }
    
    //Função que retorna o valor da vida
    //usada para ser testada na simulação
    public int getVida(){
        return vida;
    }*/
}
