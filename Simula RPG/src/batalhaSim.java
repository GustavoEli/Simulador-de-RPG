import java.util.Random;

public class batalhaSim {
    
    Humanoide[] humanos = new Humanoide[4];
    Monstro[] criatura = new Monstro[2];
    Random sorteio = new Random();
    
    //variaveis q iram armazenar os valores sorteados
    int pl_one;
    int pl_two;
    
    //aquele exemplo de todo mago é uma pessoa mas nem toda pessoa é um mago
    //estou fazendo em vez de superclasse(pai) e subclasse(filho) com...
    //interface(action) e as classes que implementam essa interface
    Action [] perso = new Action[7];
    
    Guerreiro guer = new Guerreiro();
    Guerreiro ini = new Guerreiro();
    //Action [] perso = new Action[6];
    //int pl_one = sorteio.nextInt(humanos.length);
    //int pl_two = sorteio.nextInt();
    
    public batalhaSim(){
        
        perso[0] = new Guerreiro();
        perso[1] = new Mago();
        perso[2] = new Ladino();
        perso[3] = new Templario();
        perso[4] = new Cerbero();
        perso[5] = new Enguia();
        
        pl_one = sorteio.nextInt(6);
        pl_two = sorteio.nextInt(6);
        
        /*humanos[0] = new Guerreiro();
        humanos[1] = new Mago();
        humanos[2] = new Ladino();
        humanos[3] = new Templario();
        criatura[4] = new Cerbero();
        criatura[5] = new Enguia();*/
    }
    
    public void inicio(){
        
    //while(perso[pl_one].getVida() > 0 || perso[pl_two].getVida() > 0){
        
    //}
               

      /*humanos[0] = new Guerreiro();
        humanos[1] = new Ladino();
        humanos[2] = new Mago();
        humanos[3] = new Templario();
        
        criatura[0] = new Enguia();
        criatura[1] = new Cerbero();*/
        
        //if(guer.atacar() && ini.defender()){
            //System.out.println("colidoram!! ninguem se feriu");
        //}else if(!guer.atacar() && ini.atacar()){
            //System.out.println("ataque!! primeiro se feriu");
        //}
        
        if(!guer.atacar()){
            guer.causarDano(ini);
        }
        
        //System.out.println(ini.vida);
    }
}
