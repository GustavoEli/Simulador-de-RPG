
import java.util.Random;

public class Mago extends Humanoide implements Action{

    public Mago(/*int vida, int xp*/) {

    //definindo os atributos herdados de humanoide para essa classe
        vida = 100;
        atk = 10;
        xp = 0;
        
    //super(vida, xp);
    }
    
    @Override
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
    
    //Sobrecarga de metodos
    //em vez de criar uma função de causar dano humano e causar dano monstro
    //eu faço uma mesma função, causar dano, e so mudo os parametros para ver quem causara
    //por exemplo desenhar bola, se ver existe varios parametros diferentes para uma mesma função
    public void causarDano(Humanoide humano){
        humano.vida = humano.vida - this.atk;
    }

    public void causarDano(Monstro monstro){
       monstro.vida = monstro.vida - this.atk; 
    }
    
    //Função que retorna o valor da vida
    //usada para ser testada na simulação
    public int getVida(){
        return vida;
    }
}
