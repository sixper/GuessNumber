package Solution;

import java.sql.SQLOutput;
import java.util.*;

public class ReverseTriangle {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int base = input.nextInt();


        for(int i = 1; i <= base; i++){

            for(int j = 0; j < i; j++){

                System.out.print(" ");

            }

            for(int z = 0; z < (base - i) * 2 + 1; z++){

                System.out.print("*");

            }

            System.out.println("");

        }







    }






}
