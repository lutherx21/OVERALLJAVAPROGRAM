public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println("The sum of first and last digits are : " + sumFirstAndLastDigit(123456789));

    }
    public static int sumFirstAndLastDigit(int number){
        int num = number;
        if (num < 0){
            return -1;
        }
        int lastDigit = num % 10;
        int firstDigit = 0;
        while(num >0){
            firstDigit = num %10;
            num /= 10;
        }
        return lastDigit + firstDigit;
    }
}
