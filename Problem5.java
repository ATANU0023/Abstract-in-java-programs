//Problem 5 - Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'. Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class 'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'. Now create an object for each of the subclasses and call their respective methods.

abstract class Animals {
    abstract public void cats();

    abstract public void dogs();
}

class Cats extends Animals {

    @Override
    public void cats() {
        System.out.println("cats meow");
    }

    @Override
    public void dogs() {

    }

}

class Dogs extends Animals {
    public void dogs() {
        System.out.println("dogs bark");
    }

    public void cats() {

    }
}

public class Problem5 {
    public static void main(String args[]) {
        Cats c = new Cats();
        Dogs d = new Dogs();
        c.cats();
        d.dogs();
    }
}