public class newc {
    public static void main(String[] args) {
        boolean vars = news(3.0, 3.0);
        System.out.println(vars);
    }

    public static boolean news(double firstnumber, double secondnumber ){

        double firstNumbers = firstnumber;
        double secondnumbers = secondnumber;

        if ( (int) (firstNumbers * 1000) == (int) (secondnumber * 1000) ){
            return true;
        }
        else {
            return false;
        }
    }

}
