class Parameters1 {
    public static void main(String[] args) {
        mesureRectangle(10, 20);
        mesureRectangle(4.5, 8.3);
        mesureRectangle(2.5, 5.3);
        mesureRectangle(8.5, 3.3);
    }
    public static double mesureRectangle(double length, double width){
        double area=(length*width);
        return area;

    }
}