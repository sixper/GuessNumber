package Solution;

import java.sql.SQLOutput;
import java.util.*;

public class PrimesNumber1_100 {


    public static void main(String[] args) {


        System.out.println("1-100 arasındaki asal sayılar: \n");
        System.out.print("2 ");


        for(int i = 3; i <= 100; i++){

            if(isPrime(i))
                System.out.print(i + " ");

        }








    }


    public static boolean isPrime(int number){

        for(int i = 2; i <= number / 2; i++){

            if(number % i == 0)
                return false;

        }


        return true;
    }






}
