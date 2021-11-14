public class DecimalComparator {
    public static void main(String[] args) {
       boolean equal =  areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(equal);

    }

   public static boolean areEqualByThreeDecimalPlaces(double firstnumber, double secondnumber){
     double first = firstnumber;
     first = first;
     double second = secondnumber;
     second = second ;



//       int firstnum = (int) firstnumber * 1000;
//        int secondnum =(int) secondnumber * 1000;
        if((int)(first * 1000)== (int)(second * 1000)){
//            System.out.println("True");
            return true;

        }
        else {
//           System.out.println("false");
            return false;
       }
////
////
   }
////public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
////    int a = (int) one * 1000;
////    int b = (int) two * 1000;
////
////    if(a == b){
////        System.out.println(true);
////        return true;
////    }
////    else
////
////        System.out.println(false);
////    return false;
////    }


        }

        ////notes
//        public class DecimalComparator{
//            public static boolean areEqualByThreeDecimalPlaces(double firstnumber, double secondnumber){
//                double first = firstnumber;
//                double second = secondnumber;
//
//
////       int firstnum = (int) firstnumber * 1000;
////        int secondnum =(int) secondnumber * 1000;
//                if((int)(first * 1000)== (int)(second * 1000)){
////            System.out.println("True");
//                    return true;
//
//                }
//                else {
////           System.out.println("false");
//                    return false;
//                }
//////
//////
//            }
//
//        }