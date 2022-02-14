import java.util.Scanner;
public class FlowerCounter {
public static void main(String[] args)
{ 
    String[] flowers = {"Petunia", "Pansy", "Rose", "Violet", "Carnation"};
    double[] price = {.50, .75, 50000, .50, .80};
    double cost = 0;
    Scanner keyBoard = new Scanner(System.in);
    System.out.println("CELEBRATE YOUR VELENTINE ");
    System.out.println("What kind of flower would you " +
    "like to purchase? \nPetunia, Pansy, Rose," +" Violet, or Carnation?");
    String index = keyBoard.nextLine();
    System.out.println("How many " + index +"s" + " would you like?");
    int count = keyBoard.nextInt();
    if (index.equals("Petunia") || index.equals("petunia"))
    cost = (double)price[0] * count;
    else if (index.equals("Pansy") || index.equals("pansy"))
    cost = (double)price[1] * count;
    else if (index.equals("Rose") || index.equals("rose"))
    cost = (double)price[2] * count;
    else if (index.equals("Violet") || index.equals("violet"))
    cost = (double)price[3] * count;
    else if (index.equals("Carnation") || index.equals("carnation"))
    cost = (double)price[4] * count;
    else 
    System.out.println("wrong flower");
    System.out.println("The cost for " + count+ " "  +  index  + " is " + cost);            
}

}