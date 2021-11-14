package com.example.helloworld;


import java.util.Scanner;


public class HelloWorld {
    public static <string> void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the first number");
        int num1 = sc.nextInt();
        System.out.println("please enter the second number");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        int dif = num1-num2;
        int prod = num1*num2;
        int quotient = num1/num2;
        System.out.println("the sum is "+sum);
        System.out.println("the differecence is " + dif);
        System.out.println("the product is "+prod);
        System.out.println("the quotient is "+quotient);

        System.out.println("please enter number");
        int number = sc.nextInt();

        if (number == 3){
            System.out.println("number 3");
        }
        else if(number == 4){
            System.out.println("number 4");
        }
        else{
            System.out.println("this is not a number");
        }

        System.out.println("enter number");
        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("number 1");
                break;

            case 2:
                System.out.println("number 2");
                break;

            case 3:
                System.out.println("number 3");
                break;
            case 4:
                System.out.println("number 4");
                break;

            case 5:
                System.out.println("number 5");
                break;

            default:
                System.out.println("this is not a number");
                break;

        }

        System.out.println("enna number");
        int a = sc.nextInt();










    }


}
