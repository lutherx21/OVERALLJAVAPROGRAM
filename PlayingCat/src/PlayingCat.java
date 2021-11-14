public class PlayingCat {
    public static void main(String[] args) {

        boolean playing = isCatPlaying(false,33);
        System.out.println(playing);

    }
    public static boolean isCatPlaying(boolean summer , int temperature) {
        if (summer == true) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            }else{
                return false;
            }
        } else{
            if (temperature >=25 && temperature <=35){
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
