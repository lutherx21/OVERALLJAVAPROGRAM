public class EqualSumChecker {
    public static void main(String[] args) {
        boolean equalsum = hasEqualSum(1,-1,0);
        System.out.println(equalsum);

    }
    public static boolean hasEqualSum(int number1 , int number2 , int number3){

        int total = number1 + number2;

        if(total == number3){
            return true;


        }else{
            return false;
        }


    }
}
