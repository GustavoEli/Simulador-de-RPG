public class Guerreiro extends Humanoide implements Action{
    
    public Guerreiro(/*int vida, int xp*/) {
    //super(vida, xp);
    //definindo os atributos herdados de humanoide para essa classe
        vida = 100;
        nome = "Guerreiro";
        atk = 10;
        xp = 0;
    }
    
    //Sobrecarga de metodos
    //em vez de criar uma função de causar dano humano e causar dano monstro
    //eu faço uma mesma função, causar dano, e so mudo os parametros para ver quem causara
    //por exemplo desenhar bola, se ver existe varios parametros diferentes para uma mesma função
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
       return rand.nextBoolean();
       
        /*if(rand.nextBoolean()){
            return true;
        }else{
            return false;
        }
    }*/
    
    /*@Override
    public boolean defender(){
        
        Random rand = new Random();
        return rand.nextBoolean();
        //int verifica = rand.nextInt();
        //if(verifica % 2 == 0) verficando atraves de numeros pares e impares
        /*if(rand.nextBoolean()){
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
