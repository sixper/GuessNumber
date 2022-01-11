package Solution;

import java.sql.SQLOutput;
import java.util.*;

public class PowerOf {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı : ");
        int base = input.nextInt();

        System.out.print("Üssü olacak sayı : ");
        int power = input.nextInt();

        int total = 1;


        for(int i = 1; i <= power; i++){

            total *= base;

        }

        System.out.println(base + " üzeri " + power + " = " + total);


    }



}
