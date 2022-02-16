import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your grade out of 100");
        int grade=sc.nextInt();
        
        if(grade >= 80){
            System.out.println("You got a A");
        } else if(grade>=70){
            System.out.println("You got a B");
        } else if(grade>=60){
            System.out.println("You got a C");
        }else if(grade>=50){
            System.out.println("You got a D");
        } else
        {
            System.out.println("Do hard work and carry on..");
        }
    }
}