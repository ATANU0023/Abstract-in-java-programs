//Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.

abstract class Bank{
    abstract public void getBalance(int r);
}
class BankA extends Bank{
    public void getBalance(int r){
        System.out.println("Bank A has deposited $"+r);
    }
}
class BankB extends Bank{
    public void getBalance(int j){
        System.out.println("Bank B has deposited $"+j);
    }
}
class BankC extends Bank{
    public void getBalance(int k){
        System.out.println("Bank C has deposited $"+k);
    }
}
public class Problem2 {
    public static void main(String args[]){
        BankA a1 = new BankA();
        BankB b1 = new BankB();
        BankC c1 = new BankC();

        //parameterized methods
        a1.getBalance(100);
        b1.getBalance(150);
        c1.getBalance(200);
    }
    
}
