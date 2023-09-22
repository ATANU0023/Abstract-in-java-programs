//We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes and print the percentage of marks for both the students.

import java.util.Scanner;
abstract class Marks{
     int n,grandTotal;
    abstract public void getPercentage();
}
class studentA extends Marks{
    int i, total=0;
    double percentage;
    int mark1[];

    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Subjects: ");
        n = sc.nextInt();
        mark1= new int[n];
        System.out.println("Enter the grand total marks of the all subject");
        grandTotal= sc.nextInt();
        System.out.println("Enter the marks ");
        for( i=0 ;i<n;i++){
        mark1[i]=sc.nextInt();
        }

    }
    public void getPercentage(){
        
        for(i=0;i<mark1.length;i++){
            total =total+ mark1[i];
            
            
        }
        
         percentage = (total*100)/grandTotal;
    }

    public void display(){
        System.out.println("The percentage of the student A is "+" "+percentage+"%");
        System.out.println("______________________________________");
    }
}
class studetnB extends Marks{
    int i, total;
    double percentage;
    int mark1[];

    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Subjects: ");
        n = sc.nextInt();
        mark1= new int[n];
        System.out.println("Enter the total marks of the all subject");
        grandTotal= sc.nextInt();
        System.out.println("Enter the marks ");
        for( i=0 ;i<n;i++){
            mark1[i]= sc.nextInt();
            }

    }
    public void getPercentage(){
        
        for(i=0;i<mark1.length;i++){
            total =total+ mark1[i];
        }
         percentage=(total*100)/grandTotal;
    }

    public void display(){
        System.out.println("The percentage of the student B is "+" "+percentage+"%");
        
    }
}


public class Problem3 {
    public static void main(String args[]){
        studentA a1 = new studentA();
        studetnB b1 = new studetnB();

        a1.getData();
        a1.getPercentage();
        a1.display();

        b1.getData();
        b1.getPercentage();
        b1.display();
    }
    
}
