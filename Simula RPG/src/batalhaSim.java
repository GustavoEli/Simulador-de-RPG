import java.util.Random;

public class batalhaSim {
    
    Humanoide[] humanos = new Humanoide[4];
    Monstro[] criatura = new Monstro[2];
    Random sorteio = new Random();
    boolean one_action, two_action;
    
    //variaveis q iram armazenar os valores sorteados
    int pl_one;
    int pl_two;
    
    //aquele exemplo de todo mago é uma pessoa mas nem toda pessoa é um mago
    //estou fazendo em vez de superclasse(pai) e subclasse(filho) com...
    //interface(action) e as classes que implementam essa interface
    //Action [] perso = new Action[7];
    
    //Guerreiro guer = new Guerreiro();
    //Guerreiro ini = new Guerreiro();
    //Action [] perso = new Action[6];
    //int pl_one = sorteio.nextInt(humanos.length);
    //int pl_two = sorteio.nextInt();
    
    public batalhaSim(){
        
        humanos[0] = new Guerreiro();
        humanos[1] = new Mago();
        humanos[2] = new Ladino();
        humanos[3] = new Templario();
        criatura[0] = new Cerbero();
        criatura[1] = new Enguia();
        
        pl_one = sorteio.nextInt(4);
        pl_two = sorteio.nextInt(2);
        
        inicio();
        
        /*perso[0] = new Guerreiro();
        perso[1] = new Mago();
        perso[2] = new Ladino();
        perso[3] = new Templario();
        perso[4] = new Cerbero();
        perso[5] = new Enguia();*/
    }
    
    public void inicio(){

    if(humanos[pl_one].vida <= 0){
        System.out.println(criatura[pl_two].nome + " Venceu!!" + " vida: " + criatura[pl_two].vida);
    }else if(criatura[pl_two].vida <= 0){
        System.out.println(humanos[pl_one].nome + " Venceu!!" + " vida: " + humanos[pl_one].vida);            
    }
        
    while(humanos[pl_one].vida > 0 && criatura[pl_two].vida > 0){
    
        one_action = sorteio.nextBoolean();
        two_action = sorteio.nextBoolean();
        
        if(one_action && two_action){
            System.out.println("os ataques de " +  humanos[pl_one].nome + " e " + 
                              criatura[pl_two].nome + " colidiram, ninguem se feriu");
        }
        
        if(one_action && !two_action){
            humanos[pl_one].atacar(criatura[pl_two]);
            System.out.println(humanos[pl_one].nome + " atacou " + criatura[pl_two].nome + 
                               " causou " + humanos[pl_one].atk + " de dano");
        }
        
        if(!one_action && two_action){
            criatura[pl_two].atacar(humanos[pl_one]);
            System.out.println(criatura[pl_two].nome + " atacou " + humanos[pl_one].nome + 
                               " causou " + criatura[pl_two].atk + " de dano");
        }
        
        if(!one_action && !two_action){
            System.out.println(humanos[pl_one].nome + " e " + criatura[pl_two].nome + 
                               " se defenderam " + " nada aconteceu");
        }
        
    }

    }

    //while(perso[pl_one].atacar() || perso[pl_two].getVida() > 0){}

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
        
        /*if(!guer.atacar()){
            guer.causarDano(ini);
        }*/
        
        //System.out.println(ini.vida);
}
