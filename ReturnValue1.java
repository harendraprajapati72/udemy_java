public class ReturnValue1 {

    public static void main(String[] args) {
        double measure1=mesureRectangle(-1, 20,"area");
        double measure2=mesureRectangle(4.5, 8.3 ,"perimeter");
        // double measure3=mesureRectangle(2.5, 5.3); 
        stringPrinter(10, 20, measure1,"area");
        stringPrinter(4.5, 8.3, measure2,"perimeter");
        // stringPrinter(2.5, 5.3, measure3);
        
    }
    public static double mesureRectangle(double length, double width,String option){
        if(length<0 || width<0){
            System.out.println("length or width can not be negative");
            System.exit(0);

        }

        switch(option){
            case "area ":return length * width;
            case "perimeter": return 2 * (length + width);
            default: return 404;
        }
        }
    public static void stringPrinter(double length,double width,double area, String option){
        System.out.println("\n The " +option+ " area of rectangle with length "+length+" and width "+width+" is equal to :"+area+"\n");

    }
}
    

