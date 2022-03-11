import java.util.Scanner;


public class Javagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\nWelcome to HPgram! Sign in Below");
        System.out.println(" Please Enter Your User Name");
        String name=sc.nextLine();
        System.out.println(" Please Enter Your User Password");
        String password=sc.nextLine();
        while(name.equals("harendra") && password.equals("abc123")){ 
            System.out.println(" Successfully sign in");
            break;
            }

        
        sc.close();
        
    }
    
}
