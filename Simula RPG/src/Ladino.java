public class Ladino extends Humanoide implements Action{

    public Ladino(/*int vida, int xp*/) {

    //definindo os atributos herdados de humanoide para essa classe
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
    
    //Função que retorna o valor da vida
    //usada para ser testada na simulação
    public int getVida(){
        return vida;
    }
}
