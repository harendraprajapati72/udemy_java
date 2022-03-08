import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Let's play Rock  Scissors");
        System.out.println("When I say 'shoot' Choose: rock ,paper, or scssors ");
        System.out.println("Are you ready ? write 'yes' if you are . ");

        String ready=sc.nextLine();
        

        if(ready.equals("yes")){
            System.out.println("\nGreat");
            System.out.println("rock - paper -scissors shoot!");
            String choice=sc.nextLine();
            String computerChoice=computerChoice();
           
            String result=result(choice, computerChoice);
            printResult(choice, computerChoice, result);
            

         }else{
             System.out.println("Darn ,some other time.....!");
         
             
            }
            sc.close();
        }
    public static String computerChoice(){
        double randomNumber=Math.random()*3;
        int integer=(int)randomNumber;
    
        switch(integer){
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default : return " ";
        }
    }

    public static String result(String yourChoice,String computerChoice){
        String result=" ";

        if(yourChoice.equals("rock") && computerChoice.equals("scissors")){
            result="You win!";
        }else if(computerChoice.equals("rock") && yourChoice.equals("scssors")){

            result="you lose!";

       
       
        }else if(yourChoice.equals("paper") && computerChoice.equals("rock")){
            result="You win!";
        }else if(computerChoice.equals("paper") && yourChoice.equals("rock")){

            result="you lose!";



        }else if(yourChoice.equals("scissors") && computerChoice.equals("paper")){
            result="You win!";
        }else if(computerChoice.equals("scissors") && yourChoice.equals("paper")){

            result="you lose!";

        }else{
            result="It's a tie";
        }
        // String result-RockPaperScissors.result(String.String);

        return result;
    }
    
    public static void printResult(String yourChoice,String computerChoice,String result){

        System.out.println("\n Ypu chose\t"+ yourChoice);
        System.out.println("The computer chose:\t" +computerChoice);
        System.out.println(result);
    }
}