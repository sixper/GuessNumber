package Solution;

import java.util.*;

public class SumOfEvens {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int num;
        int total = 0;


        do{

            System.out.print("Sayı giriniz : ");
            num = input.nextInt();

            if(num % 4 == 0)
                total += num;

        }while(num % 2 != 1);

        System.out.println("\nÇift ve 4 e bölünen sayıların toplamı: " + total);











        input.close();

    }
}
