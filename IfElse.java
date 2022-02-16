import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your grade out of 100");
        int grade=sc.nextInt();
        
        if(grade >= 50){
            System.out.println("Great job you are passed");
        }else
        {
            System.out.println("Do hard work and carry on..");

        }
    }
    
}
