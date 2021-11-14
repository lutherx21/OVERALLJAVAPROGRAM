public class lk {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int kilobyte =  kiloBytes / 1024 ;
        int remaining = (kiloBytes % 1024);
        if(kiloBytes < 0  ){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kiloBytes + " KB = " + kilobyte + " MB" + " and " + remaining + " KB" );
        }
    }
}
