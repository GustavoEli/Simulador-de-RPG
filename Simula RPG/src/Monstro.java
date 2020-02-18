public class Monstro implements Action{
    
    int vida;
    String nome;
    
    public void Monstro(){
    
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
