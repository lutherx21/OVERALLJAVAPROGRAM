public class LeapYear {
    public static void main(String[] args) {
        boolean leap = isLeapYear(-1024);
        System.out.println(leap);


    }
//    public static boolean isLeapYear(int year){
//        int leapCalculation =  year / 4;
//        int leapCalculation2 = year / 100;
//        int leapCalculation3 = year / 400;
//
//
//        if(year >= 1 && year <= 9999){
//
//
//           return true;
//
//        }
//        else{
//            return false;
//
//        }

    public static boolean isLeapYear(int year) {
//        if (year < 1 && year > 9999) {
//            return false;
//        } else if ((year % 4 == 0 && year % 100 != 0)  || year % 400 == 0 && (year >= 1 && year <= 9999)) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
        if (year < 1 && year > 9999) {
            return false;
        } else if ((year % 4 == 0 && year % 100 != 0) && (year >= 1 && year <= 9999) || year % 400 == 0 && (year >= 1 && year <= 9999)) {
            return true;
        } else {
            return false;
        }

    }
}
//}
