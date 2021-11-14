public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(-525600);

    }
    public static void printYearsAndDays(long minutes){
        if(minutes < 0 ){
            System.out.println("Invalid Value");
        }else{
            long converttoyears = minutes / 525600;
            long minutesRemaining = (minutes - (converttoyears * 525600));
            long daysRemaining = minutesRemaining / 1440;
            System.out.println(minutes + " min = " + converttoyears + " y " + " and "+ daysRemaining + " d");

        }

    }
}
