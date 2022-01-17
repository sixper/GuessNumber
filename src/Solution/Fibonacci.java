package Solution;

import java.util.*;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter nth element to create fibonacci series : ");
        int number = input.nextInt();


        for(int i = 1; i <= number; i++){

            System.out.print(fibonacci(i) + " ");

        }





    }


    public static int fibonacci(int x){

        if(x > 2){

            return fibonacci(x - 1) + fibonacci(x - 2);

        }else{

            return 1;

        }


    }











}
