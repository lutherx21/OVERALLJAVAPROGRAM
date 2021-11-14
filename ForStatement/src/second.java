public class second {
    public static void main(String[] args) {
//        System.out.println(isPrime(1));

        int count = 0;
        for(int i= 10; i<50; i++){
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number.");
                if (count == 3){
                    System.out.println("Exiting for loop. ");
                    break;

                }
            }

        }


    }
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for (int i=2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
//public static boolean isPrime(int n) {
//
//    if(n == 1) {
//        return false;
//    }
//
//    for(int i=2; i <= n/2; i++) {
////        System.out.println("Looping " +i);
//        if(n % i == 0) {
//            return false;
//        }
//    }
//
//    return true;
//
//    }


}
//    public static boolean isPrime(int n){
//        if(n == 1){
//            return false;
//        }
//        for (int i = 2; i <= n/2; i++){
//            if(n %1 == 0){
//                return false;
//            }
//        }
//        return true;
//    }