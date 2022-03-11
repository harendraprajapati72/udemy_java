import java.util.Scanner;

public class Section5 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your name");
       String name=sc.nextLine();
        for(int i=1;i<=3;i++){
            System.out.println("\n"+name);

        }
        sc.close();
    }
}
