package com.company;

public class Main {

    public static void main(String[] args) {
//        byte mybytevalue = 50;
//        short myshortvalue = 70;
//        int myint = 100 ;
//        long mylong = 50_000L ;
//        int myTotal = mybytevalue + myshortvalue + myint;
//        System.out.println(mylong + (myTotal *10));

        byte mybytevalue = 10;
        short shortvalue = 10;
        int myintvalue = 50 ;

        long longtotal = 50_000L + 10l +(mybytevalue + shortvalue + myintvalue);
        System.out.println(longtotal);
        short shorttotal= (short) (1000 + 10 +(mybytevalue + shortvalue + myintvalue));
        System.out.println(shorttotal);
    }
}
