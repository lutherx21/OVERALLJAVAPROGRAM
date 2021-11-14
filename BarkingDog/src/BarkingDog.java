public class BarkingDog {
    public static void main(String[] args) {
//        shouldWakeUp(true, 1);
//        boolean should = shouldWakeUp(true,-1);
//        System.out.println(should);
        boolean should = shouldWakeUp(true ,4);
        System.out.println(should);

    }
    public static boolean shouldWakeUp(boolean barking , int hourOfDay){
        if ( hourOfDay < 0 || hourOfDay >23){
            return false;

      }if(barking == true && hourOfDay < 8 || hourOfDay >22){
            return true;

      }else{
          return false;
      }


    }

//    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
//
//        if (hourOfDay <0 || hourOfDay >23){
//            return false;
//        }
//
//        if (barking == true && hourOfDay <8 || hourOfDay >22){
//            return true;
//        }else{
//            return false;
//        }
//    }
}
//if(barking == true && hourOfDay < 8 || hourOfDay >22){
//        return true;
//
//        if ( hourOfDay < 0 || hourOfDay >23){
//        return false;
