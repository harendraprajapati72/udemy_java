public class BreakAndContinue {
    public static void main(String[] args) {
        Continue();
        Break();
        
    }
    public static void Continue(){
        for(int i=0;i<=10;i++){
            if(i % 2!=0){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void Break(){
        for(int i=0;i<=10;i++){
            if(i % 2!=0){
                break;
            }
            System.out.println("\n"+i);
        }
    }
    
}
