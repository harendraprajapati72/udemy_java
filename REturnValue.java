

class REturnValue{
    public static void main(String[] args) {
        double measure1=mesureRectangle(10, 20);
        double measure2=mesureRectangle(4.5, 8.3);
        double measure3=mesureRectangle(2.5, 5.3); 
        stringPrinter(10, 20, measure1);
        stringPrinter(4.5, 8.3, measure2);
        stringPrinter(2.5, 5.3, measure3);
        
    }
    public static double mesureRectangle(double length, double width){
        double area=(length*width);
        return area;


    }
    public static void stringPrinter(double length,double width,double area){
        System.out.println("\n The area of rectangle with length"+length+"and width"+width+"is equal to :"+area+"\n");

    }
}