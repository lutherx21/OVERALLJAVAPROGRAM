public class IntEqualityPrinter {
    public static void main(String[] args) {
        printEqual(1,2,1);

    }
    public static void printEqual(int First_number , int Second_number , int Third_number){
        if((First_number < 0) || (Second_number <0) || (Third_number <0)){
            System.out.println("Invalid Value");
        }else if((First_number == Second_number) && (First_number == Third_number)){
            System.out.println("All numbers are equal");

        }else if(First_number != Second_number && First_number != Third_number && Second_number != Third_number){
            System.out.println("All numbers are different");

        }else {
            System.out.println("Neither all are equal or different");

        }

    }
}
// System.out.println("Neither all are equal or different");
