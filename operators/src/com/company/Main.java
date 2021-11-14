package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
//        int result = 2 + 1;
//        System.out.println("2 + 1 = " + result);
//        int previousResult = result;
//        System.out.println("Previous result = " + previousResult);
//        result = result -1 ;
//        System.out.println( "3 - 1 =  " + result);
//        result = result * 10 ;
//        System.out.println("2 * 10 = " + result);
//        result = result /5 ;
//        System.out.println("20 /5 = " + result);
//        result = result % 3 ;
//        System.out.println("4 % 3 = " + result);
//        result++;
//        System.out.println("1 + 1 = " + result);
//
//        result--;
//        System.out.println("2 - 1 = " + result);
//        result += 2 ;
//        System.out.println("1 + 2 = " + result);
//        result *= 10  ;
//        System.out.println("3 * 10 = " + result);
//        result /= 3 ;
//        System.out.println("30 / 3 = " + result);
//
//        int topscore = 80;
//        if (topscore < 100 ){
//            System.out.println("You got a high score!! ");
//        }
//        int secondtopscore = 60;
//        if((topscore > secondtopscore) && (topscore <100)){
//            System.out.println("Greater than second topscore and less than 100... ");
//        }
//        if((topscore > 90) || (secondtopscore <= 90) ){
//            System.out.println("Either or noth of the conditions are true.");
//        }
//        boolean iscar = false;
//        if(iscar){
//            System.out.println("This is not supposed to happen! ");
//        }
//        boolean wascar = iscar ? true : false;
//        if(wascar) {
//            System.out.println("was car is true.");
//        }
        double Myfirstdoublenum = 20.00 ;
        double Myseconddoublenum = 80.00;
        Myfirstdoublenum = (Myfirstdoublenum + Myseconddoublenum )* 100;
        System.out.println(Myfirstdoublenum);
        double result = Myfirstdoublenum % 40.00;
        System.out.println(result);
        boolean iszero = (result == 0 ) ? true : false;
        System.out.println(iszero);
        if (iszero != true){
            System.out.println("Get some remainder");
        }




    }
}
