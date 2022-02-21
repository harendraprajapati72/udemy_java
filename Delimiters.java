import java.util.Scanner;

class Delimiters {
       public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two integers(on the same line ) ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Enter two big integers(on the same line ) ");
        long bignum1=sc.nextLong();
        long bignum2=sc.nextLong();
        System.out.println("Enter two decimal (on the same line ) ");
        double decimal1=sc.nextDouble();
        double decimal2=sc.nextDouble();
        System.out.println("Enter two text values(on the same line ) ");
        String text1=sc.nextLine();
        String text2=sc.nextLine();
        sc.close();
        System.out.println("\tIntegers  "+num1+" "+num2);
        System.out.println("\tBIg Integers  "+bignum1+" "+bignum2);
        System.out.println("\tDecimals "+decimal1+" "+decimal2);
        System.out.println("\tText  "+text1+" "+text2);
        
    }
}