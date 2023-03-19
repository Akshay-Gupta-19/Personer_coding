/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOrResponsablility;

/**
 *
 * @author Akshay Gupta
 */

//Try and if can't pass on task to next in chain
public class KillBatman {
    public static void main(String[] args) {
        Chain joker = new Joker();
        Chain Bane = new Bane();
        Chain Riddler =new Riddler();
        Chain Freez=new Freez();
        Riddler.setNextChain(Freez);
        Freez.setNextChain(Bane);
        Bane.setNextChain(joker);
        Riddler.tryToKillBat(450);
    }
}
interface Chain{
    void setNextChain(Chain chain);
    boolean tryToKillBat(int batLife);
    String getName();
}

class Riddler implements Chain{

    Chain nextInChain;
    int ridderLife=100;
    String name="Riddler";

    public String getName() {
        return name;
    }
    
    @Override
    public void setNextChain(Chain chain) {
        this.nextInChain=chain;
    }

    @Override
    public boolean tryToKillBat(int batLife) {
        if(batLife<ridderLife){
            System.out.println("Riddler killed batman");
            return true;
        }else{
            System.out.println("Riddler tried but couldn't");
            if(nextInChain!=null){
                System.out.println("asking" +nextInChain.getName());
                nextInChain.tryToKillBat(batLife);
            }
            return false;
        }
    }
    
}

class Freez implements Chain{

    Chain nextInChain;
    int FreezLife=200;
    String name="Freez";

    public String getName() {
        return name;
    }
    
    @Override
    public void setNextChain(Chain chain) {
        this.nextInChain=chain;
    }

    @Override
    public boolean tryToKillBat(int batLife) {
        if(batLife<FreezLife){
            System.out.println("Freez killed batman");
            return true;
        }else{
            System.out.println("Freez tried but couldn't");
            if(nextInChain!=null){
                System.out.println("asking" +nextInChain.getName());
                nextInChain.tryToKillBat(batLife);
            }
            return false;
        }
    }
    
}
class Joker implements Chain{

        Chain nextInChain;
    int JokerLife=400;
    String name="Joker";

    public String getName() {
        return name;
    }
    
    @Override
    public void setNextChain(Chain chain) {
        this.nextInChain=chain;
    }

    @Override
    public boolean tryToKillBat(int batLife) {
        if(batLife<JokerLife){
            System.out.println("Joker killed batman");
            return true;
        }else{
            System.out.println("Joker tried but couldn't");
            if(nextInChain!=null){
                System.out.println("asking" +nextInChain.getName());
                nextInChain.tryToKillBat(batLife);
            }
            return false;
        }
    }
}
class Bane implements Chain{

        Chain nextInChain;
    int BaneLife=300;
    String name="Bane";

    public String getName() {
        return name;
    }
    
    @Override
    public void setNextChain(Chain chain) {
        this.nextInChain=chain;
    }

    @Override
    public boolean tryToKillBat(int batLife) {
        if(batLife<BaneLife){
            System.out.println("Bane killed batman");
            return true;
        }else{
            System.out.println("Bane tried but couldn't");
            if(nextInChain!=null){
                System.out.println("asking" +nextInChain.getName());
                nextInChain.tryToKillBat(batLife);
            }
            return false;
        }
    }
}