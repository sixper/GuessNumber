package Solution;

import java.sql.SQLOutput;
import java.util.*;

public class Fibonacci {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci dizisi için eleman sayısını giriniz: ");
        int fib = input.nextInt();


        for(int i = 1; i <= fib; i++){

            int number = fibonacci(i);
            System.out.print(number + " ");

        }






    }


    public static int fibonacci(int element){

        int value = 0;


        if(element > 2){

            value = fibonacci(element - 1) + fibonacci(element - 2);

        }else{

            return 1;

        }

        return value;
    }



}
