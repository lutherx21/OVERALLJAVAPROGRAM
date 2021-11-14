public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));

    }
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit;
        int num = number;
        while(num != 0) {
            lastDigit = 0;
            lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
        if (number == reverse){
            return true;
        }else{
            return false;
        }
    }
//public static boolean isPalindrome(int number) {
//        int reverse = 0;
//        int lastDigit;
//        int num = number;
//        while (num != 0) {
//            lastDigit = 0;
//            lastDigit = num % 10;
//            reverse *= 10;
//            reverse += lastDigit;
//            num /= 10;
//        }
//        if (reverse == number) {
//            return true;
//        } else
//            return false;
//    }
}
