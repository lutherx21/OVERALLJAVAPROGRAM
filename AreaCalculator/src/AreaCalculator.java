public class AreaCalculator {
    public static void main(String[] args) {

        double areas = area(5.0);
        System.out.println(areas);
        double rectanglecall = area(-1.0,4.0);
        System.out.println(rectanglecall);

    }
    public static double area(double radius){
        if(radius <0){
            return -1.0;

        }
        double circle = (radius * radius) * Math.PI;
        return circle;


    }
    public static double area(double x , double y){
        if(x < 0 || y< 0 ){
            return - 1.0;

        }
        double RectangleTotal = (x * y);
        return RectangleTotal;

    }
}
