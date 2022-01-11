package Solution;

import java.sql.SQLOutput;
import java.util.*;

public class DiamondPattern {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int n = input.nextInt();

        for (int i = 0; i < n ; i++) {

            for(int j = 0; j < n - i; j++){

                System.out.print(" ");

            }

            for(int j = 0; j < i * 2 + 1; j++){

                System.out.print("*");

            }

            System.out.println();

        }

        for (int i = n - 1; i > 0 ; i--) {

            for(int j = i; j <= n; j++){

                System.out.print(" ");

            }

            for(int j = 0; j < (i - 1) * 2 + 1; j++){

                System.out.print("*");

            }

            System.out.println();

        }


    }



}
