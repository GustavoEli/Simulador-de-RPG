public class batalhaSim {
 
    
    Guerreiro guer = new Guerreiro();
    Guerreiro ini = new Guerreiro();
    
    public void inicio(){
    
        //if(guer.atacar() && ini.defender()){
            //System.out.println("colidoram!! ninguem se feriu");
        //}else if(!guer.atacar() && ini.atacar()){
            //System.out.println("ataque!! primeiro se feriu");
        //}
        
        if(guer.atacar()){
            guer.causarDano(ini);
        }
        
        System.out.println(ini.vida);
    }
}
