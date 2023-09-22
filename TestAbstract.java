abstract class car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("playing music..");

    }
}
abstract class Audi extends car{
    // public void drive(){
    //     System.out.println("Driving..");  
    // }

    public void fly(){
        System.out.println("flying..");
    }
}
class BMW extends Audi{
    // public void fly(){
    // System.out.println("flying..");
    // }

    public void drive(){
        System.out.println("Driving..");  
    }

}

public class TestAbstract {
    public static void main(String agrs[]){
        Audi a = new BMW();
        a.playMusic();
        a.drive();
        a.fly();
    }
    
}
