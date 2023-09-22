// Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass. 

abstract class Parent{
    abstract public void massage(); 


}
class sub extends Parent{
    public void massage(){
        System.out.println("This is my first subclass");
    }

}
class bub extends Parent{
    public void massage(){
        System.out.println("This is my Second subclass");
    }

}

public class Problem1 {
    public static void main(String arga[]){

        sub s1 = new sub();
        s1.massage();
        bub b1 = new bub();
        b1.massage();

    }
}
