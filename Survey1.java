import java.util.Scanner;

public class Survey1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Welcome.. Thank you for survey?");
    
    int counter=0;
    System.out.print("what is your name? ");
    String name=sc.nextLine();
    counter++;

    System.out.print("how much money do you want to spent on coffee? ");
    double coffeePrice= sc.nextDouble();
    counter++;
    
    System.out.print("how much money do you want to spent on fast food? ");
    double foodPrice= sc.nextDouble();
    counter++;

    System.out.print("how maney times a week you  buy coffee? ");
    int coffeeAmount=sc.nextInt();
    counter++;

    System.out.print("how maney times a week you  buy fast food? ");
    int foodAmount=sc.nextInt();
    counter++;

    // System.out.println("\n Total ammount is : "+(coffee+fastFood+coffeeAmount+foodAmount));
    System.out.println(" Your Name is : "+name+"\n You want to spend money on coffee : "+coffeePrice+"\n You want to spend money on fast food : "+foodPrice+"\n You by cofee in a week : "+coffeeAmount+"\n You by fast food in a week : "+foodAmount);
    System.out.println("\nThank you "+name+" for answering all "+counter+" questions");
    System.out.println("\nYour fast food expenses are: "+(foodPrice/coffeePrice)+" times than coffee expenses :");
    System.out.println("\nWeekly you spent Rs. "+(coffeeAmount*coffeePrice)+" on coffee");
    System.out.println("\nWeekly you spent Rs. "+(foodAmount*foodPrice)+"  on fastfood");
    System.out.println("\n Your Total spent ammount is : "+((coffeeAmount*coffeePrice)+(foodAmount*foodPrice)));
    
    sc.close();
}
    
}
