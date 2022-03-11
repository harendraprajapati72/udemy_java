public class WhileLoop {
    public static void main(String[] args) {
        // WhileLoop();
        WhileLoop1();
        int num=25;
         while(num<30){
             System.out.println(num);
             num++;
         }
    }
    public static void WhileLoop(){
        double choice=0.01;
        double guess =0.99;
        while(guess>choice){
            System.out.println("HI , in the loop");
        }


    }

    public static void WhileLoop1(){
        double choice=0.01;
        double guess =0.99;
        while(guess>choice){
            guess=Math.random();
            System.out.println(guess);
        }

}
}
