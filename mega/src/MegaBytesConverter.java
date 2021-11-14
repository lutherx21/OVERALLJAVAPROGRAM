public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int kilobyte =  kiloBytes / 1024 ;
        int remaining = (kiloBytes % 1024);
        if(kilobyte < 0  ){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kiloBytes + "KB = " + kilobyte + " MB" + " and " + remaining + " KB" );
        }
    }
}
