import java.util.Scanner;
public class HpBot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hello. What is your name");
        String name=sc.nextLine();

        System.out.println("Hi. "+name+"! I'm HpBot. Where are you from? ");
        String home=sc.nextLine();

        System.out.println("I hear it's  beautiful at "+home+" I am from a place called Oracle.");
        System.out.println("How old are you?");
        int age=sc.nextInt();
        System.out.println("So you're "+ age + ", cool! I'm 400 years old.");
        System.out.println("this meand I'm "+(400/age)+ " times older than you. ");
        System.out.println("Enough about me . What's your favourite language? (just don't say java or python)");
        sc.nextLine();
        String language=sc.nextLine();

        System.out.println(" "+language+", that's great! Nice chatting with you " +name+"I have to log off now. See ya!");
        System.out.println("\n\t\t\t\t\tt\t\tPowered_by:@_Harendra_Prajapati");

    }
    
}
