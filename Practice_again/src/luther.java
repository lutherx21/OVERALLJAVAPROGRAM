public class luther {
    public static void main(String[] args) {

        byte My_byte_number = 10;
        short My_short_number = 20;
        int My_int_number = 50;
        long My_long_number = 50_000;
        int My_Overall_total;
        int My_total_of_long_number;
        My_Overall_total = (My_byte_number + My_short_number + My_int_number) * 10;
        System.out.println(My_Overall_total);
        My_total_of_long_number  = (int)(My_long_number + My_Overall_total);
        System.out.println(My_total_of_long_number);

    }

}





