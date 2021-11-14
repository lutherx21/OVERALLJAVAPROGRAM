public class trys {
    public static void main(String[] args) {

    }
    public static boolean isLeapYear(int year){
        if (year <1 && year > 9999){
            return false;
        }else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 && (year >= 1 &&year <=9999) ){
            return true;
        }else{
            return false;
        }
    }
    public static int getDaysinMonth(int month , int year){

        if(month <1 || month>12){
            return -1;

        }if (year <1 || year >9999){
            return -1;

        } switch (month){
            case 1:
                System.out.println("31");
                break;

            case 2:
                System.out.println( (isLeapYear(year)) ? "29":"28") ;

                break;

            case 3: System.out.println("31");

                break;

            case 4: System.out.println("30");
                break;

            case 5: System.out.println(
                    "May " + year + " had 31 days");
                break;

            case 6: System.out.println(
                    "June " + year + " had 30 days");
                break;

            case 7:
                System.out.println("July " + year + " had 31 days");
                break;
            case 8:
                System.out.println(
                        "August " + year + " had 31 days");
                break;

            case 9:
                System.out.println(
                        "September " + year + " had 30 days");
                break;
            case 10:
                System.out.println(
                        "October " + year + " had 31 days");
                break;
            case 11: System.out.println(
                    "November " + year + " had 30 days");
                break;

            case 12: System.out.println(
                    "December " + year + " had 31 days");



        }
        return -1;

    }

}

