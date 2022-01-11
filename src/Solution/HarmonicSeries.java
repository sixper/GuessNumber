package Solution;

import java.sql.SQLOutput;
import java.util.*;

public class HarmonicSeries {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        int number = input.nextInt();

        double total = 0;


        for(int i = 1; i <= number; i++){

            total += (double)i/number;

        }


        System.out.println("\n" + number + " sayısının harmonik dizi toplamı: " + total);


    }



}
