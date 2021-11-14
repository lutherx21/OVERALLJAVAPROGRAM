public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        boolean leap = isLeapYear(2020);
        System.out.println(leap);
        int getday = getDaysInMonth(2,2018);
        System.out.println(getday);

    }

    public static boolean isLeapYear(int year){

                if (year <1 && year > 9999){
                    return false;
                }else if ((year % 4 == 0 && year % 100 != 0) && (year >= 1 && year <= 9999) || year % 400 == 0 && (year >= 1 && year <= 9999)){
                    return true;
                }else{
                    return false;
                }
//        return (year > 1 && year < 9999)
//                && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        }
        public static int getDaysInMonth(int month , int year){
        int isleap ;

//            if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
//                return -1;
//
//            } switch (month){
////                case 1:
////                case 3:
////                case 5:
////                case 7:
////                case 8:
////                case 10:
////                case 12:
////                    return 31;
//
//                case 2:
//                    System.out.println( (isLeapYear(year)) ? "29" : "28" );
//                    break;
//
//                case 4:
//                case 6:
//                case 9:
//                case 11:
//                    return 30;
//
//                default:
//                    return 31;
//
//            }
//
//        }
            if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
                return -1;
            }
//            if (isLeapYear(year) && month == 2) {
//                return 29;
//            }

            switch (month) {
                case 11:
                case 4:
                case 6:
                case 9:
                    return 30;
                case 2:
                    isleap = isLeapYear(year) ? 29 : 28;
                    return isleap;
                default:
                    return 31;
            }

        }
    }
//https://github.com/jsquared21/Intro-to-Java-Programming/blob/master/Exercise_03/Exercise_03_11/Exercise_03_11.java
//   System.out.println( (isleapYear(year)) ? "29" : "28" );
