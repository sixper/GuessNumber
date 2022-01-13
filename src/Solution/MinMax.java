package Solution;

import java.sql.SQLOutput;
import java.util.*;

public class MinMax {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int count = input.nextInt();

        int max = 0;
        int min = 0;


        for(int i = 1; i <= count; i++){

            System.out.print(i + ". Sayıyı giriniz: ");
            int value = input.nextInt();

            if(i == 1){

                max = value;
                min = max;

            }

            if(value > max)
                max = value;
            else if(value < min)
                min = value;

        }


        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);


    }



}
